package myHomeWork1;

public class Parrot extends Animal{
    private double wingLength;

    public Parrot() {
    }

    public Parrot(String name, int age, double weight, double wingLength) {
        super(name, age, weight);
        this.wingLength = wingLength;
    }

    public double getWingLength() {
        return wingLength;
    }

    public void setWingLength(double wingLength) {
        this.wingLength = wingLength;
    }

    @Override
    public String toString() {
        return " Домашнее животное (попугай) {" +
                "имя = '" + super.getName() + '\'' +
                ", возраст = " + super.getAge() +
                ", вес = " + super.getWeight() + "кг"+
                " длина крыла = " + wingLength + "см"+
                '}';

    }
}
