package lesson14;



public class Otziv {
    private int rate;
    private String text;

    public Otziv() {
    }

    public Otziv(int rate, String text) {
        this.rate = rate;
        this.text = text;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Otziv otziv = (Otziv) o;

        if (rate != otziv.rate) return false;
        return text != null ? text.equals(otziv.text) : otziv.text == null;
    }

    @Override
    public int hashCode() {
        int result = rate;
        result = 31 * result + (text != null ? text.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Отзыв" +
                " рейтинг " + rate +
                ", текст '" + text + '\'';
    }

}
