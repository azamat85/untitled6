package lesson6.blackJek;

import java.util.concurrent.ThreadLocalRandom;

public class Coloda {

    private Karta[] kartas= new Karta[52];
    public Coloda(){
        kartas[0]=new Karta("Двойка черви",2);
        kartas[1]=new Karta("Двойка буби",2);
        kartas[2]=new Karta("Двойка крести",2);
        kartas[3]=new Karta("Двойка пики",2);

        kartas[4]=new Karta("Тройка черви",3);
        kartas[5]=new Karta("Тройка буби",3);
        kartas[6]=new Karta("Тройка крести",3);
        kartas[7]=new Karta("Тройка пики",3);

        kartas[8]=new Karta("Четверка черви",4);
        kartas[9]=new Karta("Четверка буби",4);
        kartas[10]=new Karta("Четверка крести",4);
        kartas[11]=new Karta("Четверка пики",4);

        kartas[12]=new Karta("Пятерка черви",5);
        kartas[13]=new Karta("Пятерка буби",5);
        kartas[14]=new Karta("Пятерка крести",5);
        kartas[15]=new Karta("Пятерка пики",5);

        kartas[16]=new Karta("Шенстерка черви",6);
        kartas[17]=new Karta("Шенстерка буби",6);
        kartas[18]=new Karta("Шенстерка крести",6);
        kartas[19]=new Karta("Шенстерка пики",6);

        kartas[20]=new Karta("Семерка черви",7);
        kartas[21]=new Karta("Семерка буби",7);
        kartas[22]=new Karta("Семерка крести",7);
        kartas[23]=new Karta("Семерка пики",7);

        kartas[24]=new Karta("Восьмерка черви",8);
        kartas[25]=new Karta("Восьмерка буби",8);
        kartas[26]=new Karta("Восьмерка крести",8);
        kartas[27]=new Karta("Восьмерка пики",8);

        kartas[28]=new Karta("Девятка черви",9);
        kartas[29]=new Karta("Девятка буби",9);
        kartas[30]=new Karta("Девятка крести",9);
        kartas[31]=new Karta("Девятка пики",9);

        kartas[32]=new Karta("Десятка черви",10);
        kartas[33]=new Karta("Десятка  буби",10);
        kartas[34]=new Karta("Десятка  крести",10);
        kartas[35]=new Karta("Десятка  пики",10);

        kartas[36]=new Karta("Дама черви",10);
        kartas[37]=new Karta("Дама  буби",10);
        kartas[38]=new Karta("Дама  крести",10);
        kartas[39]=new Karta("Дама  пики",10);


        kartas[40]=new Karta("Валет черви",10);
        kartas[41]=new Karta("Валет  буби",10);
        kartas[42]=new Karta("Валет  крести",10);
        kartas[43]=new Karta("Валет  пики",10);

        kartas[44]=new Karta("Король черви",10);
        kartas[45]=new Karta("Король  буби",10);
        kartas[46]=new Karta("Король  крести",10);
        kartas[47]=new Karta("Король  пики",10);

        kartas[48]=new Karta("Туз черви",11);
        kartas[49]=new Karta("Туз  буби",11);
        kartas[50]=new Karta("Туз  крести",11);
        kartas[51]=new Karta("Туз  пики",11);


    }
    public Karta getsRandomKart(){
        int randomNum = ThreadLocalRandom.current().nextInt(0, kartas.length-1);
        return kartas[randomNum];

    }

}
