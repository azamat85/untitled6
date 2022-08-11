package lesson5;

public class Tetrahedron {
    private int a;

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public double volume() {
        return a * a * a * Math.sqrt(2) / 12;
    }

    public double radius1() {
        return a  * Math.sqrt(6) / 4;
    }

    public double height() {
        return a *  Math.sqrt(6) / 3;
    }

    public double ploshd() {
        return a * a *  Math.sqrt(3) ;
    }

    public double radius2() {
        return  a * Math.sqrt(6) / 12;
    }
}
