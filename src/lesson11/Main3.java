package lesson11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Main3 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayListA = new ArrayList<>();
        arrayListA.add(1);
        arrayListA.add(2);
        arrayListA.add(3);
        arrayListA.add(4);
        arrayListA.add(41);

        System.out.println(arrayListA);
        System.out.println();


        ArrayList<Integer> arrayListB = new ArrayList<>();
        arrayListB.add(10);
        arrayListB.add(20);
        arrayListB.add(3);
        arrayListB.add(4);

        System.out.println(arrayListB);
        System.out.println();

        CollectionUtils c = new CollectionUtils();
//        //1)Объединение двух коллекций с дубликатами
//        Collection<Integer> intC1 = c.union(arrayListA, arrayListB);
//        System.out.println(intC1);
//        System.out.println();
        //2)Пересечение двух коллекций с дубликатами
        Collection<Integer> intC2 = c.intersection(arrayListA, arrayListB);
        System.out.println(intC2);
        System.out.println();
//
//        Set<Integer> hashSetsetA = new HashSet<>();
//        hashSetsetA.add(1);
//        hashSetsetA.add(2);
//        hashSetsetA.add(3);
//        hashSetsetA.add(4);
//        hashSetsetA.add(41);
//
//        System.out.println(hashSetsetA);
//        System.out.println();
//
//        Set<Integer> hashSetsetB = new HashSet<>();
//        hashSetsetB.add(10);
//        hashSetsetB.add(20);
//        hashSetsetB.add(3);
//        hashSetsetB.add(4);
//
//        System.out.println(hashSetsetB);
//        System.out.println();
//        //3)Объединение двух коллекций без дубликатов
//        Set<Integer> intC3 = c.unionWithoutDuplicate(hashSetsetA, hashSetsetB);
//        System.out.println(intC3);
//        System.out.println();
        //4)Пересечение двух коллекций без дубликатов
//        Set<Integer> intC4 = c.intersectionWithoutDuplicate(hashSetsetA,hashSetsetB);
//        System.out.println(intC4);
//        System.out.println();
//        //5)Разность двух коллекций
//        Collection<Integer> intC5 = c.difference(arrayListA,arrayListB);
//        System.out.println(intC5);
    }
}
