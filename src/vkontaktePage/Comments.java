package vkontaktePage;

public class Comments {
    private String userName = new String();
    private String Coment = new String();

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getComent() {
        return Coment;
    }

    public void setComent(String coment) {
        Coment = coment;
    }

    public Comments() {

    }

    public Comments(String userName, String coment) {
        this.userName = userName;
        Coment = coment;
    }
}
