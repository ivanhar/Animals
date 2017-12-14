package com.company;

public class Animal {

    private String name;
    private int age;

    public Animal() {
    }

    public Animal(int age) {
        this.age = age;
    }


    public Animal(String name) {

        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;

    }

    public String MakeSound() {
        return "Animal Sound";
    }
}
