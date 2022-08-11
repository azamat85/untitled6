package myHomeWorkLesson17;

public class Main {
   public static void main(String[] args) {

      HumanTechie humanTechie1 = new HumanTechie("Влад");
      HumanTechie humanTechie2 = new HumanTechie("Андрей");
      HumanTechie humanTechie3 = new HumanTechie("Дима");
      HumanTechie humanTechie4 = new HumanTechie("Вася");


      HumanGumanitariy humanGumanitariy1 = new  HumanGumanitariy("Саша");
      HumanGumanitariy humanGumanitariy2 = new HumanGumanitariy("Дима");
      HumanGumanitariy humanGumanitariy3 = new HumanGumanitariy("Арсений");
      HumanGumanitariy humanGumanitariy4 = new HumanGumanitariy("Никита");


      Team<HumanGumanitariy> team1 = new Team<>(" read");
      Team<HumanGumanitariy> team2 = new Team<>(" blue");
      Team<HumanTechie> team3 = new Team<>(" green");
      Team<HumanTechie> team4 = new Team<>(" white");


      team1.setPeople(humanTechie1);
      team1.setPeople(humanTechie2);

      team2.setPeople(humanTechie3);
      team2.setPeople(humanTechie4);

      team3.setPeople(humanGumanitariy1);
      team3.setPeople(humanGumanitariy2);

      team4.setPeople(humanGumanitariy3);
      team4.setPeople(humanGumanitariy4);

      Game.getWinner(team1,team2);
      Game.getWinner(team3,team4);
//      Game.getWinner(team1,team3);
   }
}
