package lesson13;

public class Main3 {
    public static void main(String[] args) {
        String s = "Damir";
        String s1 = new String("Damir");
        String s2 = "Damir";
        String s3 = s;

        System.out.println(s == s1);
        System.out.println(s == s2);
        System.out.println(s == s3);
        System.out.println(s1 == s2);
    }
}
