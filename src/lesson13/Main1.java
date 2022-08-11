package lesson13;

import java.util.HashMap;
import java.util.Map;

public class Main1 {
    public static void main(String[] args) {
        Student student1 = new Student("Azamat", 23);
        Student student2 = new Student("Anton", 24);
        Student student3 = new Student("Damir", 25);
        Student student4 = new Student("Svetlana", 26);

        Map<Student, Integer> mapStud = new HashMap<>();

        mapStud.put(student1, 5);
        mapStud.put(student2, 4);
        mapStud.put(student3, 3);
        mapStud.put(student4, 3);
        System.out.println(mapStud.containsKey(student1));
        student1.setAge(23);
        System.out.println(mapStud.containsKey(student1));
//        mapStud.put(student1,1);
//        mapStud.putIfAbsent(student1,4);


//        System.out.println(mapStud);
//
        for (Map.Entry<Student, Integer> m: mapStud.entrySet()){
            System.out.println("Key = "+ m.getKey()+"value = "+m.getValue());
        }
//        System.out.println();
//        System.out.println();
//        System.out.println();
//
//        System.out.println(mapStud.get(student1));

    }
}
