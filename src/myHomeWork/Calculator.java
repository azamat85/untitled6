package myHomeWork;

import java.util.Scanner;

public class Calculator {
    public static void account() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Выберите действие: + , - , * , / , % , корень , степень , sin : ");
        String action = scan.nextLine();
        System.out.println("Вы выбрали: " + action);
        switch (action) {
            case "+":
                System.out.print("Введите первое число: ");
                float num1 = scan.nextFloat();
                System.out.print("Введите второе число: ");
                float num2 = scan.nextFloat();
                float sum = num1 + num2;
                System.out.print("Ответ: " + sum);
                break;
            case "-":
                System.out.print("Введите первое число: ");
                float num3 = scan.nextFloat();
                System.out.print("Введите второе число: ");
                float num4 = scan.nextFloat();
                float difference = num3 - num4;
                System.out.print("Ответ: " + difference);
                break;
            case "*":
                System.out.print("Введите первое число: ");
                float num5 = scan.nextFloat();
                System.out.print("Введите второе число: ");
                float num6 = scan.nextFloat();
                float multiplication = num5 * num6;
                System.out.print("Ответ: " + multiplication);
                break;
            case "/":
                System.out.print("Введите первое число: ");
                float num7 = scan.nextFloat();
                System.out.print("Введите второе число: ");
                float num8 = scan.nextFloat();
                if (num8 == 0) {
                    System.out.print("Ошибка на ноль делить нельзя!!!");
                } else {
                    float division = num7 / num8;
                    System.out.print("Ответ: " + division);
                }
                break;
            case "корень":
                System.out.print("Введите число: ");
                float num9 = scan.nextFloat();
                double radical = Math.sqrt(num9);
                System.out.print("Ответ: " + radical);
                break;
            case "степень":
                System.out.print("Введите число: ");
                double base = scan.nextFloat();
                System.out.print("Введите степень : ");
                double degree = scan.nextFloat();
                System.out.print("Ответ: " + Math.pow(base, degree));
                break;
            case "%":
                System.out.print("Введите число: ");
                double base1 = scan.nextFloat();
                System.out.print("Введите процент : ");
                double percent = scan.nextFloat();
                double result = (base1 * percent) / 100;
                System.out.print("Ответ: " + result);
                break;
            case "sin":
                System.out.print("Введите градусы : ");
                double degree1 = scan.nextFloat();
                double x = (degree1 * 3.141592) / 180;
                double result1 = x - (Math.pow(x, 3)) / 3;
                System.out.print("Ответ: " + result1);
                break;
            default:
                System.out.println("Выберите действие из предложенных выше !!!");
        }
    }
}
