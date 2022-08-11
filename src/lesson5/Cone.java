package lesson5;

public class Cone {
    private int r;

    public void setR(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    private int h;

    public void setH(int h) {
        this.h = h;
    }

    public int getH() {
        return h;
    }

    public double ploshd() {
        return Math.PI * r * Math.sqrt(r * r + h + h) + Math.PI * r * r;
    }

    public double volume() {
        return Math.PI * r * r * h / 3;
    }
}
