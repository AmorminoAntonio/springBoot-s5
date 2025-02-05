package com.example.demo.model;


public class Drink extends Article {

    private String name;

    public Drink(int calories, double price, String name) {
        super(calories, price);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + "\n" +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}

