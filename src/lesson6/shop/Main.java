package lesson6.shop;

public class Main {
    public static void main(String[] args) {
        Tovar tovar1 = new Tovar("telefon",1200,1212);
        Tovar tovar2 = new Tovar("telefon1",1300,121123);
        Otziv otziv1 = new Otziv("asd",12.0,"asdf","hor");
        Otziv otziv2 = new Otziv("asdaq",12.8,"asddff","null");

       tovar1.addOtziv(otziv1);


        System.out.println();

    }
}
