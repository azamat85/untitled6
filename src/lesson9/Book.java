package lesson9;

public class Book extends PrintPub {
    private String avtor;
    private int kolList;

    public Book() {

    }

    public Book(String name, int year, String pub, String avtor, int kolList) {
        super(name, year, pub);
        this.avtor = avtor;
        this.kolList = kolList;
    }

    public String getAvtor() {
        return avtor;
    }

    public void setAvtor(String avtor) {
        this.avtor = avtor;
    }

    public int getKolList() {
        return kolList;
    }

    public void setKolList(int kolList) {
        this.kolList = kolList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Book book = (Book) o;

        if (kolList != book.kolList) return false;
        return avtor != null ? avtor.equals(book.avtor) : book.avtor == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (avtor != null ? avtor.hashCode() : 0);
        result = 31 * result + kolList;
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "avtor='" + avtor + '\'' +
                ", kolList=" + kolList +
                ", name=" + super.getName() +
                ", pub=" + super.getPub() +
                ", year=" + super.getYear() +
                '}';
    }

    public static void printMaxBook(PrintPub p[]) {
        Book b = null;
        for (PrintPub pub : p) {
            if (pub instanceof Book) {
                if (b == null) {
                    b = (Book) pub;

                } else if (b.getKolList() < ((Book) pub).getKolList()) {
                    b = (Book) pub;
                }
            }


        }
        System.out.println(b);
    }

    //    public  static PrintPub[] sortBookAsk(PrintPub p[]){
//        for (int i = 0; i< p.length-1; i++){
//            if (p[i] instanceof Book) {
//                for (int j = 1 ; j< p.length-i;j++){
//                    if (p[j] instanceof Book) {
//                        if (((Book) p[i]).getKolList() < ((Book) p[j]).getKolList()) {
//                            int l = ((Book) p[j]).getKolList();
//                            ((Book) p[j]).setKolList(((Book) p[i]).getKolList());
//                            ((Book) p[i]).setKolList(l);
//                        }
//                    }
//                }
//            }
//        }
//
//
//        return p;
//    }
//    public  static PrintPub[] sortBookDesk(PrintPub p[]){
//        for (int i = 0; i< p.length-1; i++){
//            if (p[i] instanceof Book) {
//                for (int j = 1 ; j< p.length-i;j++) {
//                    if (p[j] instanceof Book) {
//                        if (((Book) p[i]).getKolList() > ((Book) p[j]).getKolList()) {
//                            int l = ((Book) p[j]).getKolList();
//                            ((Book) p[j]).setKolList(((Book) p[i]).getKolList());
//                            ((Book) p[i]).setKolList(l);
//                        }
//                    }
//                }
//            }
//        }
//
//
//        return p;
//    }
    public static PrintPub[] sortBookDesk(PrintPub p[]) {
        for (int i = 0; i < p.length; i++) {
            for (int j = 1 + i; j < p.length; j++) {
                if (((Book) p[i]).getKolList() > ((Book) p[j]).getKolList()) {
                    int t = ((Book) p[i]).getKolList();
                    ((Book) p[i]).setKolList(((Book) p[j]).getKolList());
                    ((Book) p[j]).setKolList(t);
                }
            }

            }
            return p;
        }
//    public static PrintPub[] sortBookDesc(PrintPub p[]) {
//        for (int i = 0; i < p.length; i++) {
//            for (int j = 1 + i; j < p.length; j++) {
//                if (p[i].getKolList() > p[j].getKolList()) {
//                    int l = p[j].getKolList();
//                    int t = p[i].getKolList();
//                    p[i].setKolList(l); // замена переменных
//                    p[j].setKolList(t);
//                }
//            }
//        }
//        return p;
//    }

}
