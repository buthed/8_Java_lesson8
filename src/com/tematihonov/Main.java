package com.tematihonov;

public class Main {

    public static void main(String[] args) {
        Members[] members = { new Cat(), new Human(), new Robot()};             //массив участников
        OvercomeObstacles[] obstacles = {new Wall(), new Treadmill()};          //массив препятствий

        for (OvercomeObstacles obstacle: obstacles) {
            System.out.println("Преграда " + obstacle.name());
            for (Members member: members) {
                if (obstacle.name() == "Wall"){                                 //определение препятствия
                    if (member.maxHeight()>obstacle.hardOfObstacles())   System.out.println(member.name() + " перепрыгивает " + obstacle.name());    //условие если мах высота прыжка участника больше тяжести преграды
                    else  System.out.println(member.name() + " не смог перепрыгнуть " + obstacle.name());
                } else {
                    if (member.maxLong()>obstacle.hardOfObstacles())   System.out.println(member.name() + " пробегает " + obstacle.name());          //условие если мах длинна, которую может пробежать  участник больше тяжести преграды
                    else   System.out.println(member.name() + " не смог пробежать " + obstacle.name());
                }

            }
            System.out.println();                                               //просто пробел для более понятного вывода
        }
    }
}
