package Models;

public class Guitar implements Instrument {
    private String model;

    public Guitar(String model) {
        this.model = model;
    }

    @Override
    public void play() {
        System.out.println("Играет гитара марки " + model + ". Звучит аккорд.");
    }
}
