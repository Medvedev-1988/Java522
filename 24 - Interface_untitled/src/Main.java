//1. Интерфейс "Движение"
//Создай интерфейс Movable с методами:
//
//void moveForward();
//
//void moveBackward();
//
//Создай классы Car, Robot, Animal, которые реализуют этот интерфейс по-своему.

//import Models.Animal;
//import Models.Car;
//import Models.Robot;
//
//public class Main {
//    public static void main(String[] args) {
//        Car car = new Car("Мерседес");
//        Robot robot = new Robot("Фёдор");
//        Animal animal = new Animal(100);
//        car.moveForward();
//        car.moveBackward();
//        robot.moveForward();
//        robot.moveBackward();
//        animal.moveForward();
//        animal.moveBackward();
//    }
//}

//2. Интерфейс "Фигура"
//Создай интерфейс Shape с методами:
//
//double area();
//
//double perimeter();
//
//Создай классы Circle, Rectangle, Triangle, которые реализуют интерфейс.

import Models.Circle;
import Models.Rectangle;
import Models.Triangle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        Rectangle rectangle = new Rectangle(2, 4);
        Triangle triangle = new Triangle(3, 3, 3);
        System.out.println("Площадь круга: " + circle.area());
        System.out.println("Периметр круга: " + circle.perimeter());
        System.out.println("Площадь прямоугольника: " + rectangle.area());
        System.out.println("Периметр прямоугольника: " + rectangle.perimeter());
        System.out.println("Площадь треугольника: " + triangle.area());
        System.out.println("Периметр треугольника: " + triangle.perimeter());
    }
}

//3. Интерфейс "Музыкальный инструмент"
//Создай интерфейс Instrument с методом:
//
//void play();
//
//Реализуй интерфейс в классах: Guitar, Piano, Drums.

//import Models.Drums;
//import Models.Guitar;
//import Models.Piano;
//
//public class Main {
//    public static void main(String[] args) {
//        Guitar guitar = new Guitar("Fender");
//        Piano piano = new Piano(88);
//        Drums drums = new Drums("Yamaha");
//        guitar.play();
//        piano.play();
//        drums.play();
//    }
//}

//4. Интерфейс "Печатное устройство"
//Интерфейс Printable:
//
//void print();
//
//Классы: Book, Magazine, Newspaper.

//import Models.Book;
//import Models.Magazine;
//import Models.Newspaper;
//
//public class Main {
//    public static void main(String[] args) {
//        Book book = new Book("До встречи с тобой", "ДжоДЖо Мойез");
//        Magazine magazine = new Magazine("Колобок", 9);
//        Newspaper newspaper = new Newspaper("Московский комсомолец", 2025);
//        book.print();
//        magazine.print();
//        newspaper.print();
//    }
//}

//5. Интерфейс "Платёжная система"
//Интерфейс Payment:
//
//void pay(double amount);
//
//Реализующие классы: CreditCardPayment, PayPalPayment, CryptoPayment.

//import Models.CreditCardPayment;
//import Models.CryptoPayment;
//import Models.PayPalPayment;
//
//public class Main {
//    public static void main(String[] args) {
//        CreditCardPayment creditCardPayment = new CreditCardPayment("Veleriy Myasnikov", 12341234);
//        PayPalPayment payPalPayment = new PayPalPayment("tetris@mail.ru");
//        CryptoPayment cryptoPayment = new CryptoPayment("0234234sadasda4", "Bitcoin");
//        creditCardPayment.pay(500);
//        System.out.println("------");
//        payPalPayment.pay(600);
//        System.out.println("------");
//        cryptoPayment.pay(100);
//        System.out.println("------");
//    }
//}