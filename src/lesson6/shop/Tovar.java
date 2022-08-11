package lesson6.shop;

public class Tovar {
    private String name = new String();
    private int price;
    private int code;
    private Otziv[] otziv = new Otziv[1000];

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Otziv[] getOtziv() {
        return otziv;
    }

    public void setOtziv(Otziv[] otziv) {
        this.otziv = otziv;
    }
    public Tovar(){

    }

    public Tovar(String name, int price, int code) {
        this.name = name;
        this.price = price;
        this.code = code;

    }
    public void  addOtziv(Otziv otziv){
        int col=0;
        for (int i = 0; i<this.otziv.length; i++){
            if (this.otziv[i]== null){
                this.otziv[i]= otziv;
                col=i;
                break;
            }
        }

        System.out.println("Количество свободных отзовов "+(this.otziv.length-col-1));
    }
}
