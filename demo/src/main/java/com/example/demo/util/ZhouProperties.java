package com.example.demo.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by zhou on 2017/7/4.
 */
@Component
@ConfigurationProperties("com.example")
public class ZhouProperties {
//    @Value("${com.example.title}")
    private String title;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

