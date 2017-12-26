package com.company;

public class Lion extends Cat {
    private int weight;

    public Lion(boolean male, int weight) {
        super(male); // Shall be explained in the next paragraph
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void catchPray(Animal pray) {
        System.out.println("I am lion, I ambush " + pray.toString());

    }
}

