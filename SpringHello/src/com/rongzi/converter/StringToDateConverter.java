package com.rongzi.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String date) {

        SimpleDateFormat dateFormat = new SimpleDateFormat(this.datePattern);

        try {
            return dateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();

            System.out.println("日期转换失败");
            return null;
        }
    }

    private String datePattern = "yyyy-MM-dd";

    public void setDatePattern(String datePattern) {
        this.datePattern = datePattern;
    }
}
