package com.example.demo.configClass;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.List;

@Configuration
public class ConfigPizzeria {

    @Bean
    @Scope("prototype")
    public Toppings prosciutto() {
        return new Toppings("prosciutto", 35, 0.99);
    }

    @Bean
    @Scope("prototype")
    public Toppings ananas() {
        return new Toppings("ananas", 24, 0.79);
    }

    @Bean
    @Scope("prototype")
    public Toppings funghi() {
        return new Toppings("funghi", 72, 1.29);
    }

    @Bean
    @Scope("prototype")
    public Toppings salame() {
        return new Toppings("salame", 86, 0.99);
    }

    @Bean
    @Scope("prototype")
    public Toppings formaggio() {
        return new Toppings("formaggio", 92, 0.75);
    }

    @Bean
    @Scope("prototype")
    public Toppings cipolla() {
        return new Toppings("cipolla", 22, 0.57);
    }

    @Bean
    @Scope("prototype")
    public Pizzas margherita() {
        Pizzas pizza = new Pizzas("Margherita", 1089, 6.0);
        return pizza;
    }

    @Bean
    @Scope("prototype")
    public Pizzas napoletana() {
        Pizzas pizza = new Pizzas("Napoletana", 1320, 7.0);
        return pizza;
    }

    @Bean
    @Scope("prototype")
    public Pizzas margheritaXl() {
        return new PizzasXL("Margherita XL", 1240, margherita().getPrezzo() + 3.0);
    }

    @Bean
    @Scope("prototype")
    public Pizzas napoletanaXl() {
        return new PizzasXL("Napoletana XL", 1227, napoletana().getPrezzo() + 3.0);
    }

    @Bean
    @Scope("prototype")
    public Drinks cocaCola() {
        return new Drinks("Coca-Cola", 172, 2.5);
    }

    @Bean
    @Scope("prototype")
    public Drinks acqua() {
        return new Drinks("Acqua", 0, 1.0);
    }


    @Bean
    public Menù menu() {
        return new Menù(List.of(margherita(), napoletana(), margheritaXl(), napoletanaXl()), List.of(cocaCola(), acqua()), List.of(salame(), ananas(), cipolla(), formaggio(), funghi(), prosciutto()));
    }
}

