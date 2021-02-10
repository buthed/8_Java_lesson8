package com.tematihonov;

public class Cat implements Jumpable, Runable, Members, StringNamesOfClasses {
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
