package com.company;

public class Gnu extends Animal {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    protected void EatFood() {
        System.out.println("Eat grass like a mofo");
    }
}
