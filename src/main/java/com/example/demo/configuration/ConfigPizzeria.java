package com.example.demo.configuration;


import com.example.demo.CartaMenù;
import com.example.demo.enumerati.StatoOrdine;
import com.example.demo.enumerati.StatoTavolo;
import com.example.demo.model.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.time.LocalTime;
import java.util.Arrays;
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
    public PizzasXL margheritaXl() {
        return new PizzasXL("margherita XL", 1155, 6.0);
    }

    @Bean
    @Scope("prototype")
    public Pizzas napoletanaXl() {
        return new PizzasXL("napoletana XL", 1450, 7.0);
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
    public CartaMenù menu() {
        return new CartaMenù(List.of(margherita(), napoletana(), margheritaXl(), napoletanaXl()), List.of(cocaCola(), acqua()), List.of(salame(), ananas(), cipolla(), formaggio(), funghi(), prosciutto()));
    }

    @Bean
    @Scope("prototype")
    public Tavolo t1() {
        return new Tavolo(22, 5, StatoTavolo.LIBERO);
    }

    @Bean
    @Scope("prototype")
    public Tavolo t2() {
        return new Tavolo(15, 4, StatoTavolo.LIBERO);
    }

    @Bean
    @Scope("prototype")
    public Tavolo t3() {
        return new Tavolo(2, 4, StatoTavolo.LIBERO);
    }

    @Bean
    @Scope("prototype")
    public Tavolo t4() {
        return new Tavolo(18, 6, StatoTavolo.LIBERO);
    }

    @Bean
    @Scope("prototype")
    public Tavolo t5() {
        return new Tavolo(29, 10, StatoTavolo.LIBERO);
    }

    @Bean
    @Scope("prototype")
    public Tavolo t6() {
        return new Tavolo(22, 4, StatoTavolo.LIBERO);
    }

    @Bean
    @Scope("prototype")
    public Ordinazione o1() {
        CartaMenù prodotti = (CartaMenù) Arrays.asList(
                new Pizzas("diavola", 1250, 11.0),
                new Pizzas("diavola", 1250, 11.0),
                new Pizzas("diavola", 1250, 11.0),
                new Pizzas("diavola", 1250, 11.0),
                new Pizzas("diavola", 1250, 11.0),
                new Drinks("birramedia bionda", 250, 6.5),
                new Drinks("birramedia bionda", 250, 6.5),
                new Drinks("birramedia bionda", 250, 6.5),
                new Drinks("birramedia bionda", 250, 6.5),
                new Drinks("birramedia bionda", 250, 6.5)
        );
        System.out.println(prodotti);
        return new Ordinazione();
    }
}

