//1. Деление с проверкой на ноль
//Описание:
//Напиши метод div(int a, int b), который делит a на b.
//Если b == 0, бросай стандартное исключение ArithmeticException.

//public class Main {
//    public static int div(int a, int b) {
//        return a / b;
//    }
//
//    public static void main(String[] args) {
//        try {
//            System.out.println(div(4, 0));
//        } catch (ArithmeticException e) {
//            System.out.println("Ошибка!На ноль делить нельзя!");
//        }
//    }
//}

//2. Чтение элемента массива
//Описание:
//Создай массив из 5 элементов.
//        Напиши метод, который по индексу выводит элемент массива.
//Если индекс выходит за пределы массива, обрабатывай ArrayIndexOutOfBoundsException и выводи сообщение "Индекс за пределами массива".

//public class Main {
//    public static int arrayIndex(int[] arr, int index) {
//        for (int i = 0; i < arr.length; i++) {
//                   arr[index]=arr[i];
//        }
//        return arr[index];
//    }
//
//    public static void main(String[] args) {
//        int[]arr={1,2,3,4,5};
//       try {
//           System.out.println(arrayIndex(arr,6));
//       } catch (ArrayIndexOutOfBoundsException e) {
//           System.out.println("Индекс за пределами массива ");
//       }
//    }
//}

//3. Парсинг числа из строки
//Описание:
//        Напиши метод, который принимает строку и конвертирует её в число (Integer.parseInt).
//Если строка некорректная (например "abc"), обрабатывай NumberFormatException и выводи "Ошибка преобразования строки в число".

//public class Main {
//    public static void parsInt(String str) {
//        try {
//            int number = Integer.parseInt(str);
//            System.out.println(number);
//        } catch (NumberFormatException e) {
//            System.out.println("Ошибка преобразования строки в число");
//        }
//
//    }
//
//    public static void main(String[] args) {
//       parsInt("123k");
//
//    }
//}

//4. Множественный catch
//Описание:
//        Напиши код, который может выбросить и ArithmeticException (деление на ноль) и ArrayIndexOutOfBoundsException (выход за границы массива).
//Лови эти два исключения в разных catch блоках.

//public class Main {
//    public static int div(int a,int b){
//
//        return a/b;
//    }
//    public static int getElement(int[]arr,int index){
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=arr[index];
//        }
//        return arr[index];
//    }
//
//    public static void main(String[] args) {
//        int[]arr={1,2,3,4,5};
//        try {
//            System.out.println(div(10,2));
//            System.out.println(getElement(arr,5));
//        }catch (ArrayIndexOutOfBoundsException ex){
//            System.out.println("Ошибка!Выход за границы массива!");
//        }catch (ArithmeticException ex){
//            System.out.println("На ноль делить нельзя!");
//        }
//    }
//}

//5. Использование объединённого catch
//Описание:
//        Тоже самое, но используй объединение (catch (ArithmeticException | ArrayIndexOutOfBoundsException e)).

//public class Main {
//    public static int div(int a,int b){
//
//        return a/b;
//    }
//    public static int getElement(int[]arr,int index){
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=arr[index];
//        }
//        return arr[index];
//    }
//
//    public static void main(String[] args) {
//        int[]arr={1,2,3,4,5};
//        try {
//            System.out.println(div(10,0));
//            System.out.println(getElement(arr,4));
//        }catch (ArrayIndexOutOfBoundsException  | ArithmeticException ex){
//            System.out.println("Ошибка! " + ex.getMessage());
//        }
//    }
//}

//6. Принудительный выброс исключения
//Описание:
//        Напиши метод, который всегда бросает IllegalArgumentException с сообщением "Это было сделано специально".

//public class Main {
//    public static void exception() {
//        throw new IllegalArgumentException("Это было сделано специально"); // принудительный метод
//    }
//
//    public static void main(String[] args) {

//        try {
//           throw new IllegalArgumentException();
//       } catch (IllegalArgumentException ex) {
//            System.out.println("Поймал принудительный метод"); // ловим принудительный метод
//        }
//    }
//}

//7. Работа с finally без catch
//Описание:
//        Напиши код, который делит два числа, и независимо от результата всегда пишет "Блок finally сработал".

//public class Main {
//    public static int div(int a, int b) {
//        return a / b;
//    }
//
//    public static void main(String[] args) {
//        try {
//            System.out.println(div(10, 0));
//        } catch (ArithmeticException ex) {
//            System.out.println("На ноль делить нельзя!");
//        } finally {
//            System.out.println("Блок finally сработал");
//        }
//    }
//}

//8. Перехват и повторный выброс исключения
//Описание:
//        Напиши код, который ловит исключение, выводит сообщение, а затем снова бросает его (throw e).

//public class Main {
//
//    public static void div(int a, int b) {
//        try {
//            System.out.println(a / b);
//        } catch (ArithmeticException ex) {
//            System.out.println("На ноль делить нельзя!");
//            throw ex;
//        }
//
//    }
//
//    public static void main(String[] args) {
//        div(10, 0);
//    }
//}

//9. Пользовательский ввод с проверкой
//Описание:
//Используй Scanner.
//Пусть пользователь вводит число.
//Если он ввёл что-то кроме числа, выводи сообщение об ошибке (InputMismatchException) и проси ввести снова.

//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class Main {
//
//    public static void enterNumb() {
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.print("Введите число: ");
//            try {
//                new Scanner(System.in).nextInt();
//                break;
//            }catch (InputMismatchException e){
//                System.out.println("Вы ввели не число,попробуйте снова");
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        enterNumb();
//    }
//}


//import java.util.Scanner;
//
//public class Main {
//    public static boolean isNumber(String str) {
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) < '0' || str.charAt(i) > '9') return false;
//        }
//        return true;
//    }
//
//    public static void enterNumb() {
//        while (true) {
//            System.out.print("Введите число: ");
//            String str = new Scanner(System.in).nextLine();
//            if (isNumber(str)) {
//                break;
//            } else {
//                System.out.println("Ты ввел не число");
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        enterNumb();
//    }
//}

//10. Обработка массива строк с числами
//Описание:
//Есть массив строк вида ["10", "20", "abc", "30"].
//Пробегись по массиву и попробуй превратить каждую строку в число.
//Если строка не число — обработай исключение и напиши "Некорректное значение: abc".


public class Main {

    public static void parsIntArray(String[]str) {

        for (int i = 0; i < str.length; i++) {
            String str1 = str[i];
            try {
                int number = Integer.parseInt(str1);
                System.out.println(number);
            } catch (NumberFormatException e) {
                System.out.println("Некорректное значение: " + str1);
            }
        }
    }

    public static void main(String[] args) {
        String[] str = {"10", "20", "abc", "30"};
        parsIntArray(str);
    }
}


