package lesson7.figura;

public class Kvadrat extends Figura{
    private int a;

    public Kvadrat() {
    }

    public Kvadrat(int a) {
        this.a = a;
    }

    @Override
    public void printObem() {
        System.out.println("Obem"+a*4);
    }

    @Override
    public void printPlosad() {
        System.out.println("Plosad"+a*a);
    }
}
