package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAppPizzeria {
    public static void main(String[] args) {

        SpringApplication.run(SpringAppPizzeria.class, args);
       /* AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(ConfigPizzeria.class);

        CartaMenù appMenu = appContext.getBean(CartaMenù.class);
        appMenu.stampaMenu();


        appContext.close();*/
    }
}

