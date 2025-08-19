//✅ Задание 1: Класс Person
//Создайте класс Person с приватными полями name (строка) и age (целое число).
//Добавьте геттеры и сеттеры для этих полей.
//Проверьте, что к полям нельзя получить доступ напрямую из другого класса.

//import models.Person;
//
//public class Main {
//    public static void main(String[] args) {
//        Person person = new Person("Dima", 36);

//import models.BankAccount;

//        person.name          // проверка на доступ из другого класса
//        person.age          // проверка на доступ из другого класса
//        person.setName("Valera");
//        person.setAge(40);
//        System.out.println(person.getName() + " " + person.getAge());
//    }
//}

//✅ Задание 2: Валидация возраста
// Модифицируйте класс Person: в сеттере для поля age запретите устанавливать отрицательные значения.
// Если передано недопустимое значение — игнорируйте установку и выведите сообщение об ошибке в консоль.

//import models.Person;
//
//public class Main {
//    public static void main(String[] args) {
//        Person person = new Person("Dima", 36);
//        person.setName("Valera");
//        person.setAge(-9);  // передаем недопустимое значение и выводим ошибку
//        System.out.println(person.getName() + " " + person.getAge());
//    }
//}

//✅ Задание 3: Только для чтения
//Создайте класс BankAccount с приватным полем balance.
//        Сделайте так, чтобы можно было только получить текущее значение баланса, но нельзя напрямую изменить его извне.
//Добавьте метод deposit() для пополнения счёта и withdraw() — для снятия средств.

//import models.BankAccount;
//
//public class Main {
//    public static void main(String[] args) {
//        BankAccount bankAccount = new BankAccount(100);
//        System.out.println(bankAccount.getBalance());
//        try {
//            bankAccount.deposit(50);
//        } catch (IllegalArgumentException e) {
//            System.out.println("Ошибка!" + e.getMessage());
//        }
//        System.out.println(bankAccount.getBalance());
//        try {
//            bankAccount.withdraw(200);
//        } catch (IllegalArgumentException e) {
//            System.out.println("Ошибка!" + e.getMessage());
//        }
//        System.out.println(bankAccount.getBalance());
//    }
//}

//✅ Задание 4: Только для записи
//Создайте класс Logger с приватным полем logLevel.
//Добавьте только сеттер для этого поля (без геттера), чтобы можно было установить уровень логирования, но нельзя было его узнать извне.

import models.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.setLogLevel("DEBUG");
        logger.log("запись лога");
//      logger.getLogLevel // попытка получить logLevel извне
    }
}

//✅ Задание 5: Изменяемость объекта
//Создайте класс UserProfile с приватными полями: username (строка), email (строка), password (строка).
//Добавьте геттеры и сеттеры.
//Добавьте валидацию:
//
//email должен содержать символ @
//
//password должен быть не короче 8 символов.
//Если проверка не проходит — данные не изменяются, а выводится сообщение об ошибке.

//import models.UserProfile;
//
//public class Main {
//    public static void main(String[] args) {
//        UserProfile user = new UserProfile("Dima", "dima-@mail.ru", "12345678");
//        System.out.println(user.getUsername());
//        System.out.println(user.getEmail());
//        System.out.println(user.getPassword());
//        user.setUsername("Тамара");
//        user.setEmail("tb1990mail.ru"); // проверка mail на символ @
//        user.setPassword("vorona"); // проверка пароля на 8 символов
//        System.out.println(user.getUsername());
//        System.out.println(user.getEmail());
//        System.out.println(user.getPassword());
//
//    }
//}