package com.rongzi.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.springframework.web.servlet.support.RequestContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

@Controller
@RequestMapping("/user2")
public class User2Controller {

    private static List<User> userList;
    private static final Log logger = LogFactory.getLog(User2Controller.class);

    public User2Controller(){
        super();
        userList = new ArrayList<User>();
    }

    // http://localhost:8080/user2/registerForm
    @RequestMapping(value = "/registerForm", method = RequestMethod.GET)
    public String registerForm(){
        logger.info("GET registerForm");
        return "registerForm";
    }

    // for register button
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@RequestParam("loginname") String loginname,
                           @RequestParam("password") String password,
                           @RequestParam("username") String username){

        logger.info("POST register");

        Random random = new Random();

        User user = new User();
        user.setUserid(random.nextInt(1000));
        user.setLoginname(loginname);
        user.setPassword(password);
        user.setUsername(username);

        userList.add(user);

        return "loginForm";
    }

    // for login
    // GET http://localhost:8080/user2/login?loginname=admin&password=123
    @RequestMapping(value = "/login")
    public String login(@RequestParam("loginname") String loginname,
                        @RequestParam("password") String password,
                        Model model,
                        HttpServletRequest request){
        logger.info(" login");
        for (User user : userList){
            if (user.getLoginname().equals(loginname) && user.getPassword().equals(password)){
                model.addAttribute("user", user);
                return "welcome";
            }
        }

        if (loginname != null && loginname.equals("admin") && password !=null && password.equals("123")){
            RequestContext requestContext = new RequestContext(request);
            String username = requestContext.getMessage("username");
            User user = new User(loginname, password, username);
            model.addAttribute("user", user);
            return "welcome";
        }

        return "loginForm";
    }

    // http://localhost:8080/user2/getuser/264
    @RequestMapping("/getuser/{userid}")
    public String getUser(@PathVariable Integer userid, Model model){
        logger.info("user id : " + userid);

        for (User user : userList) {
            if (user.getUserid() == userid){
                model.addAttribute("user", user);
                break;
            }
        }

        return "welcome";
    }

    // http://localhost:8080/user2/loginForm
    @RequestMapping(value = "/loginForm", method = RequestMethod.GET)
    public String loginForm(){
        logger.info("GET loginForm");
        return "loginForm2";
    }

    // http://localhost:8080/user2/loginForm2
    @RequestMapping(value = "/loginForm2", method = RequestMethod.GET)
    public String loginForm2(String request_locale, HttpServletRequest request){
        logger.info("request_locale = " + request_locale);

        if (request_locale !=null){
            if (request_locale.equals("zh_CN")){
                Locale locale = new Locale("zh", "CN");
               HttpSession session = request.getSession();
                request.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, locale);
            }
            else if (request_locale.equals("en_US")){
                Locale locale = new Locale("en", "US");
                request.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, locale);
            }
            else {
                request.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, LocaleContextHolder.getLocale());
            }
        }
        else {
            request.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, LocaleContextHolder.getLocale());
        }

        return "loginForm3";
    }
}
