package lesson12;

import java.util.ArrayList;

public class StringUtilsLesson implements StringUtils {
    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        double ret;
        if (number1 == null || number2 == null) {
            throw new NullPointerException("number1==null||number2==null");
        }
        double n1 = Double.parseDouble(number1);
        double n2 = Double.parseDouble(number2);
////        try {
////            double n1 = Double.parseDouble(number1);
////        }catch (NumberFormatException e){
////            e.printStackTrace();
////        }
        if (n2 == 0) {
            throw new ArithmeticException("number2==0");
        }
        ret = n1 / n2;

        return ret;
    }

    @Override
    public Integer[] findWord(String text, String word) throws NullPointerException {
        if (text == null || word == null || word == "" || text == "" || word == " " || text == " ") {
            throw new NullPointerException("text==null||word==null");
        }
        String[] mass = text.split(" ");
        ArrayList<Integer> ret1 = new ArrayList<>();
        int count = -1;
        int count1 = 0;
        for (int i = 0; i < mass.length; i++) {
            count++;
            if (mass[i].equalsIgnoreCase(word)) {
                ret1.add(count);
                count1++;
            }
        }
        Integer[] ret = ret1.toArray(new Integer[0]);
        if (count1 == 0) {
            System.out.println("данного слова нет в тексте");
        }
        for (int i = 0; i < ret.length; i++) {
            System.out.println(ret[i]);
        }
        return ret;
    }

    @Override
    public Double[] findNumbers(String text) throws CustomException {
        String[] mass = text.split(" ");
        int count = 0;
        ArrayList<Double> ret1 = new ArrayList<>();
        for (int i = 0; i < mass.length; i++) {
            for (double j = -100; j < 100; j += 0.5) {
                String s1 = String.valueOf(j);
                if (mass[i].equals(s1)) {
                    double s2 = Double.parseDouble(s1);
                    ret1.add(s2);
                    count++;
                }
            }
        }
        if (count == 0) {
            throw new CustomException("Not found");
        }
        Double[] ret = ret1.toArray(new Double[0]);
        for (int i = 0; i < ret.length; i++) {
            System.out.println(ret[i]);
        }
        return ret;
    }
}
