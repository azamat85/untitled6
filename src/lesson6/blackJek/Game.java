package lesson6.blackJek;

import java.util.ArrayList;
import java.util.Random;

public class Game implements IGame {
    private int s;
    private int[] s1;
    private Coloda coloda1 = new Coloda();
    private Coloda col = new Coloda();
    private Karta[] kartas = new Karta[10];

    private Player[] players = new Player[6];
    private ArrayList<Player> playersArr= new ArrayList<Player>();

    public Game(Player player) {
        playersArr.add(player);
    }

    @Override
    public void addPlayer(Player player) {
       playersArr.add(player);
    }

    @Override
    public void addTwoKartToPlayer() {
        for (Player player:playersArr){
            player.addKart1(this.col.getsRandomKart());
            player.addKart1(this.col.getsRandomKart());
        }
//        for (Player p : players) {
//            player.addKart(coloda1.getsRandomKart(), coloda1.getsRandomKart());
//            s = player.score;
////                  player.score=s;
//            return;
////            player.addKart(coloda1.getsRandomKart());
////            player.addKart(coloda1.getsRandomKart());
////            return;
//        }
    }

    @Override
    public void needMoreKart() {
        for (Player player:playersArr){
            boolean b = player.needKartaHad();
            while (b){

                player.addKart1(this.col.getsRandomKart());
                b = player.needKartaHad();
            }
        }

//        for (Player p : players) {
//
//            if (s <= 10) {
//                Random rn = new Random();
//                double d = rn.nextDouble();
//                if (d <= 1) {
//                    return true;
//                }
//                return false;
//            }
//            if (s <= 15) {
//                Random rn = new Random();
//                double d = rn.nextDouble();
//                if (d <= 0.6) {
//                    return true;
//                }
//                return false;
//            }
//            if (s <= 19) {
//                Random rn = new Random();
//                double d = rn.nextDouble();
//                if (d <= 0.2) {
//                    return true;
//                }
//                return false;
//            }
//            if (s >= 20) {
//                return false;
//            }
//
//        }

//        если меньше 10 очков 100% true
//        если меньше 15 очков 60% true
        //     если меньше 19 очков 20% true
        //         рандом


    }

//    @Override
//    public void addKartToPlayer(Player player) {
//        for (Player p : players) {
//            player.addKart1(coloda1.getsRandomKart());
//            s = player.score1;
//            return;
//        }
//    }

    @Override
    public void printToWin() {
        int count = 0;
        for (Player player:playersArr){
            if(player.showPowerP()>21){
                player.setGame(false);
            } else count++;
        }
        int winValue = 0;
        if (count>0){
            if(count==1){
                for (Player player:playersArr){
                    if(player.isGame()){
                        System.out.println("Победил единственный игрок");
                        player.vskritie();
                        return;
                    }
                }
            }
            else {
                for (Player player:playersArr){
                    if(winValue<player.showPowerP());
                    winValue=player.showPowerP();
                }
            }
            for (Player player:playersArr){
                if(winValue==player.showPowerP()){
                    System.out.println("Победитель!");
                    player.vskritie();
                }
            }
        }else {
            System.out.println("Диллер победил!");
        }
//        for (Player p : players) {
//
//            if (s > 21) {
//                System.out.println("проиграл" + p);
//                System.out.println("максимальное количество очков " + s);
//                return;
//            } else {
//                System.out.println("проиграл" + p);
//                System.out.println("максимальное количество очков " + s);
//                return;
//            }
//
//        }
        return;

//        for (int i = 0 ; i< this.kartas.length;i++) {
//            System.out.println(this.kartas[i].getValue());
//            return;
//        }

/*
если больше 21 то проиграл
вывести игрока с макс колличеством очков
 */
    }
}
