package lesson11;

public class Money {
    private int value;
    private int year;
    private String material;
    private double diametr;

    public Money() {
    }

    public Money(int value, int year, String material, double diametr) {
        this.value = value;
        this.year = year;
        this.material = material;
        this.diametr = diametr;
    }

    @Override
    public String toString() {
        String s = String.valueOf(this.hashCode());
        return s;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Money money = (Money) o;

        if (value != money.value) return false;
        if (year != money.year) return false;
        if (Double.compare(money.diametr, diametr) != 0) return false;
        return material != null ? material.equals(money.material) : money.material == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = value;
        result = 31 * result + year;
        result = 31 * result + (material != null ? material.hashCode() : 0);
        temp = Double.doubleToLongBits(diametr);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
