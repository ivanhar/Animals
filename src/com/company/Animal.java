package com.company;

public abstract class Animal {

    private int age;


    public String MakeSound() {
        return "Animal Sound";
    }

    protected abstract void EatFood();

    public String toString() {
        return String.format(getClass().getSimpleName());
    }
}
