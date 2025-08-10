package Models;

public class Car implements Movable {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public void moveForward() {
        System.out.println(model + " едет вперед");
    }

    @Override
    public void moveBackward() {
        System.out.println(model + " едет назад");
    }
}
