package Classes;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Тип фигуры : Круг");
        System.out.println("Радиус : " + radius);
        System.out.println("Площадь : " + getArea());
    }
}
