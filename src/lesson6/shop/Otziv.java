package lesson6.shop;

public class Otziv {
    private String user;
    private double rate;
    private String mainComent;
    private String dostoinstva;


    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getMainComent() {
        return mainComent;
    }

    public void setMainComent(String mainComent) {
        this.mainComent = mainComent;
    }

    public String getDostoinstva() {
        return dostoinstva;
    }

    public void setDostoinstva(String dostoinstva) {
        this.dostoinstva = dostoinstva;
    }
    public Otziv(){

    }

    public Otziv(String user, double rate, String mainComent, String dostoinstva) {
        this.user = user;
        this.rate = rate;
        this.mainComent = mainComent;
        this.dostoinstva = dostoinstva;
    }
}

