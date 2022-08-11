package myHomeWork1;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public String toString() {
        return " Домашнее животное (собака) {" +
                "имя = '" + super.getName() + '\'' +
                ", возраст = " + super.getAge() +
                ", вес = " + super.getWeight() + "кг"+
                '}';
    }
}
