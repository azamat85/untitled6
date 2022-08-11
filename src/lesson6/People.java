package lesson6;

public class People {
   private String name = new String();
   private int age;
    private String gender = new String();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public People (){

    }
    public People(String name, int age, String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
}
