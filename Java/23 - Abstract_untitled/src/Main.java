//1. Финальный класс
//        Задание:
//        Создай финальный класс MathConstants, в котором будут финальные переменные PI и E.
//        Попробуй создать от него наследника. Объясни, что произошло и почему.

//// попытка создать наследника, выдаст ошибку, т.к класс MathConstants final

//import Classes.MathConstants;
//
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("PI = " + MathConstants.PI);
//        System.out.println("E = " + MathConstants.E);
//    }
//}

//2. Переопределение метода (Overriding)
//Задание:
//Создай класс Animal с методом speak(), который выводит "Животное издает звук".
//Создай класс Dog, который наследует Animal и переопределяет метод speak() — пусть выводит "Собака лает".
//Создай объект Animal и Dog и вызови метод speak() у каждого.

//import Classes.Animal;
//import Classes.Dog;
//
//public class Main {
//    public static void main(String[] args) {
//        Animal animal = new Animal();
//        animal.speak();
//        Dog dog = new Dog();
//        dog.speak();
//    }
//}

//3. Наследование
//Задание:
//Создай класс Person с полями name и age.
//Создай подкласс Student, добавь поле university.
//Создай конструкторы и методы для вывода полной информации.
//Создай объект Student и выведи данные.

//import Classes.Student;
//
//public class Main {
//    public static void main(String[] args) {
//        Student student = new Student("Dima", 36, "Российский государственный строительный университет");
//        student.getInfo();
//    }
//}

//4. Абстрактный класс
//Задание:
//Создай абстрактный класс Shape с абстрактным методом getArea() и обычным методом printInfo().
//Создай класс Circle, который наследует Shape и реализует метод getArea().
//Создай объект Circle и выведи площадь круга.

//import Classes.Circle;
//
//public class Main {
//    public static void main(String[] args) {
//        Circle circle = new Circle(3.0);
//        circle.printInfo();
//    }
//}

//5. Абстрактный метод + массив объектов
//Задание:
//Создай абстрактный класс Employee с методом calculateSalary().
//Создай два подкласса: FullTimeEmployee и PartTimeEmployee, каждый со своей реализацией зарплаты.
//Создай массив Employee[] и заполни его объектами разных классов. Выведи зарплату каждого.

//import Classes.Employee;
//import Classes.FullTimeEmployee;
//import Classes.PartTimeEmployee;
//
//public class Main {
//    public static void main(String[] args) {
//        Employee[] employees = new Employee[3];
//        employees[0] = new FullTimeEmployee("Dima", 85000);
//        employees[1] = new PartTimeEmployee("Maxim", 500, 176);
//        employees[2] = new FullTimeEmployee("Tamara", 100000);
//        for (int i = 0; i < employees.length; i++) {
//            Employee employee = employees[i];
//            System.out.println("Имя: "+ employee.getName());
//            System.out.println("Зарплата: "+ employee.calculateSalary());
//            System.out.println("-----");
//        }
//    }
//}

//6. int[] arr = {9,1,7,2,8,4,5,0,2};
//
//Отсортировать массив
//Нельзя использовать готовое решение

public class Main {
    public static void main(String[] args) {
        int[] arr = {9, 1, 7, 2, 8, 4, 5, 0, 2};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print("Отсортированный массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}