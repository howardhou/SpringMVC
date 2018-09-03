package com.rongzi.entity;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import java.util.Date;

public class Formatter {
    //日期
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    //数字
    @NumberFormat(style = NumberFormat.Style.NUMBER, pattern = "#,###")
    private int total;

    //百分比
    @NumberFormat(style = NumberFormat.Style.PERCENT)
    private double discount;

    //货币
    @NumberFormat(style = NumberFormat.Style.CURRENCY)
    private double money;

    public Date getBirthday() {
        return birthday;
    }

    public double getDiscount() {
        return discount;
    }

    public double getMoney() {
        return money;
    }

    public int getTotal() {
        return total;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
