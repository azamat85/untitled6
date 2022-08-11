package lesson11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        LinkedList<String> linkedList = new LinkedList<>();

        long alTimeStart = System.currentTimeMillis();

        for (int i = 0; i<10000;i++){
            arrayList.add(0,"qwe" + i);
        }
        long alTimeEnd = System.currentTimeMillis();
        System.out.println(alTimeEnd-alTimeStart);
        System.out.println("================");

        long llalTimeStart = System.currentTimeMillis();

        for (int i = 0; i<10000;i++){
            linkedList.add(0,"qwe" + i);
        }
        long llalTimeEnd = System.currentTimeMillis();
        System.out.println(llalTimeEnd-llalTimeStart);

        System.out.println("___________-");


        long alTimeStartGet = System.currentTimeMillis();

        for (int i = 0; i<10000;i++){
            arrayList.get(i);
        }
        long alTimeEndGet = System.currentTimeMillis();
        System.out.println(alTimeEndGet-alTimeStartGet);
        System.out.println("================");

        long llalTimeStartGet = System.currentTimeMillis();

        for (int i = 0; i<10000;i++){
            linkedList.get(i);
        }
        long llalTimeEndGet = System.currentTimeMillis();
        System.out.println(llalTimeEndGet-llalTimeStartGet);


       for (Iterator<String> str=arrayList.iterator();str.hasNext();){
           System.out.println(str.next());
       }
    }
}
