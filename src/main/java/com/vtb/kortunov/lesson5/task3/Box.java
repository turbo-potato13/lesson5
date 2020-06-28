package com.vtb.kortunov.lesson5.task3;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private final ArrayList<T> fruits;

    public Box(ArrayList<T> fruits) {
        this.fruits = fruits;
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public T getFruit(int i) {
        T fruit;
        fruit = fruits.get(i);
        return fruit;
    }

    public float getWeight() {
        float sum = 0f;
        for (T fruit : fruits) {
            sum += fruit.getWeight();
        }
        return sum;
    }

    public boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }

    public void sprinkle(Box<T> box) {
        for (int i = 0; i < fruits.size(); i++) {
            box.addFruit(fruits.get(i));
        }
    }
}
