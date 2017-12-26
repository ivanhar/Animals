package com.company;

public abstract class Cat extends Animal {

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

    protected abstract void catchPray(Animal pray);

    @Override
    protected void EatFood() {
        // catchPray(pray);
    }
}
