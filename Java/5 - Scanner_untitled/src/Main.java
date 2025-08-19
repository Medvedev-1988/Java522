import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//    1)
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите день денели: ");
//        System.out.println("1 -> понедельник");
//        System.out.println("2 -> вторник");
//        System.out.println("3 -> среда");
//        System.out.println("4 -> четверг");
//        System.out.println("5 -> пятница");
//        System.out.println("6 -> суббота");
//        System.out.println("7 -> воскресение");
//        int dayOfTheWeek = scanner.nextInt();
//        switch (dayOfTheWeek) {
//            case 1:
//                System.out.println("Это понедельник");
//                break;
//            case 2:
//                System.out.println("Это вторник");
//                break;
//            case 3:
//                System.out.println("Это среда");
//                break;
//            case 4:
//                System.out.println("Это четверг");
//                break;
//            case 5:
//                System.out.println("Это пятница");
//                break;
//            case 6:
//                System.out.println("Это суббота");
//                break;
//            case 7:
//                System.out.println("Это воскресение");
//                break;
//            default:
//                System.out.println("неверный выбор");
//        }
//        2)
//        System.out.print("Введите номер месяца: ");
//        int month = scanner.nextInt();
//        switch (month) {
//            case 1:
//                System.out.println("Это январь");
//                break;
//            case 2:
//                System.out.println("Это февраль");
//                break;
//            case 3:
//                System.out.println("Это март");
//                break;
//            case 4:
//                System.out.println("Это апрель");
//                break;
//            case 5:
//                System.out.println("Это май");
//                break;
//            case 6:
//                System.out.println("Это июнь");
//                break;
//            case 7:
//                System.out.println("Это июль");
//                break;
//            case 8:
//                System.out.println("Это авгст");
//                break;
//            case 9:
//                System.out.println("Это сентябрь");
//                break;
//            case 10:
//                System.out.println("Это октябрь");
//                break;
//            case 11:
//                System.out.println("Это ноябрь");
//                break;
//            case 12:
//                System.out.println("Это декабрь");
//                break;
//            default:
//                System.out.println("Неверный выбор");
//        }
//        3)
//        System.out.print("Введите номер счёта: ");
//        int accountNumber = scanner.nextInt();
//        switch (accountNumber) {
//            case 1:
//                System.out.println("Выбран первый счёт");
//                break;
//            case 2:
//                System.out.println("Выбран второй счёт");
//                break;
//            case 3:
//                System.out.println("Выбран третий счёт");
//                break;
//            case 4:
//                System.out.println("Выбран четвёртый счёт");
//                break;
//            case 5:
//                System.out.println("Выбран пятый счёт");
//                break;
//            default:
//                System.out.println("Неверный выбор");
//        }
//        4)
//        System.out.print("Введите оценку: ");
//        int evaluation = scanner.nextInt();
//        switch (evaluation) {
//            case 1:
//                System.out.println("Неудовлетворительно");
//                break;
//            case 2:
//                System.out.println("Плохо");
//                break;
//            case 3:
//                System.out.println("Удовлетворительно");
//                break;
//            case 4:
//                System.out.println("Хорошо");
//                break;
//            case 5:
//                System.out.println("Отлично");
//                break;
//            default:
//                System.out.println("неверный выбор");
//        }
//        5)
//        System.out.print("Введите символ: ");
//        char symbol = scanner.next().toUpperCase().charAt(0);
//        if (symbol >= 'A' && symbol <= 'Z') {
//            switch (symbol) {
//                case 'A','E','I','O','U','Y':
//                    System.out.println("Это гласная");
//                    break;
//                default:
//                    System.out.println("Это согласная");
//            }
//        }else {
//            System.out.println("неверный выбор");
//        }
//        6)
//        System.out.print("Введите символ: ");
//        char ch = scanner.next().charAt(0);
//
//        // Приведение char к int для использования в switch
//        int charCode = (int) ch;
//
//        switch (charCode) {
//            case 48:
//            case 49:
//            case 50:
//            case 51:
//            case 52:
//            case 53:
//            case 54:
//            case 55:
//            case 56:
//            case 57:
//                System.out.println(ch + " - это цифра.");
//                break;
//
//
//            case 65:
//            case 66:
//            case 67:
//            case 68:
//            case 69:
//            case 70:
//            case 71:
//            case 72:
//            case 73:
//            case 74:
//            case 75:
//            case 76:
//            case 77:
//            case 78:
//            case 79:
//            case 80:
//            case 81:
//            case 82:
//            case 83:
//            case 84:
//            case 85:
//            case 86:
//            case 87:
//            case 88:
//            case 89:
//            case 90:
//            case 97:
//            case 98:
//            case 99:
//            case 100:
//            case 101:
//            case 102:
//            case 103:
//            case 104:
//            case 105:
//            case 106:
//            case 107:
//            case 108:
//            case 109:
//            case 110:
//            case 111:
//            case 112:
//            case 113:
//            case 114:
//            case 115:
//            case 116:
//            case 117:
//            case 118:
//            case 119:
//            case 120:
//            case 121:
//            case 122:
//                System.out.println(ch + " - это буква.");
//                break;
//
//            default:
//                System.out.println(ch + " - это специальный символ.");
//                break;
//        }
//        7)
//        System.out.print("Введите код системы: ");
//        int code = scanner.nextInt();
//        switch (code) {
//            case 1:
//                System.out.println("Windows");
//                break;
//            case 2:
//                System.out.println("Linux");
//                break;
//            case 3:
//                System.out.println("macOS");
//                break;
//            default:
//                System.out.println("неверный выбор");
//        }
//        8)
//        System.out.print("Введите возраст: ");
//        int age = scanner.nextInt();
//        switch (age/9) {
//            case 0:
//                System.out.println("Ребенок");
//                break;
//            case 1:
//                System.out.println("Подросток");
//                break;
//            case 2,3,4,5,6,7:
//                System.out.println("Взрослый");
//                break;
//            case 8,9,10,11:
//                System.out.println("Пожилой");
//                break;
//            default:
//                System.out.println("неверный выбор");
//        }
//        9)
//        System.out.print("Введите число месяца: ");
//        int month = scanner.nextInt();
//        switch (month) {
//            case 12,1,2:
//                System.out.println("Зима");
//                break;
//            case 3,4,5:
//                System.out.println("Весна");
//                break;
//            case 6,7,8:
//                System.out.println("Лето");
//                break;
//            case 9,10,11:
//                System.out.println("Осень");
//                break;
//
//            default:
//                System.out.println("неверный выбор");
//        }
//        10)
        System.out.print("Введите код валюты: ");
        String currency = scanner.nextLine().toUpperCase();
        switch (currency) {
            case "USD":
                System.out.println("Доллар США");
                break;
            case "EUR":
                System.out.println("Евро");
                break;
            case "GBR":
                System.out.println("Британский фунт");
                break;
            default:
                System.out.println("неверный выбор");
        }
    }
}