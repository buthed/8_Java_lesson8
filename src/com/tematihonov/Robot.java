package com.tematihonov;

public class Robot implements Jumpable, Runable, Members, StringNamesOfClasses {
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
