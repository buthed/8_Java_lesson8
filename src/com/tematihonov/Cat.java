package com.tematihonov;

public class Cat implements Jumpable, Runable, Members, StringNamesOfClasses {
    int maxH = 1;
    int maxL = 15;

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
        return "Cat";
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
