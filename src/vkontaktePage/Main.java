package vkontaktePage;

public class Main {
    public static void main(String[] args) {
        Page ivan = new Page("Иванов", "Иван", "Казань", "КАИ",
                "email: ivan@mail.ru, моб.тел.:89122541826", 73, 11);
        WallEnty wallEnty = new WallEnty("WallEnty");
        Comments com = new Comments("Андрей", "хорошо");
        ivan.addWallEnty(wallEnty);
        wallEnty.addComments(com);


        System.out.println();
    }
}
