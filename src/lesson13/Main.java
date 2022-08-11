package lesson13;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> map= new LinkedHashMap<>();
        map.put(1,"asd");
        map.put(3,"asd");
        map.put(5,"asd");
        System.out.println(map);

        map.put(4,"asd");
        map.put(2,"asd");
        System.out.println(map);

    }
}
