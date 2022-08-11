package lesson5;

public class Main {
    public static void main(String[] args) {
        Treugolinik tr1 = new Treugolinik();
        Treugolinik tr2 = new Treugolinik();
if(Treugolinik.pravilniyTreul(50,12,12)) {
    tr1.setA(55);
    tr1.setB(4);
    tr1.setC(5);
    tr1.pravilniyTreul();
    int a= tr1.getA();
    if (tr1.perimetr() == -1) {
        System.out.println("Не внесен какая-то из сторон");
    } else {
        System.out.println("Периметр" + tr1.perimetr());
    }
    if (tr1.ploshd() == -1) {
        System.out.println("Не внесен какая-то из сторон");
    } else {
        System.out.println("Пощадь" + tr1.ploshd());
    }
}else {
    System.out.println("12");
}


        //System.out.println("Периметр"+tr1.a+tr1.b+tr1.c);
    }
}
