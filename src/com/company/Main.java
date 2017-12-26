package com.company;

public class Main {

    public static void main(String[] args) {


        Animal pray = new Gnu();


        Lion lion = new Lion(true, 150);
        lion.catchPray(pray);

        Cheetah cheetah = new Cheetah();
        cheetah.catchPray(pray);
    }
}

