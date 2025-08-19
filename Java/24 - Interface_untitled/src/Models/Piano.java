package Models;

public class Piano implements Instrument {
    private int numberOfKeys;

    public Piano(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }

    @Override
    public void play() {
        System.out.println("Играет пианино с " + numberOfKeys + " клавишами. Звучит мелодия.");
    }
}
