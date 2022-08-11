package lesson16;

public class Veduchiy {
    public static void main(String[] args) {

        Pevec1 pevec1= new Pevec1();
        Pevec2 pevec2 = new Pevec2();
        pevec2.setDaemon(true);


        System.out.println("концерт начинается");

        pevec1.start();
        pevec2.start();


        while (pevec1.isAlive()){

        }


        System.out.println("концерт закончился");

    }
}
