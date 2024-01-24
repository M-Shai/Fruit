package com.abc.fruit;

import java.util.*;

import handling.*;


/**
 * Self running thread class demo
 * Visitor design pattern demo
 * Creates multiple instances of items
 * Uses visitor for work
 */
public class FruitDemo {

    public static void main(String[] args) {

    ArrayList<Produce> produce_ar = new ArrayList<>();
    Handling visitor = new Handling();
    String fruits[] = {"apple", "orange", "watermelon", "lemon", "cherry"};
    String fruits2[] = {"banana", "grape"};
    String vegie[] = {"brocoli", "celery"};

        for(String fruit: fruits) {
            System.out.println("Creating a new fruit: " + fruit);
            produce_ar.add(new Fruit(fruit, visitor));
        }
        System.out.println("Finished creating all fruits");
        for(String veg: vegie) {
            System.out.println("Creating a new vegetable: " + veg);
            produce_ar.add(new Vegetable(veg, visitor));
        }
        System.out.println("Finished creating all vegetables");
        for(String fruit: fruits2) {
            System.out.println("Creating a new fruit: " + fruit);
            produce_ar.add(new Fruit(fruit, visitor));
        }
        System.out.println("Finished creating all fruits2");
    }
}
