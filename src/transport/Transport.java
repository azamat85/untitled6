package transport;

public abstract class Transport {

    public abstract void abs();
    public abstract void safetySystem();

    public  void drive(){
        System.out.println("Едет");
    }

    public void gas() {
        System.out.println("Газует");
    }

    public void brake() {
        System.out.println("Тормозит");
    }

}
