package com.udemy.spring.springselenium;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Television {

    @Value("${tv.name:sony}")
    private String name;

    public Television(){
        System.out.println("Inside Contructor: " + this.name);
    }

    @PostConstruct
    private void init(){
        System.out.println("Inside the init: " + this.name);
        System.out.println("TV is turned on...");
    }

    public void playMovie()  {
        for (int i = 0; i < 6; i++) {
            System.out.println("Playing scene: " + i);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public void turnOff(){
        System.out.println("Tv us turned off....");
    }
}
