package myHomeWork;


import java.util.Arrays;

public class Process {
    public static void analysis(String email, String password) {
        //Проверка почты
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int a = email.length() - 1;
        for (int i = 0; i < email.length(); i++) {
            if ((email.charAt(0) == '@' || email.charAt(a) == '@') || (email.charAt(0) == '.' || email.charAt(a) == '.')) {
                count1++;
            }
            if (email.charAt(i) == '@') {
                count2++;
            }
            if (email.charAt(i) == '.') {
                count3++;
            }
        }
        if (count1 > 0) {
            System.out.println("В email @ или точка не должны стоять в начале или конце !!!");
        }
        if (count2 == 1) {
        } else {
            System.out.println("В email должен быть символ @, который используется один раз !!!");
        }
        if (count3 == 1) {
        } else {
            System.out.println("В email должен быть символ точка, который используется один раз !!!");
        }
        //Проверка пароля
        if (email.compareTo(password) != 0) {
        } else {
            System.out.println("password не должен совпадать с email !!!");
        }
        if (password.length() <= 8) {
            System.out.println("password должен состоять минимум из 8 символов !!!");
        }
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        int count7 = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                count4++;
            }
            if (Character.isLowerCase(password.charAt(i))) {
                count5++;
            }
        }
        if (count4 >= 1) {
        } else {
            System.out.println("Используйте заглавные буквы !!!");
        }
        if (count5 >= 1) {
        } else {
            System.out.println("Используйте строчные буквы !!!");
        }
        char[] alphabet = "@.,!_+?|&".toCharArray();
        String alphabet1 = Arrays.toString(alphabet);
        char[] alphabet2 = "abcdefghijklmnopqrstuvwxyzWERTYUIOPASDFGHJKLZXCVBNM@.,!&1234567890".toCharArray();
        String alphabet3 = Arrays.toString(alphabet2);
        for (int i = 0; i < password.length(); i++) {
            for (int j = 0; j < alphabet1.length(); j++) {
                if (password.charAt(i) == alphabet1.charAt(j)) {
                    count6++;
                }
            }
        }
        for (int i = 0; i < password.length(); i++) {
            for (int b = 0; b < alphabet3.length(); b++) {
                if (password.charAt(i) == alphabet3.charAt(b)) {
                    count7++;
                }
            }
        }
        if (count7 == password.length()) {
        } else {
            System.out.println("Испрльзуйте английский язык !!!");
        }
        if (count6 >= 1) {
        } else {
            System.out.println("Используйте хотя бы один из предложенных символов @.,!_+?|&");
        }
    }
}
