package com.company;

public class Cat extends Animal {

    private boolean male;

    public Cat() {
        this(true);
    }

    public Cat(boolean male) {
        this.male = male;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }
}
