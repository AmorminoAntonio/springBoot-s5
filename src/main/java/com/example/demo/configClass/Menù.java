package com.example.demo.configClass;


import lombok.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter

public class Menù {
    private List<Pizzas> pizze;
    private List<Drinks> bevande;
    private List<Toppings> toppings;


    public void stampaMenu() {
        System.out.println("Menù Pizzeria:");

        System.out.println("\nPizzas:");
        for (Pizzas pizza : pizze) {
            System.out.println(pizza);
        }

        System.out.println("\nToppings");
        for (Toppings topping : toppings) {
            System.out.println(topping);
        }

        System.out.println("\nDrinks:");
        for (Drinks drink : bevande) {
            System.out.println(drink);
        }
    }
}

