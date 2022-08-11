package lesson6.blackJek;

public class Karta {
    private String name;
    private int value;
    public Karta (String name, int value){
       this.name=name;
       this.value=value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}
