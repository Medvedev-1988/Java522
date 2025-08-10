package Models;

public class Drums implements Instrument {
    private String brand;

    public Drums(String brand) {
        this.brand = brand;
    }

    @Override
    public void play() {
        System.out.println("Играют барабаны " + brand + " . Звучит ритм.");
    }
}
