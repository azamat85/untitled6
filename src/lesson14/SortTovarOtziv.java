package lesson14;

import java.util.Comparator;

public class SortTovarOtziv implements Comparator<Tovar> {
    public int compare(Tovar o2, Tovar o1) {
        if (o1.getOtzivs().size() != o2.getOtzivs().size()) {
            return Integer.compare(o1.getOtzivs().size(), o2.getOtzivs().size());
        }
        if (o1.midRate() != o2.midRate()) {
            return Double.compare(o1.midRate(), o2.midRate());
        }
        if (!o1.getName().equals(o2.getName())) {
            return o1.getName().compareTo(o2.getName());
        }
        if (o1.getPrice() != o2.getPrice()) {
            return Integer.compare(o1.getPrice(), o2.getPrice());
        }
        if (o1.getObzors().size() != o2.getObzors().size()) {
            return Integer.compare(o1.getObzors().size(), o2.getObzors().size());
        }
        return 0;
    }


}
