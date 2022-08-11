package lesson16;

public class MyTheard implements Runnable {
    @Override
    public void run() {
        while (true) {
            for (int i = 100; i < 110; i++) {
                System.out.println(i + Thread.currentThread().getName());
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
