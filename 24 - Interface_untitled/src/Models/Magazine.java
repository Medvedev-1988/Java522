package Models;

public class Magazine implements Printable {
    private String name;
    private int numberOfJournal;

    public Magazine(String name, int numberOfJournal) {
        this.name = name;
        this.numberOfJournal = numberOfJournal;
    }

    @Override
    public void print() {
        System.out.println("Печатаем журнал: " + name + ",выпуск: " + numberOfJournal);
    }
}
