//        Техническое задание "Угадай число"
//        Цель игры
//        Угадать случайное число компьютера за 5 попытки
//
//        Технические требования
//        Генерация числа
//
//        Диапазон: 1-100
//        Генерация: Random.nextInt(100) + 1
//
//        Правила игры
//
//        5 попытки
//        После каждой попытки выводится подсказка:
//
//        "Больше"
//        "Меньше"
//        "Угадал!"
//
//        Интерфейс
//
//        Консольное приложение
//        Использовать Scanner для ввода
//        Простые информативные сообщения
//
//        Логика игры
//
//        Сравнение введенного числа с загаданным
//        Ограничение попыток
//        Завершение игры при угадывании или исчерпании попыток
//
//        Условия завершения
//
//        Победа: число угадано
//        Поражение: попытки закончились

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int min = 1, max = 100;
        int count = 0;
        int randomNumber = random.nextInt(max - min + 1) + min;
        boolean guest = false;

        System.out.println("                         ===== Игра =====");
        System.out.println("Цель игры : угадай число,загаданное компьютером в диапазоне от " + min + " до " + max + "\nУ вас будет 5 попыток отгадать число");
        System.out.println("Итак,компьютер загадал число от " + min + " до " + max);
        while (!guest) {
            System.out.print("Введите ваше число : ");
            int guestNumber = scanner.nextInt();
            count++;
            if (count == 5) {
                System.out.println("Вы проиграли!Вы исчерпали " + count + " попыток ");
                break;
            }
            if (guestNumber < min || guestNumber > max) {
                System.out.println("Ошибка!Введите число заново в диапазоне от " + min + " до " + max);
            } else {
                if (guestNumber < randomNumber) {
                    System.out.println("Больше");
                } else if (guestNumber > randomNumber) {
                    System.out.println("Меньше");
                } else {
                    System.out.println("Поздравляю!Вы угадали число : " + randomNumber);
                    System.out.println("Количество попыток : " + count);
                    guest = true;
                }
            }
        }
    }
}
