package com.tematihonov;

public class Human implements Jumpable, Runable, Members, StringNamesOfClasses {
    public int maxH = 2;
    public int maxL = 30;

    @Override
    public int maxLong() {
        return maxL;
    }

    @Override
    public int maxHeight() {
        return maxH;
    }

    @Override
    public String name() {
        return "Human";
    }

    @Override
    public void jump() {
        System.out.println("Я прыгаю");
    }

    @Override
    public void run() {
        System.out.println("Я бегаю");
    }
}
