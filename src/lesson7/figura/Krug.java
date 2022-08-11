package lesson7.figura;

public class Krug  extends Figura{
    private int r;

    public Krug() {
    }

    public Krug(int r) {
        this.r = r;
    }

    @Override
    public void printPlosad() {
        System.out.println("Plosad"+2*Math.PI*r*r);
    }

    @Override
    public void printObem() {
        System.out.println("Obem"+Math.PI*r);
    }
}
