package com.rongzi.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.InputStream;

@Controller
@RequestMapping("/user")
public class UserController {

    private static final Log logger = LogFactory.getLog(BookController.class);

    //POST http://localhost:8080/user/sendxml
    @RequestMapping(value = "/sendxml", method = RequestMethod.POST)
    public void sendXml(@RequestBody User user){

        logger.info(user);

        logger.info("XML 接收成功");

    }

    // http://localhost:8080/user/readxml
    // 区分大小写
    @RequestMapping(value = "/readxml")
    public @ResponseBody User readXml() throws JAXBException {

//        JAXBContext context = JAXBContext.newInstance(User.class);
//
//        Unmarshaller unmarshaller = context.createUnmarshaller();
//
//        InputStream inputStream = this.getClass().getResourceAsStream("/user.xml");
//
//        User user = (User) unmarshaller.unmarshal(inputStream);

        User user = new User();
        user.setLoginname("howard.hou");
        user.setPassword("12345678");
        user.setUserid(1000);
        user.setUsername("Hou Dongdong");

        logger.info(user);
        return user;
    }
}
