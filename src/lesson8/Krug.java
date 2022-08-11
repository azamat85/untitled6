package lesson8;

public class Krug implements Figura,Figura3d{
    @Override
    public void printObem() {
        System.out.println("Obem");
    }

    @Override
    public void printPer() {
        System.out.println("Per");
    }

    @Override
    public void print3d() {
        System.out.println("3d");
    }
}
