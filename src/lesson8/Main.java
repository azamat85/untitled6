package lesson8;

public class Main {
    public static void main(String[] args) {
        Matrix m1 = new Matrix(3, 2);
        double i = m1.getValueAt(2, 2);
        if (i == -1) {
            System.out.println("Массив вышел из границы");
        }
        m1.setValueAt(2, 2, 15);

        double val = m1.getValueAt(1, 1);
        if (i == -1) {
            System.out.println("Массив вышел из границы");
        } else {
            if (val == 15) {
                System.out.println("сохранено");
            } else {
                System.out.println("не сохранено");
            }
        }
        m1.setValueAt(1, 1, 2);
        m1.setValueAt(1, 2, 5);
        m1.setValueAt(2, 1, 6);
        m1.setValueAt(3, 1, 6);
        m1.setValueAt(3, 2, 6);
//        m1.setValueAt(2, 3, 9);
//        m1.setValueAt(3, 1, 8);
//        m1.setValueAt(3, 2, 2);
//        m1.setValueAt(3, 3, 0);
//        m1.setValueAt(1, 3, 9);
        System.out.println();
        m1.printToConsole();
        Matrix m2 = new Matrix(2, 3);
        m2.setValueAt(1, 1, 1);
        m2.setValueAt(1, 2, 5);


        m2.setValueAt(2, 2, 8);
        m2.setValueAt(2, 1, 4);


        m2.setValueAt(2, 3, 4);
        m2.setValueAt(1, 3, 4);


        System.out.println();
        m2.printToConsole();
//        System.out.println();
//        System.out.println(m1.isSquareMatrix());
//        m1.add(m1).printToConsole();
//        System.out.println();
//        m1.transpose().printToConsole();
//        System.out.println();
//        System.out.println();
//        m1.mul(m2).printToConsole();

    }
}
