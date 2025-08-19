package Models;

public class Animal implements Movable {
    private int distance;

    public Animal(int distance) {
        this.distance = distance;
    }

    @Override
    public void moveForward() {
        System.out.println("Животное бежит вперед " + distance + " метров");
    }

    @Override
    public void moveBackward() {
        System.out.println("Животное бежит назад " + distance + " метров");
    }
}
