package com.example.demo;


import com.example.demo.configClass.ConfigPizzeria;
import com.example.demo.configClass.Menù;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoSpringApplication {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(ConfigPizzeria.class);


        Menù appMenu = appContext.getBean(Menù.class);
        appMenu.stampaMenu();

        appContext.close();
    }
}

