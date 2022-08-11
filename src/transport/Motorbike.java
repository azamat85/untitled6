package transport;

public class Motorbike extends Transport {
    private String model;
    private String color;
    private double maxSpedd;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMaxSpedd() {
        return maxSpedd;
    }

    public void setMaxSpedd(double maxSpedd) {
        this.maxSpedd = maxSpedd;
    }

    public Motorbike() {
    }

    public Motorbike(String model, String color, double maxSpedd) {
        this.model = model;
        this.color = color;
        this.maxSpedd = maxSpedd;
    }

    @Override
    public void abs() {
        System.out.println("Система работает исправно");
    }

    @Override
    public void safetySystem() {
        System.out.println("Система работает исправно");
    }
}
