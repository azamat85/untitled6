package lesson12;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        boolean n = true;
        boolean a = true;
        Person p = new Person();
        while (n==true && a==true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите имя");
            String name = scanner.nextLine();
            try {
                p.setName(name);
                n = false;
            } catch (Exception e) {
                e.printStackTrace();

            }
            System.out.println("Введите возраст");
            int age = Integer.parseInt(scanner.nextLine());
            try {
                p.setAge(age);
                a = false;
            } catch (Exception e) {
                e.printStackTrace();

            }

        }
    }
}
