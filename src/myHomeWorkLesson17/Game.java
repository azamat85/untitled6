package myHomeWorkLesson17;

import java.util.Random;

public class Game {
    public static <T> void getWinner(Team<T> p1, Team<T> p2) {
        Random r = new Random() {
        };
        int i = r.nextInt(0, 2);
        if (i == 1) {
            System.out.println("win" + p1.getNameTeam());
        } else {
            System.out.println("win" + p2.getNameTeam());
        }


    }

}
