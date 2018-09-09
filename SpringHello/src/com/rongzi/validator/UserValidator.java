package com.rongzi.validator;

import com.rongzi.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Repository("userValidator")
public class UserValidator implements Validator {
    //该校验器能够对 aClass 类型的对象进行校验
    @Override
    public boolean supports(Class<?> aClass) {
        //判断一个类Class1和另一个类Class2是否相同或是另一个类的超类或接口 : https://blog.csdn.net/kjfcpua/article/details/7045207
        return User.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        //rejectIfEmpty 表示：如果 loginname 为 null 或 空字符串时，拒绝通过验证
        //errorCode 为空时，使用field作为默认值，这时会使用本地化文件中设置的字符串，而不是使用defaultMessage中的字符串
        ValidationUtils.rejectIfEmpty(errors, "loginname", "login_name", "登录名不能为空");
        ValidationUtils.rejectIfEmpty(errors, "password", "password_", "密码不能为空");

        User user = (User) o;
        if (user.getLoginname().length() > 10){
            //使用 rejectValue 方法绝对验证
            errors.rejectValue("loginname","login_name","用户名不能超时10个字符");
        }
        if (user.getPassword() !=null && !user.getPassword().equals("") && user.getPassword().length()< 6){
            errors.rejectValue("password", "password_", "密码不能小于6位");
        }
    }
}
