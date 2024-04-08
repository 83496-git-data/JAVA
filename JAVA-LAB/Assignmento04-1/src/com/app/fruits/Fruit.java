package com.app.fruits;

public class Fruit {
    protected String name;
    protected String color;
    protected double weight;
    protected boolean isFresh;

    public Fruit(String name, String color, double weight) 
    {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.isFresh = true;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Color: " + color + ", Weight: " + weight;
    }

    public String taste() {
        return "No specific taste";
    }
}
