package lesson9;


public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Мертвые души", 1985, "Художетвенная литература", "Н.В.Гоголь", 368);
        Book b2 = new Book("Рассказы", 2010, "Художетвенная литература", "В.М.Гаршин", 235);
        Book b3 = new Book("Детство,Отрочество,Юность", 2007, "Дрофа", " Л.Н.Толстой", 309);
        Book b4 = new Book("Капитанская дочка", 1984, "Художетвенная литература", "А.С.Пушкин", 250);
        Book b5 = new Book("Пьесы", 2010, "Дрофа", "А.Н.Островский", 375);

//        Journal j1 = new Journal("На даче", 2015, "Айрис-пресс", 1);
//        Journal j2 = new Journal("Жить здорово", 2017, "Айрис-пресс", 10);
//        Journal j3 = new Journal("Путешествия", 2017, "Дрофа", 5);
//        Journal j4 = new Journal("Автомобиль", 2021, "Дрофа", 14);
//        Journal j5 = new Journal("Природа", 2022, "Айрис-пресс", 1);

        PrintPub p[] = new PrintPub[5];
        p[0] = b1;
        p[1] = b2;
        p[2] = b3;
        p[3] = b4;
        p[4] = b5;
//        Book.sortBookDesk(p);
//        p[5] = j1;
//        p[6] = j2;
//        p[7] = j3;
//        p[8] = j4;
//        p[9] = j5;
//        for (int i = 0; i < p.length; i++) {
//            System.out.println(p[i].toString());
//        }
//        System.out.println();
//        System.out.println();
//        int l = 0;
//        System.out.println( Book.sortBookAsk(p));
//        Book.sortBookAsk(p);
//        Book.printMaxBook(p);
//        Book.sortBookDesk(p);
//        for (int i = 0; i < p.length; i++) {
//            System.out.println( Book.sortBookDesk(p));
//        }
       for (PrintPub pub:p){
           Book.sortBookDesc(p);}
        Book.printMaxBook(p);
//        Book.sortBookDesc(p);
//        Book.sortBookDesc(p);
//        System.out.println(Book.sortBookDesc(p));
    }
}


