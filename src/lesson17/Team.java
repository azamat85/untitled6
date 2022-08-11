package lesson17;

import java.util.ArrayList;

public abstract class Team {
    private String teamName;
    ArrayList<People> people= new ArrayList<>();

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public ArrayList<People> getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people.add(people);
    }

    @Override
    public String toString() {
        return "TeamRed{" +
                "teamName='" + teamName + '\'' +
                ", people=" + people +
                '}';
    }
}
