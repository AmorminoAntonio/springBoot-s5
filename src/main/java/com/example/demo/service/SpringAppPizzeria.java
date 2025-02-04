package com.example.demo.service;


import com.example.demo.CartaMenù;
import com.example.demo.configuration.ConfigPizzeria;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAppPizzeria {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(ConfigPizzeria.class);

        CartaMenù appMenu = appContext.getBean(CartaMenù.class);
        appMenu.stampaMenu();


        appContext.close();
    }
}

