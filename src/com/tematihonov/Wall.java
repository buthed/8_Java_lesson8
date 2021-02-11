package com.tematihonov;

public class Wall implements OvercomeObstacles, StringNamesOfClasses{
    int height = 1;
    @Override
    public String name() {
        return "Wall";
    }

    @Override
    public int hardOfObstacles() {
        return height;
    }
}
