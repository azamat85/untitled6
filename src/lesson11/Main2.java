package lesson11;

import java.util.HashSet;

public class Main2 {
    public static void main(String[] args) {
        HashSet<Money> monies = new HashSet<>();
        monies.add(new Money(1,2000,"Золото",2.2));
        monies.add(new Money(2,2002,"Медь",2.4));
        monies.add(new Money(1,2000,"Золото",2.2));
        monies.add(new Money(7,2005,"Золото",2.5));
        monies.add(new Money(10,2010,"Серебро",2.7));



        System.out.println(monies);
        /*
        for (Iterable<Money> itr =(Iterable<Money>) monies.iterator();itr.iterator().hasNext();){
            itr.toString();
        }

         */
     }
}
