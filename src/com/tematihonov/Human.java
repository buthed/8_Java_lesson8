package com.tematihonov;

public class Human implements Jumpable, Runable, Members, StringNamesOfClasses {
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
