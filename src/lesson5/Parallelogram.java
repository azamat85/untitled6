package lesson5;

public class Parallelogram {
    private int d;
    public void setD(int d){
        this.d=d;
    }
    public int getD(){
        return this.d;
    }
    private int f;
    public void setF(int f){
        this.f=f;
    }
    public int getF(){
        return  this.f;
    }
    private double degree;
    public void setDegree(double degree){
        this.degree=degree;
    }

    public double getDegree() {
        return degree;
    }
    public double radian (){
        return Math.toRadians(degree);
    }

    public double perimetr() {
        return 2*(d+f);
    }

    public double ploshd(){
        return d*f*Math.sin(radian());
    }
}
