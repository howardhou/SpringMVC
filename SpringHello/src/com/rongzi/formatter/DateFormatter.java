package com.rongzi.formatter;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatter implements Formatter<Date> {

    private String datePattern;
    private SimpleDateFormat dateFormat;

    public DateFormatter(String datePattern){
        this.datePattern = datePattern;
        this.dateFormat = new SimpleDateFormat(datePattern);
    }

//    使用指定的Locale 将String 解析成目标 T 类型
    @Override
    public Date parse(String s, Locale locale) throws ParseException {
        return dateFormat.parse(s);
    }

    // 返回 T 类型的字符串形式
    @Override
    public String print(Date date, Locale locale) {
        return dateFormat.format(date);
    }
}
