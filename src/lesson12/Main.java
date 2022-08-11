package lesson12;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        try {
            p.setAge(1234);
            p.setName("");



        } catch (NullPointerException e){
            e.printStackTrace();
            System.out.println("Name");
        }

        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Age");

        }
        System.out.println("Пытаемся установить");
    }
}
