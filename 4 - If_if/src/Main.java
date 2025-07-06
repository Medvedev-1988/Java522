public class Main {
    public static void main(String[] args) {
//       1)
        int a = -1;
        if (a > 0) {
            System.out.println("число: " + a + " -> положительное");
        } else {
            System.out.println("число: " + a + " -> отрицательное");
        }
//        2)
        int b = 3;
        if (b % 2 == 0) {
            System.out.println("Число: " + b + " -> чётное");
        } else {
            System.out.println("Число: " + b + " -> нечётное");
        }
//        3)
        int age = 18;
        if (age >= 18) {
            System.out.println("Совершеннолетний");
        } else {
            System.out.println("Несовершеннолетний");
        }
//        4)
        int c = 7;
        if (c % 3 == 0) {
            System.out.println("Делится на 3");
        } else {
            System.out.println("Не делится на 3");
        }
//        5)
        int temperature = -1;
        if (temperature < 0) {
            System.out.println("Замерзает");
        } else {
            System.out.println("Кипит");
        }
//        6)
        int password = 1234;
        if (password == 1234) {
            System.out.println("Доступ разрешен");
        } else {
            System.out.println("Доступ не разрешен");
        }
//        7)
        String login = "dima";
        if (login.equalsIgnoreCase("admin")) {
            System.out.println("Добро пожаловать!");
        } else {
            System.out.println("Доступ запрещен!");
        }
//        8)
        int hour = 18;
        if (hour > 6 && hour < 22) {
            System.out.println("Сейчас день");
        } else {
            System.out.println("Сейчас ночь");
        }
//        9)
        int month = 4;
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Сейчас зима");
        } else {
            System.out.println("Сейчас не зима");
        }
//        10)
        int d = 4, v = 3;
        if (d > v) {
            System.out.println("Число " + v + " меньше числа " + d);
        } else {
            System.out.println("Число " + d + " меньше числа " + v);
        }
    }
}