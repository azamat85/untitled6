package lesson14;


import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Tovar tovar = new Tovar("Компьютер", 50000);
        Tovar tovar1 = new Tovar("Мышь", 750);
        Tovar tovar2 = new Tovar("Ноутбук", 70000);
        Tovar tovar3 = new Tovar("Ведро", 123);
        Tovar tovar4 = new Tovar("Мотоцикл", 200000);

        Otziv otziv = new Otziv(4, "norm");
        Otziv otziv1 = new Otziv(2, "для друга норм");
        Otziv otziv2 = new Otziv(5, "так себе");
        Otziv otziv3 = new Otziv(3, "хороший");
        Otziv otziv4 = new Otziv(1, "не берерите");
        Otziv otziv5 = new Otziv(5, "norm");

        tovar.setOtzivs(otziv);
        tovar1.setOtzivs(otziv1);
        tovar2.setOtzivs(otziv2);
        tovar3.setOtzivs(otziv3);
        tovar3.setOtzivs(otziv5);
        tovar4.setOtzivs(otziv4);



        Obzor obzor = new Obzor("Огонь, надел на друга и он уснул");
        tovar3.setObzors(obzor);

        TreeSet<Tovar> tovars = new TreeSet<>();

        tovars.add(tovar);
        tovars.add(tovar1);
        tovars.add(tovar2);
        tovars.add(tovar3);
        tovars.add(tovar4);
        for (Tovar t : tovars) {
            System.out.println(t);
        }
        TreeSet<Tovar> sortTovar = SortTovars.SortTovarRateFromTo(tovars);
        System.out.println();

        for (Tovar t : sortTovar) {
            System.out.println(t);
        }
        System.out.println();

        TreeSet<Tovar> sortTovarName = SortTovars.SortTovarNameFromTo(tovars);
        for (Tovar t : sortTovarName) {
            System.out.println(t);
        }
        System.out.println();
        TreeSet<Tovar> sortTovarOtziv = SortTovars.SortTovarOtziv(tovars);
        for (Tovar t : sortTovarOtziv) {
            System.out.println(t);
        }
        System.out.println();
        TreeSet<Tovar> sortTovarPrice = SortTovars.SortTovarPrice(tovars);
        for (Tovar t : sortTovarPrice) {
            System.out.println(t);
        }

    }
}
