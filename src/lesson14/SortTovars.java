package lesson14;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SortTovars {
    public static TreeSet<Tovar> SortTovarRateFromTo(Set<Tovar> tovars) {
        TreeSet<Tovar> retTovar = new TreeSet<>(new SortTovarRateFromTo());
        for (Tovar t : tovars) {
            retTovar.add(t);
        }
        return retTovar;
    }

    public static TreeSet<Tovar> SortTovarNameFromTo(Set<Tovar> tovars){
        TreeSet<Tovar> nameTovar = new TreeSet<>(new SortTovarNameFromTo());
        for (Tovar t : tovars) {
            nameTovar.add(t);
        }
        return nameTovar;
    }

    public static TreeSet<Tovar> SortTovarOtziv(Set<Tovar> tovars){
        TreeSet<Tovar> otzivTovar = new TreeSet<>(new SortTovarOtziv());
        for (Tovar t : tovars) {
            otzivTovar.add(t);
        }
        return otzivTovar;
    }
    public static TreeSet<Tovar> SortTovarPrice(Set<Tovar> tovars){
//        TreeSet<Tovar> priceTovar = new TreeSet<>(new SortTovarPrice());
//        for (Tovar t : tovars) {
//            priceTovar.add(t);
//        }
//        TreeSet<Tovar> priceTovar = new TreeSet<>(new Comparator<Tovar>() {
//            @Override
//            public int compare(Tovar o1, Tovar o2) {
//                if (o1.getPrice() != o2.getPrice()) {
//                    return Integer.compare(o1.getPrice(), o2.getPrice());
//                }
//                if (!o1.getName().equals(o2.getName())){
//                    return o1.getName().compareTo(o2.getName());
//                }
//                if (o1.midRate()!=o2.midRate()){
//                    return Double.compare(o1.midRate(),o2.midRate());
//                }
//                if (o1.getOtzivs().size()!=o2.getOtzivs().size()){
//                    return Integer.compare(o1.getOtzivs().size(),o2.getOtzivs().size());
//                }
//                if(o1.getObzors().size()!=o2.getObzors().size()){
//                    return Integer.compare(o1.getObzors().size(),o2.getObzors().size());
//                }
//                return 0;
//            }
//        });
        TreeSet<Tovar> priceTovar = new TreeSet<>((o1, o2) ->{ if (o1.getPrice() != o2.getPrice()) {
            return Integer.compare(o1.getPrice(), o2.getPrice());
        }
            if (!o1.getName().equals(o2.getName())){
                return o1.getName().compareTo(o2.getName());
            }
            if (o1.midRate()!=o2.midRate()){
                return Double.compare(o1.midRate(),o2.midRate());
            }
            if (o1.getOtzivs().size()!=o2.getOtzivs().size()){
                return Integer.compare(o1.getOtzivs().size(),o2.getOtzivs().size());
            }
            if(o1.getObzors().size()!=o2.getObzors().size()){
                return Integer.compare(o1.getObzors().size(),o2.getObzors().size());
            }
            return 0;} );
        return priceTovar;
    }
}
