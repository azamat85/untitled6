package lesson5;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("Выберите фигуру");
        System.out.println("1 - треугольник");
        System.out.println("2 - круг");
        System.out.println("3 - параллелограм");
        System.out.println("4 - конус");
        System.out.println("5 - тэтрайдер");
        System.out.println("6 - овал");
        Scanner scan = new Scanner(System.in);
        int secFigura = scan.nextInt();
        switch (secFigura) {
            case 1:
                System.out.println("Введите a");
                int a = scan.nextInt();
                System.out.println("Введите b");
                int b = scan.nextInt();
                System.out.println("Введите c");
                int c = scan.nextInt();
                if (Treugolinik.pravilniyTreul(a, b, c)) {
                    Treugolinik tr = new Treugolinik();
                    tr.setA(a);
                    tr.setB(b);
                    tr.setC(c);
                    System.out.println("периметр = " + tr.perimetr());
                    System.out.println("площадь = " + tr.ploshd());
                } else {
                    System.out.println("треугольник не пральный");
                }
                break;
            case 2:
                System.out.println("Введите r");
                int r = scan.nextInt();
                Krug kr = new Krug();
                kr.setR(r);
                System.out.println("периметр = " + kr.perimetr());
                System.out.println("площадь = " + kr.ploshd());
                break;
            case 3:
                System.out.println("Введите a");
                int d = scan.nextInt();
                System.out.println("Введите b");
                int f = scan.nextInt();
                System.out.println("Введите угол");
                double degree = scan.nextInt();
                Parallelogram parall = new Parallelogram();
                parall.setD(d);
                parall.setF(f);
                parall.setDegree(degree);
                System.out.println("периметр = " + parall.perimetr());
                System.out.println("площадь = " + Math.round(parall.ploshd()));
                break;
            case 4:
                System.out.println("Введите r");
                int z = scan.nextInt();
                System.out.println("Введите h");
                int h = scan.nextInt();
                Cone con = new Cone();
                con.setR(z);
                con.setH(h);
                System.out.println("площадь =" + con.ploshd());
                System.out.println("объем =" + con.volume());
                break;
            case 5:
                System.out.println("Введите a");
                int k = scan.nextInt();
                Tetrahedron tetra = new Tetrahedron();
                tetra.setA(k);
                System.out.println("объем =" + tetra.volume());
                System.out.println("радиус описанной сферы =" + tetra.radius1());
                System.out.println("высота =" + tetra.height());
                System.out.println("площадь =" + tetra.ploshd());
                System.out.println("радиус вписанной сферы =" + tetra.radius2());
                break;
            case 6:
                System.out.println("Введите r1");
                int r1 = scan.nextInt();
                System.out.println("Введите r2");
                int r2 = scan.nextInt();
                Oval ova = new Oval();
                ova.setR1(r1);
                ova.setR2(r2);
                System.out.println("периметр = " + ova.perimetr());
                System.out.println("площадь = " + ova.ploshd());
                break;
            default:
                System.out.println("Неверное число");
        }
    }
}
