package lesson6.blackJek;

public class Main {
    public static void main(String[] args) {

        Diller d = new Diller();
        Player player1 = new Player();
        Player player2 = new Player();

        Game blackJek = new Game(d);
//        blackJek.addPlayer(d);
        blackJek.addPlayer( player1);




        blackJek.addTwoKartToPlayer();
        blackJek.needMoreKart();
//        blackJek.addTwoKartToPlayer(player1);
//        boolean b2 = blackJek.needMoreKart();
////        blackJek.addTwoKartToPlayer(player2);
////        blackJek.addKartToPlayer(d);
//        boolean b3 = blackJek.needMoreKart();
//        if(b1==true){
//            blackJek.addKartToPlayer(d);
//        }
//        if(b2==true){
//            blackJek.addKartToPlayer(player1);
//        }
//        if(b3==true){
//            blackJek.addKartToPlayer(player2);
//        }

        blackJek.printToWin();





    }
}
