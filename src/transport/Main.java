package transport;

public class Main {
    public static void main(String[] args) {
       Car car1 = new Car("bmv","x5","black",240.8);
       Car car2 = new Car("audi","Q7","black",253.4);
       Car car5 = new Car("audi","Q7","black",253.4);
       car1.abs();
       Cabriolet car3 = new Cabriolet();
       car3.roofRemoved();
       Sedan car4 = new Sedan();
       car4.safetySystem();
    }
}
