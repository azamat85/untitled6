package lesson17;

public class Main {
    public static void main(String[] args) {
        ParamClass<String> stringParamClass= new ParamClass<>("qwe");
        stringParamClass.printVal();


        System.out.println();

        ParamClass<Integer> paramClass = new ParamClass<>(123);
        paramClass.printVal();

        System.out.println();

        ParamMetod paramMetod = new ParamMetod(321);
        var t =paramMetod.printTest("ewq");
        System.out.println(t);

        paramMetod.PrintKV(123,321);
    }
}
