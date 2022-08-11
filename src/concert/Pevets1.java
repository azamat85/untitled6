package concert;

import org.apache.log4j.Logger;

public class Pevets1 extends Thread {
    private static final Logger LOGGER = Logger.getLogger(Pevets1.class);
    private boolean neadStop = false;

    @Override
    public void run() {
        int count = 0;
        while (!neadStop) {
            count++;
            if (count > 2) neadStop = true;
            LOGGER.info(getName() + " начал петь");
            for (int i = 0; i < 2; i++) {
                System.out.println("Dooo--------");
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
            synchronized (Monitorings1.MIKROFON) {
                try {
                    Monitorings1.MIKROFON.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
