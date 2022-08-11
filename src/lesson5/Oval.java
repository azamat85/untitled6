package lesson5;

public class Oval {

    private int r1;

    public void setR1(int r1) {
        this.r1 = r1;
    }

    public int getR1() {
        return r1;
    }

    private int r2;

    public void setR2(int r2) {
        this.r2 = r2;
    }

    public double ploshd(){
        return Math.PI*r1*r2;
    }
    public double perimetr(){
        return (4*Math.PI*r1*r2+4*(r1-r2)*(r1-r2))/(r1+r2);
    }
}
