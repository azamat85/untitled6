package myHomeWork1;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Cat animal1 = new Cat("Boss", 2, 4.3);
        Cat animal2 = new Cat("Соня", 1, 3.5);
        Dog animal3 = new Dog("Пират", 5, 41.0);
        Dog animal4 = new Dog("Джек", 3, 34.2);
        Parrot animal5 = new Parrot("Гоша", 21, 0.045, 10.7);
        Parrot animal6 = new Parrot("Кеша", 15, 0.054, 9.3);
        Person person1 = new Person("Кирилл");
        Person person2 = new Person("Вадим");

        //1)


        Map<String, Animal> stringAnimalMap = new HashMap<>();
        stringAnimalMap.put("cat1", animal1);
        stringAnimalMap.put("cat2", animal2);
        stringAnimalMap.put("dog1", animal3);
        stringAnimalMap.put("dog2", animal4);
        stringAnimalMap.put("parrot1", animal5);
        stringAnimalMap.put("parrot2", animal6);

        for (Map.Entry<String, Animal> s : stringAnimalMap.entrySet()) {
            System.out.println("Key = " + s.getKey()+" ," + " value = " + s.getValue());
        }
        System.out.println();

        // 2)

        Map<Person, List<Animal>> personAnimalMap = new HashMap<>();
        List<Animal> values1 = new ArrayList<>();
        List<Animal> values2 = new ArrayList<>();
        values1.add(animal1);
        values1.add(animal4);
        values1.add(animal6);
        personAnimalMap.put(person1, values1);
        values2.add(animal2);
        values2.add(animal3);
        values2.add(animal5);
        personAnimalMap.put(person2, values2);


        for (Map.Entry<Person, List<Animal>> p : personAnimalMap.entrySet()) {
            System.out.println("key = " + p.getKey() + "," +"\n"+ "value = " + p.getValue()+"\n");
        }
    }
}
