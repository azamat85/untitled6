package lesson17;

import java.util.Random;

public class Game {
    public static <T extends TeamRed> void getWinner(T p1, T p2){
        Random r = new Random(){};
        int i = r.nextInt(0,2);
        if (i==1){
            System.out.println("win"+p1.getTeamName());
        }else {
            System.out.println("win"+p2.getTeamName());
        }


    }
}
