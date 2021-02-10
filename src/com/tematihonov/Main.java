package com.tematihonov;

public class Main {

    public static void main(String[] args) {
        Members[] members = { new Cat(), new Human(), new Robot()};             //массив участников
        OvercomeObstacles[] obstacles = {new Wall(), new Treadmill()};          //массив препятствий

        for (OvercomeObstacles obstacle: obstacles) {
            System.out.println("Преграда " + obstacle.name());
            for (Members member: members) {
                System.out.println(member.name() + " преодалевает " + obstacle.name());
            }
        }
    }
}
