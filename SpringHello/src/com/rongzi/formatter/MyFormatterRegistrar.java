package com.rongzi.formatter;

import org.springframework.format.FormatterRegistrar;
import org.springframework.format.FormatterRegistry;

public class MyFormatterRegistrar implements FormatterRegistrar {

    private DateFormatter dateFormatter;

    public void setDateFormatter(DateFormatter dateFormatter) {
        this.dateFormatter = dateFormatter;
    }

    @Override
    public void registerFormatters(FormatterRegistry formatterRegistry) {
        formatterRegistry.addFormatter(dateFormatter);
    }
}
