package lesson14;

import java.util.ArrayList;


public class Tovar implements Comparable<Tovar> {
    private String name;
    private int price;
    private ArrayList<Otziv> otzivs = new ArrayList<>();
    private ArrayList<Obzor> obzors = new ArrayList<>();

    public Tovar() {
    }

    public Tovar(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Tovar(String name, int price, ArrayList<Otziv> otzivs, ArrayList<Obzor> obzors) {
        this.name = name;
        this.price = price;
        this.otzivs = otzivs;
        this.obzors = obzors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ArrayList<Otziv> getOtzivs() {
        return otzivs;
    }

    public void setOtzivs(Otziv otziv) {
        this.otzivs.add(otziv);
    }

    public ArrayList<Obzor> getObzors() {
        return obzors;
    }

    public void setObzors(Obzor obzors) {
        this.obzors.add(obzors);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tovar tovar = (Tovar) o;

        if (price != tovar.price) return false;
        if (name != null ? !name.equals(tovar.name) : tovar.name != null) return false;
        if (otzivs != null ? !otzivs.equals(tovar.otzivs) : tovar.otzivs != null) return false;
        return obzors != null ? obzors.equals(tovar.obzors) : tovar.obzors == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        result = 31 * result + (otzivs != null ? otzivs.hashCode() : 0);
        result = 31 * result + (obzors != null ? obzors.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Товар" +
                " название ='" + name + '\'' +
                ", цена =" + price +
                ", отзыв =" + otzivs +
                ", обзор =" + obzors ;
    }

    public double midRate() {
        int rate = 0;
        for (Otziv o : otzivs) {
    rate+=o.getRate();
        }
        if (otzivs.size()>0){
            return rate/otzivs.size();
        }else {
            return 0;
        }

    }


    @Override
    public int compareTo(Tovar o) {
        if (this.price != o.price) {
            return Integer.compare(this.price, o.price);
        }
        if (this.midRate()!=o.midRate()){
            return Double.compare(this.midRate(),o.midRate());
        }
        if (this.otzivs.size()!=o.otzivs.size()){
            return Integer.compare(this.otzivs.size(),o.otzivs.size());
        }
        if(this.obzors.size()!=o.obzors.size()){
            return Integer.compare(this.obzors.size(),o.obzors.size());
        }
        if (!this.name.equals(o.name)){
            return this.name.compareTo(o.name);
        }
            return 0;
    }
//    public static TreeSet<Tovar> SortRateFromTo(TreeSet<Tovar>tovars){
//        TreeSet<Tovar> retTovars = new TreeSet<Tovar>();
//        for (Tovar t:tovars){
//            t.
//        }
//    }
}
