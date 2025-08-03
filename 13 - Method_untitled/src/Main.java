//✅ 1. Метод sayHi()
//Принимает: ничего
//Возвращает: void
//Что делает: выводит "Привет!" в консоль

//public class Main {
//    public static void sayHi() {
//        System.out.println("Привет!");
//    }
//    public static void main(String[] args) {
//        sayHi();
//    }
//}

//✅ 2. Метод square(int number)
//Принимает: одно int число
//Возвращает: int
//Что делает: возвращает квадрат числа

//public class Main {
//    public static int square(int number) {
//        int multi = 1;
//        multi=number*number;
//
//        return multi;
//    }
//    public static void main(String[] args) {
//
//        System.out.println(square(6));
//    }
//}

//✅ 3. Метод greetByName(String name)
//Принимает: строку name
//Возвращает: void
//Что делает: печатает "Привет, <имя>!"

//public class Main {
//    public static void greatByName(String name) {
//        System.out.println("Привет " + name);
//    }
//    public static void main(String[] args) {
//        greatByName("Дмитрий");
//    }
//}

//✅ 4. Метод sum(int a, int b)
//Принимает: два int числа
//Возвращает: int
//Что делает: возвращает их сумму

//public class Main {
//    public static int sum(int a,int b) {
//        int sum=0;
//        sum=a+b;
//        return sum;
//    }
//    public static void main(String[] args) {
//
//        System.out.println(sum(3,6));
//    }
//}

//✅ 5. Метод isPositive(int number)
//Принимает: одно int число
//Возвращает: boolean
//Что делает: возвращает true, если число положительное

//public class Main {
//    public static boolean isPositive(int number) {
//        if (number > 0) {
//            return true;
//        }
//        return false;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(isPositive(4));
//
//    }
//}

//✅ 6. Метод doubleArray(int[] arr)
//Принимает: массив целых чисел
//Возвращает: новый массив int[]
//Что делает: возвращает массив, где каждый элемент умножен на 2

//public class Main {
//    public static void printArr(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//    }
//
//    public static int[] doubleArray(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = arr[i] * 2;
//        }
//        return arr;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = doubleArray(new int[]{1,2,3,4,5});
//        printArr(arr);
//
//    }
//}

//✅ 7. Метод arraySum(int[] arr)
//Принимает: массив целых чисел
//Возвращает: int
//Что делает: возвращает сумму всех элементов массива

public class Main {
    public static void printArray(int[]arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static int arraySum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

        }

        return sum;
    }
    
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        int sum=arraySum(arr);
        printArray(arr);
       System.out.println(sum);
    }
}


//✅ 8. Метод average(int a, int b, int c)
//Принимает: три числа
//Возвращает: double
//Что делает: возвращает среднее арифметическое

//public class Main {
//    public static double average(int a, int b, int c) {
//        int sum = 0;
//        sum = a + b + c;
//        double average = (double) (a + b + c) / 3;
//        System.out.println(average);
//        return average;
//    }
//
//    public static void main(String[] args) {
//
//        average(3, 4, 6);
//        average(2, 5, 9);
//        average(4, 6, 10);
//
//    }
//}

//✅ 9. Метод isEven(int number)
//Принимает: одно число
//Что делает: возвращает true, если число чётное

//public class Main {
//    public static boolean isEven(int number) {
//       if (number%2==0){
//           return true;
//       }
//       return false;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(isEven(23));
//    }
//}

//✅ 10. Метод generateRandomNumber(int min, int max)
//Принимает: два числа min, max
//Возвращает: int
//Что делает: возвращает случайное число от min до max

//import java.util.Random;
//
//public class Main {
//    public static int generateRandomNumber(int min, int max) {
//        Random random = new Random();
//        int randomNumber = random.nextInt(max-min+1)+min ;
//        if (randomNumber >= min && randomNumber <= max) {
//            System.out.print(randomNumber);
//        }
//        return randomNumber;
//    }
//
//    public static void main(String[] args) {
//        generateRandomNumber(1, 20);
//    }
//}