package Models;

public class Newspaper implements Printable {
    private String name;
    private int date;

    public Newspaper(String name, int date) {
        this.name = name;
        this.date = date;
    }

    @Override
    public void print() {
        System.out.println("Печатаем газету: " + name + " от: " + date + "г.");
    }
}
