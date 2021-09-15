package com.udemy.spring.springselenium;
import org.springframework.stereotype.Component;
@Component
public class Address {
    private String street;
    public Address(){
        this.street = "123 street";
    }
    public String getStreet() {
        return street;
    }
}
