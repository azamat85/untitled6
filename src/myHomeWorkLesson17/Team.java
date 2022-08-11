package myHomeWorkLesson17;

import java.util.ArrayList;

public class Team<T> {

    private String nameTeam;
    ArrayList<People> people = new ArrayList<>();

    public Team() {
    }

    public Team(String nameTeam) {
        this.nameTeam = nameTeam;

    }

    public String getNameTeam() {
        return nameTeam;
    }

    public void setNameTeam(String nameTeam) {
        this.nameTeam = nameTeam;
    }

    public ArrayList<People> getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people.add(people);
    }

    @Override
    public String toString() {
        return "Team{" +
                "nameTeam='" + nameTeam + '\'' +
                ", people=" + people +
                '}';
    }
}
