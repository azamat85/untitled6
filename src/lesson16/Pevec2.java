package lesson16;

public class Pevec2 extends Thread {
    @Override
    public void run() {
        while (true){
            synchronized (Monitorings.MIKROFON){
                try {
                    Monitorings.MIKROFON.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


            for(int i = 0; i<3;i++){

                System.out.println("-----------Faaa");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (Monitorings.MIKROFON) {
                Monitorings.MIKROFON.notify();
            }
        }
    }
}
