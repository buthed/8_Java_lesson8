package com.tematihonov;

public class Wall implements OvercomeObstacles, StringNamesOfClasses{
    int height = 5;
    @Override
    public String name() {
        return "Wall";
    }

}
