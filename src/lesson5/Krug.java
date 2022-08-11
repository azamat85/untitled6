package lesson5;

public class Krug {
   private int r;
    public void setR(int r ){
        this.r=r;
    }
    public int getR(){
        return  this.r;
    }

    public double perimetr() {
        return 2 * Math.PI * r;
    }
    public double ploshd(){
        return Math.PI*r*r;
    }
}
