package lesson7;

public class Cat extends Animal{
    public Cat(int age, String poroda) {
        super(age, poroda);
    }

    @Override
    public void orat() {
        System.out.println("Мяу");
    }
}
