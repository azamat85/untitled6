package concert;


public class Veduchiy {

    public static void main(String[] args) {
        Pevets1 pevets1 = new Pevets1();
        Pevets2 pevets2 = new Pevets2();
        Pevets3 pevets3 = new Pevets3();
        pevets1.setName("певец 1");
        pevets2.setName("певец 2");
        pevets3.setName("певец 3");
        pevets2.setDaemon(true);
        pevets3.setDaemon(true);


        System.out.println("Концерт начался");

        pevets1.start();
        pevets2.start();
        pevets3.start();


        while (pevets1.isAlive()) {

        }


        System.out.println("Концерт закончился");

    }
}
