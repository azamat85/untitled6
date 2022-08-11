package transport;

public class Sedan extends Car{
    @Override
    public void abs() {
        System.out.println("Система abs работает исправно");
    }

    @Override
    public void safetySystem() {
        super.safetySystem();
    }
    public void airConditioningOn(){
        System.out.println("кондиционер вкл.");
    }
    public void airConditioningOff(){
        System.out.println("кондиционер выкл.");
    }
}
