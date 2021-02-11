package com.tematihonov;

public class Treadmill implements OvercomeObstacles, StringNamesOfClasses{
    int lonng = 10;

    @Override
    public int hardOfObstacles() {
        return lonng;
    }

    @Override
    public String name() {
        return "Treadmill";
    }

}
