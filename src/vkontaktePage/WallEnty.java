package vkontaktePage;

public class WallEnty {
    private String writing = new String();
    private Comments[] comments = new Comments[10000];

    public String getWriting() {
        return writing;
    }

    public void setWriting(String writing) {
        this.writing = writing;
    }

    public Comments[] getComments() {
        return comments;
    }

    public void setComments(Comments[] comments) {
        this.comments = comments;
    }

    public WallEnty() {

    }

    public WallEnty(String writing) {
        this.writing = writing;
    }

    public void addComments(Comments comments) {

        for (int i = 0; i < this.comments.length; i++) {
            if (this.comments[i] == null) {
                this.comments[i] = comments;

                break;
            }
        }
    }
}
