package com.rongzi.controller;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

// 表示 XML 文档的根元素
@XmlRootElement
public class User {

    private int userid;
    private String loginname;
    private String password;
    private String username;

    public User(){
        super();
    }

    public int getUserid() {
        return userid;
    }

    // 该属性作为 xml 的 element
    @XmlElement
    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getLoginname(){
        return loginname;
    }

    @XmlElement
    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPassword() {
        return password;
    }

    @XmlElement
    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    @XmlElement
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User [userid="+userid+", loginname="+loginname+", username="+username+"]";
    }
}
