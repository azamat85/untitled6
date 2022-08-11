package lesson7.figura;

public class Main {
    public static void main(String[] args) {
        Krug k1 = new Krug(3);
        Krug k2 = new Krug(2);


        Kvadrat kv1 = new Kvadrat(4);
        Kvadrat kv2 = new Kvadrat(6);

        Figura[] figuras = new Figura[4];
        figuras[0] = k1;
        figuras[1] = k2;
        figuras[2] = kv1;
        figuras[3] = kv2;
        for (Figura p : figuras) {
            p.printObem();
            p.printPlosad();
        }
    }
}
