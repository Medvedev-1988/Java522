//✅ 1. Калькулятор с выбором операции
//Условие:
//Пользователь вводит два числа и символ операции (+, -, *, /). Выведите результат.
//Цель: условные операторы, арифметика, Scanner.

//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        try {
//            System.out.print("Введите первое число: ");
//            double num1 = scanner.nextDouble();
//            System.out.print("Введите символ для операции(+,-,*,/ : ");
//            String opSymb = scanner.next();
//            System.out.print("Введите второе число: ");
//            double num2 = scanner.nextDouble();
//            double result = 0;
//            switch (opSymb) {
//                case "+":
//                    result = num1 + num2;
//                    System.out.println("Результат равен: " + result);
//                    break;
//                case "-":
//                    result = num1 - num2;
//                    System.out.println("Результат равен: " + result);
//                    break;
//                case "*":
//                    result = num1 * num2;
//                    System.out.println("Результат равен: " + result);
//                    break;
//                case "/":
//                    if (num2 == 0) {
//                        System.out.println("Ошибка!На ноль делить нельзя!");
//                        return;
//                    }
//                    result = num1 / num2;
//                    System.out.println("Результат равен: " + result);
//                    break;
//                default:
//                    System.out.println("Неверная операция!");
//                    return;
//            }
//        } catch (InputMismatchException e) {
//            System.out.println("Ошибка!Вы ввели не число");
//            scanner.next();
//        }
//    }
//}

//✅ 2. Чётное или нечётное число
//Условие:
//Пользователь вводит число. Определите, чётное оно или нечётное.
//Цель: остаток от деления, if.

//public class Main {
//    public static void isEvenNum() {
//        Scanner scanner = new Scanner(System.in);
//        try {
//            System.out.print("Введите число: ");
//            int num = scanner.nextInt();
//            if (num % 2 == 0) {
//                System.out.println("Число: " + num + " четное");
//            } else {
//                System.out.println("Число: " + num + " нечетное");
//            }
//        } catch (InputMismatchException e) {
//            System.out.println("Ошибка!Вы ввели не число!");
//        }
//    }
//
//    public static void main(String[] args) {
//        isEvenNum();
//    }
//}

//✅ 3. Максимум из трёх чисел
//Условие:
//Ввести три числа. Напечатать наибольшее из них. Если 2 числа больше то надо указать что а и б больше если все 3 равны то указать все числа равны

//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        try {
//            System.out.print("Введите первое число : ");
//            int a = scanner.nextInt();
//            System.out.print("Введите второе число : ");
//            int b = scanner.nextInt();
//            System.out.print("Введите третье число : ");
//            int c = scanner.nextInt();
//            if (a == b && a == c) {
//                System.out.println("Все числа равны: " + a);
//            } else if (a >= b && a >= c) {
//                if (a == b) {
//                    System.out.println("Наибольшее число " + a + "(первое и второе числа равны)");
//                } else if (a == c) {
//                    System.out.println("Наибольшее число " + a + "(первое и третье числа равны)");
//                } else {
//                    System.out.println("Наибольшее число " + a);
//                }
//            } else if (b >= a && b >= c) {
//                if (b == c) {
//                    System.out.println("Наибольшее число " + a + "(второе и третье числа равны)");
//                } else {
//                    System.out.println("Наибольшее число " + b);
//                }
//            } else {
//                System.out.println("Наибольшее число " + c);
//            }
//        } catch (InputMismatchException e) {
//            System.out.println("Ошибка!Вы ввели не число!");
//        }
//    }
//}

//✅ 4. Таблица умножения (от 1 до 10)
//Условие:
//Выведите таблицу умножения от 1 до 10.
//Цель: вложенные циклы for.

//public class Main {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 10; i++) {
//            for (int j = 1; j <= 10; j++) {
//                System.out.print(i + "x" + j + "=" + (i * j) + "\t");
//            }
//            System.out.println();
//        }
//    }
//}

// 5. Проверка числа на простоту
//Условие:
//Проверьте, является ли число простым (делится только на 1 и себя).

//public class Main {
//    public static boolean isPrime(int number) {
//        if (number < 2) {
//            return false;
//        }
//        if (number == 2) {
//            return true;
//        }
//        if (number % 2 == 0) {
//            return false;
//        }
//        for (int i = 3; i * i <= number; i += 2) {
//            if (number % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(isPrime(60));
//
//    }
//}

