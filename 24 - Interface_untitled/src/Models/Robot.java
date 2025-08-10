package Models;

public class Robot implements Movable {
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public void moveForward() {
        System.out.println("Робот " + name + " делает шаг вперед");
    }

    @Override
    public void moveBackward() {
        System.out.println("Робот " + name + " делает шаг назад");
    }
}
