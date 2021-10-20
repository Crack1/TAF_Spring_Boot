package com.udemy.spring.springselenium.config;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Lazy
@Configuration
public class WebDriverWaitConfig {

    @Value("${default.timeout:30}")
    private int timeout;

    @Bean
    public org.openqa.selenium.support.ui.WebDriverWait webDriverWait(WebDriver driver){
        return new org.openqa.selenium.support.ui.WebDriverWait(driver, this.timeout);
    }
}
