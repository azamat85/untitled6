package lesson17;

public class ParamMetod {
    private int i =123;

    public ParamMetod(int i) {
        this.i = i;
    }

    public ParamMetod() {
    }
    public <T> T printTest(T t){
        System.out.println(i);

        return t;
    }
    public <K,V> void PrintKV(K k, V v ){


        System.out.println(k);
        System.out.println(v);
    }
}
