package lesson12;

import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) {
        StringUtilsLesson utils = new StringUtilsLesson();

        String s = null;
//        try {
//            utils.div(s,"0");
//        }catch (Exception e){
//            e.printStackTrace();
//            System.out.println("Введате нормальные числа");
//        }
//        try {
//            utils.findWord("Ищет все вхождения Слов <b>word</b> в тексте Слов <b>text</b> и возвращает массив индексов слов","слов");
//        }catch (Exception e){
//            e.printStackTrace();
//            System.out.println("Ошибка!!!");
//        }
        try {
            utils.findNumbers(" Ищет -5.0 все вхождения  Слов <b>word</b>  в 56.5  тексте <b>text</b> " +
                    "и возвращает массив 12.0 индексов слов");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Ошибка введите числа!!!");
        }

   }
}

