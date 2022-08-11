package vkontaktePage;


public class Page {
    private String surname = new String();
    private String name = new String();
    private String city = new String();
    private String studyPlace = new String();
    private String сontactInformation = new String();
    private int friends;
    private int subscribers;
    private WallEnty[] wallEnties = new WallEnty[10000];

    public WallEnty[] getWallEnties() {
        return wallEnties;
    }

    public void setWallEnties(WallEnty[] wallEnties) {
        this.wallEnties = wallEnties;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStudyPlace() {
        return studyPlace;
    }

    public void setStudyPlace(String studyPlace) {
        this.studyPlace = studyPlace;
    }

    public String getСontactInformation() {
        return сontactInformation;
    }

    public void setСontactInformation(String сontactInformation) {
        this.сontactInformation = сontactInformation;
    }

    public int getFriends() {
        return friends;
    }

    public void setFriends(int friends) {
        this.friends = friends;
    }

    public int getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(int subscribers) {
        this.subscribers = subscribers;
    }

    public Page() {

    }

    public Page(String surname, String name, String city, String studyPlace, String сontactInformation, int friends, int subscribers) {
        this.surname = surname;
        this.name = name;
        this.city = city;
        this.studyPlace = studyPlace;
        this.сontactInformation = сontactInformation;
        this.friends = friends;
        this.subscribers = subscribers;
    }

    public void addWallEnty(WallEnty wallEnty) {

        for (int i = 0; i < this.wallEnties.length; i++) {
            if (this.wallEnties[i] == null) {
                this.wallEnties[i] = wallEnty;

                break;
            }
        }
    }
}
