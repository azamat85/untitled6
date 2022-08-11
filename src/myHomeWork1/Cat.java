package myHomeWork1;

public class Cat extends Animal {
    public Cat() {

    }
    public Cat(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public String toString() {
        return  " Домашнее животное (кошка) {" +
                "имя = '" + super.getName() + '\'' +
                ", возраст = " + super.getAge() +
                ", вес = " + super.getWeight() + "кг"+
                '}';
    }
}
