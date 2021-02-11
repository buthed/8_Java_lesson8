package com.tematihonov;

public class Robot implements Jumpable, Runable, Members, StringNamesOfClasses {
    public int maxH = 3;
    public int maxL = 9;

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
        return "Robot";
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
