package com.example.demo.configClass;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString

public class PizzasXL extends Pizzas {
    private String nome;
    private int calorie;
    private double prezzoXL = 3.5;
}
