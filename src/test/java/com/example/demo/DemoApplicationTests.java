package com.example.demo;

import com.example.demo.configuration.MenuConfig;
import com.example.demo.model.Article;
import com.example.demo.model.Menu;
import com.example.demo.model.Pizza;
import com.example.demo.service.OrdersService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    DemoApplicationTests tests;

    @Autowired
    private MenuConfig pizza;

    @Test
    public void checkIsEmptyMenu() {
    }

}