package lesson8;

import java.util.Random;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
//        int[][] a = {{1, 0, 0, 0},
//                {0, 1, 0, 0},
//                {0, 0, 1, 0},
//
//                {1, 0, 0, 0}
//        };
//        int[][] res = new int[a.length][a.length];

//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a.length; j++) {
//                res[j][i] = a[i][j];
//            }
//        }
//        System.out.println();
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a.length; j++) {
//                System.out.print(res[i][j] + " ");
//            }
//            System.out.println();
//        }


        //
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }
//        int count = 0;
//        blok:
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                if (a[i][j] != 0) {
//                    count++;
//                    break blok;
//                }
//            }
//        }
//        if (count == 1) {
//            System.out.println("Это не нулевая матрица");
//        } else {
//            System.out.println("Это нулевая матрица");
//        }


        //
//        int count3 = 0;
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                count3++;
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }
//        int count1 = 0;
//        int count2 = 0;
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                if (i==j &&a[i][j] == 1) {
//                    count1++;
//                }
//                else if (a[i][j] == 0) {
//                    count2++;
//                }
//
//            }
//        }
//        if (count1 == a.length && count3 - count1 == count2) {
//            System.out.println("текущая матрица единичная");
//        } else {
//            System.out.println("текущая матрица не единичная");
//        }

//

//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }
//        int count = 0;
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                if (a.length == a[i].length) {
//                    count++;
//                }
//            }
//        }
//        System.out.println();
//
//        if (count != 0) {
//            System.out.println("текущая матрица квадратная");
//        } else {
//            System.out.println("текущая матрица не квадратная");
//        }
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();

        if (s < 10) {
            Random rn = new Random();
            double d = rn.nextDouble();
            if (d <= 1) {
                System.out.println("1");;
            }
        } else if (s < 15) {
            Random rn = new Random();
            double d = rn.nextDouble();
            if (d <= 0.5) {
                System.out.println("6");
            }
        }
    }
}
