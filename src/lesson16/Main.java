package lesson16;

public class Main {
    public static void main(String[] args) {
        //  MyTheard myTheard = new MyTheard();
        //   myTheard.start();
        Thread myTheard = new Thread(new MyTheard());
        myTheard.start();
        myTheard.setName(" Azamat");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }
    }
}
