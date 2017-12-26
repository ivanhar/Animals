package com.company;

public class Cheetah extends Cat {


    @Override
    protected void catchPray(Animal pray) {
        System.out.println("I am cheetah I outrun " + pray.toString());
    }
}
