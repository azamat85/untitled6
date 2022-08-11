package lesson6.blackJek;

import java.util.Scanner;

public class Player {
    protected Karta[] kartas = new Karta[10];
    private boolean isGame = true;

    public boolean isGame() {
        return isGame;
    }

    public void setGame(boolean game) {
        isGame = game;
    }

    public Player() {

    }

    public Player(Karta k1, Karta k2) {
        kartas[0] = k1;
        kartas[1] = k2;

    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    int score;
    int score1;

    public int getScore1() {
        return score1;
    }

    public void setScore1(int score1) {
        this.score1 = score1;
    }

    public void vskritie() {
        for (int i = 0; i < this.kartas.length; i++) {
            if (this.kartas[i] != null) {
                System.out.println(this.kartas[i].getName());
                System.out.println(this.kartas[i].getValue());
            }
        }
    }

    public void addKart(Karta k1, Karta k2) {
        for (int i = 0; i < this.kartas.length; i++) {
            if (this.kartas[i] == null) {
                this.kartas[i] = k1;
                this.kartas[i + 1] = k2;
                this.kartas[i].getValue();
                this.kartas[i + 1].getValue();
                score = this.kartas[i].getValue() + this.kartas[i + 1].getValue();
                break;
            }
        }

    }

    public void addKart1(Karta k) {
        for (int i = 0; i < this.kartas.length; i++) {
            if (this.kartas[i] == null) {
                this.kartas[i] = k;
                break;
            }
        }

    }
//    public void addKart1(Karta k) {
//        this.kartas[0] = k;
//        this.kartas[0].getValue();
//        score1 = this.kartas[0].getValue() + score;
//        score = score1;
//    }

    public boolean needKartaHad() {
        System.out.println("------------");
        this.vskritie();
        Scanner s = new Scanner(System.in);
        System.out.println("Добавить карту?");
        String res = s.nextLine();
        if (res.equals("+")) {
            return true;
        } else return false;
    }

    public int showPowerP() {
        int value = 0;
        for (int i = 0; i < this.kartas.length; i++) {
            if (this.kartas[i] != null) {
                value += this.kartas[i].getValue();
            }
        }
        return value;

    }
}
