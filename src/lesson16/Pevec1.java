package lesson16;

public class Pevec1 extends Thread {
    private boolean neadStop = false;

    @Override
    public void run() {
        int count = 0;
        while (!neadStop) {
            count++;
            if (count > 3) neadStop = true;

            for (int i = 0; i < 3; i++) {
                System.out.println("Lala-----------");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            synchronized (Monitorings.MIKROFON) {
                Monitorings.MIKROFON.notify();
            }
            synchronized (Monitorings.MIKROFON) {
                try {
                    Monitorings.MIKROFON.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
