import Classes.Employee;
import Classes.Manager;
import Classes.User;
import Classes.Citizen;
import Classes.Passport;
import Classes.Person;

//Задание 1 — Наследование и инкапсуляция
//        Создай класс Employee с полями name, age, id.
//        Сделай так, чтобы поле id было уникальным для каждого нового сотрудника.
//        Добавь геттеры и сеттеры, при этом:
//        Возраст можно установить только в диапазоне от 18 до 65.
//        Имя не должно быть пустым.
//        Создай класс Manager, который наследуется от Employee и добавь ему поле department.


public class Main {
    public static void main(String[] args) {
//        Employee employee = new Employee("Dima", 36);
//        Employee employee1 = new Employee("Tamara", 34);
//        Employee employee2 = new Employee("Dima", 36);
//        employee.setAge(75);
//        employee.setName(" ");
//        System.out.println("Сотрудник: " + employee.getName() + " Возраст: " + employee.getAge() + " id: " + employee.getId());
//        System.out.println("Сотрудник: " + employee1.getName() + " Возраст: " + employee1.getAge() + " id: " + employee1.getId());
//        System.out.println("Сотрудник: " + employee2.getName() + " Возраст: " + employee2.getAge() + " id: " + employee2.getId());
//        Manager manager = new Manager("Ruslan", 36, "Clining");
//        System.out.println("Менеджер: " + manager.getName() + " Возраст: " + manager.getAge() + " id: " + manager.getId() + " Отдел: " + manager.getDepartment());


//Задание 2 — Статические поля и методы
//Создай класс User, который хранит количество всех созданных пользователей (static count).
//Каждый раз при создании объекта User, count должен увеличиваться.
//Добавь static метод getCount() для получения общего числа пользователей.
//Добавь static блок инициализации, который выводит сообщение при первом запуске класса.


//        User user=new User("Dima",36);
//        User user1=new User("Oleg",32);
//        User user2=new User("Ruslan",36);
//        System.out.println(User.getCount());


//Задание 3 — Проверка валидности данных и вывод
//Создай класс Person с полями name, age.
//Добавь метод boolean isValid() — возвращает true, если:
//имя не null и не пустое
//возраст > 0
//Добавь метод printInfo(), который выводит имя и возраст только если данные валидны.

//        Person person=new Person("",36);
//        person.printInfo();

//Задание 4 — Использование final и проверок
//Создай класс Passport с полями:
//final String number — номер паспорта (неизменяемый)
//String nationality
//        Добавь конструктор, геттеры.
//Создай класс Citizen, у которого есть поле Passport passport.
//        Добавь метод, который печатает паспортные данные гражданина.

        Passport passport = new Passport("Russia", "12345");
        Citizen citizen = new Citizen("Dima", passport);
        citizen.printPassportInfo();
    }
}
