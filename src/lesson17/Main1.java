package lesson17;



public class Main1 {
    public static void main(String[] args) {
        TeamRed klass5 = new TeamRed("пятиклашки");
        TeamBlue klass11 = new TeamBlue("взрослые");

        People p1 = new People("Vova",14);
        People p2 = new People("Sane",14);
        People p3 = new People("Slava",18);
        People p4 = new People("Vova",18);
        klass5.setPeople(p1);
        klass5.setPeople(p2);
        klass5.setPeople(p3);
        klass5.setPeople(p4);

        Game.getWinner(klass5,klass5);
    }
}