//✅ 6. Поиск слова в массиве строк
//Условие:
//Пользователь вводит слово, а программа ищет его в массиве строк.
//        Цель: строки, массивы, цикл.

//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String[] words = {"Стол", "Стул", "Яблоко", "Апельсин", "Мяч"};
//        System.out.print("Введите строку для поиска: ");
//        String searchWord = scanner.nextLine();
//        boolean found = false;
//        for (int i = 0; i < words.length; i++) {
//            if (words[i].equalsIgnoreCase(searchWord)){
//                found=true;
//                break;
//            }
//        }
//        if (found) {
//            System.out.println("Слово: " + searchWord + " найдено в массиве");
//        } else {
//            System.out.println("Слово: " + searchWord + " не найдено в массиве");
//        }
//    }
//}

//✅ 7. Простое меню с switch
//Условие:
//Сделайте текстовое меню (1 — вывести приветствие, 2 — вывести дату, 3 — выход).

//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("===== Меню =====");
//        System.out.println("Введите 1,2,3 для выбора");
//        System.out.println("1 - Приветствие");
//        System.out.println("2 - Дата");
//        System.out.println("3 - Выход");
//        try {
//            int menu = scanner.nextInt();
//            switch (menu) {
//                case 1:
//                    System.out.println("Добро пожаловать!");
//                    break;
//                case 2:
//                    System.out.println("12.05.2025");
//                    break;
//                case 3:
//                    System.out.println("До свидания!");
//                    break;
//                default: {
//                    System.out.println("Неверный диапозон!Попробуйте снова");
//                }
//
//            }
//        } catch (InputMismatchException e) {
//            System.out.println("Ошибка!Вы ввели не число!");
//        }
//    }
//}

//✅ 8. Обратный порядок массива
//Условие:
//Разверните массив в обратном порядке без использования дополнительных библиотек.

//public class Main {
//    public static void reverseArray(int[] arr, int size) {
//        size--;
//        if (size >= 0) {
//            System.out.print(arr[size] + " ");
//            reverseArray(arr, size);
//
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
//        reverseArray(arr, arr.length);
//    }
//}

//✅ 9. Обратный порядок массива
//Условие:
//        1) Есть 2 массива в отсортированнов виде
//
//int[] arr = {-5,0,1,1,2,3,6,8,22,45,678}
//int[] arr2 = {-10,2,3,6,7,7,7,9,11,1000,1010,1100}
//
//
//int[] arr3 = { -10,-5,0,1,1,2,2,3,3,6,6,7,7,7,8,9,11,22,45,678,1000,1010,1100}
//
//
//Нельзя использовать сортировку
//
//
//public static int[] twoArr(int[] one, int[] two) {
//
//    return arr3;
//}

public class Main {
//    public static int[] twoArr(int[] one, int[] two) {
//        int[] arr3 = new int[one.length + two.length];
//        int indexOne = 0;
//        int indexTwo = 0;
//        for (int i = 0; i < arr3.length; i++) {
//            if (indexOne < one.length && (indexTwo == two.length || one[indexOne] < two[indexTwo])) {
//                arr3[i] = one[indexOne];
//                indexOne++;
//            } else {
//                arr3[i] = two[indexTwo];
//                indexTwo++;
//            }
//        }
//        return arr3;
//    }

    public static int[] sortArray(int[] arrOne, int[] arrTwo) {
        int[] arr3 = new int[arrOne.length + arrTwo.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arrOne.length && j < arrTwo.length) {
            if (arrOne[i] <= arrTwo[j]) {
                arr3[k++] = arrOne[i++];
            } else {
                arr3[k++] = arrTwo[j++];
            }
        }
        while (i < arrOne.length) {
            arr3[k++] = arrOne[i++];
        }
        while (j < arrTwo.length) {
            arr3[k++] = arrTwo[j++];
        }

        return arr3;
    }

    public static void main(String[] args) {
        int[] arr = {-5, 0, 1, 1, 2, 3, 6, 8, 22, 45, 678};
        int[] arr2 = {-10, 2, 3, 6, 7, 7, 7, 9, 11, 1000, 1010, 1100};

//        int[] arr3 = twoArr(arr, arr2);
        int[] arr3 = sortArray(arr, arr2);
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
        
//        int[] arr3 = { -10,-5,0,1,1,2,2,3,3,6,6,7,7,7,8,9,11,22,45,678,1000,1010,1100}

    }
}