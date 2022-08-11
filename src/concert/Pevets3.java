package concert;

import org.apache.log4j.Logger;

public class Pevets3 extends Thread {
    private static final Logger LOGGER = Logger.getLogger(Pevets3.class);
    public void run() {
        while (true) {
            synchronized (Monitorings1.MIKROFON) {
                try {
                    Monitorings1.MIKROFON.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                LOGGER.info(getName() + " начал петь");
                for (int i = 0; i < 2; i++) {
                    System.out.println("--------miii");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                LOGGER.info(getName()+ " закончил петь");
                synchronized (Monitorings1.MIKROFON) {
                    Monitorings1.MIKROFON.notify();
                }
            }
        }
    }
}
