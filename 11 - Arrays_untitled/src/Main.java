// -  1. Создать статический массив из 10 чисел и вывести его на экран.

public class Main {
    public static void main(String[] args) {
        int[]arr=new int[]{1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

// -  2. Ввести с клавиатуры 5 чисел в статический массив и посчитать их сумму.

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int[] arr = new int[5];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print("Введите число " + (i + 1) + ": ");
//            arr[i] = scanner.nextInt();
//        }
//        System.out.println();
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum = sum + arr[i];
//        }
//        System.out.print("Сумма 5 чисел равна : " + sum);
//    }
//}

// -  3. Создать статический массив из 8 элементов и вывести его в обратном порядке.

//import java.util.Random;
//
//public class Main {
//    public static void main(String[] args) {
//        Random random = new Random();
//        int[] arr = new int[8];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(100) + 1;
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        for (int i = arr.length-1; i >= 0; i--) {
//            System.out.print(arr[i] + " "); // Обратный порядок
//        }
//    }
//}

// -  4. Заполнить статический массив из 12 элементов числами от 1 до 12 и найти среднее арифметическое.

//import java.util.Random;
//
//public class Main {
//    public static void main(String[] args) {
//        Random random = new Random();
//        int[] arr = new int[12];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(10) + 1;
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        int sum = 0;
//        double average = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum = sum + arr[i];
//            average = sum / 12.0;
//        }
//        System.out.print("Сумма чисел " + sum);
//        System.out.println();
//        System.out.print("Среднее арифметическое число : " + average);
//    }
//}

// -  5. Заполнить статический массив из 10 элементов случайными числами и вывести только четные числа.

//import java.util.Random;
//
//public class Main {
//    public static void main(String[] args) {
//        Random random = new Random();
//        int[] arr = new int[10];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(100) + 1;
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 0) {
//                System.out.print(arr[i] + " ");
//            }
//        }
//    }
//}

// -  6. Заполнить статический массив из 15 элементов случайными числами от 1 до 100 и найти максимальное значение.

//import java.util.Random;
//
//public class Main {
//    public static void main(String[] args) {
//        Random random = new Random();
//        int[] arr = new int[15];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(100) + 1;
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        int max = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        System.out.print("Максимальное значение : " + max);
//    }
//}

// -  7. Заполнить статический массив из 15 элементов четными числами от 2 до 30.

//public class Main {
//    public static void main(String[] args) {
//        int[] arr = new int[15];
//        int evennumber = 0;
//        for (int i = 0; i < arr.length; i++) {
//            evennumber += 2;
//            System.out.print(evennumber + " ");
//        }
//    }
//}

// +  8. Ввести статический массив из 6 чисел и посчитать количество положительных элементов.

//import java.util.Random;
//
//public class Main {
//    public static void main(String[] args) {
//        Random random = new Random();
//        int[] arr = new int[6];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(21) - 10;
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > 0) {
//                count++;
//            }
//        }
//        System.out.print("Количество положительных элементов : " + count);
//    }
//}

// -  9. Заполнить статический массив из 10 элементов случайными числами от -10 до 10 и вывести только отрицательные элементы.

//import java.util.Random;
//
//public class Main {
//    public static void main(String[] args) {
//        Random random = new Random();
//        int[] arr = new int[10];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(21) - 10;
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < 0) {
//                System.out.print(arr[i] + " "); // вывод отрицательных элементов
//            }
//        }
//    }
//}

// -  10. Создать статический массив из 10 элементов и заменить все нечетные числа на 0.

//import java.util.Random;
//
//public class Main {
//    public static void main(String[] args) {
//        Random random = new Random();
//        int[] arr = new int[10];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(100) + 1;
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 != 0) {
//                arr[i] = 0;
//            }
//            System.out.print(arr[i] + " ");
//        }
//    }
//}

// -  11. Заполнить массив из 7 элементов случайными числами от 0 до 50 и вывести их сумму.

//import java.util.Random;
//
//public class Main {
//    public static void main(String[] args) {
//        Random random = new Random();
//        int[] arr = new int[7];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(50);
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum = sum + arr[i];
//        }
//        System.out.print("Сумма чисел от 0 до 50 : " + sum);
//    }
//}

// -  12. Создать массив из 10 элементов и посчитать количество четных и нечетных элементов.

//import java.util.Random;
//
//public class Main {
//    public static void main(String[] args) {
//        Random random=new Random();
//        int[]arr=new int[10];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]= random.nextInt(100)+1;
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        int evencount=0;
//        int oddcount=0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]%2==0) {evencount++;
//            } else if (arr[i]%2!=0) {oddcount++;
//            }
//        }
//        System.out.print("Количество четных элементов : " + evencount);
//        System.out.println();
//        System.out.print("Количество нечетных элементов : " + oddcount);
//    }
//}

// -  13. Заполнить массив из 15 элементов числами, которые вводит пользователь, и найти минимальное значение.

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int[] arr = new int[15];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print("Введите число " + (i + 1) + ": ");
//            arr[i] = scanner.nextInt();
//        }
//        System.out.println();
//        int min = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < min) {
//                min = arr[i];
//            }
//        }
//        System.out.print("Минимальное значение : " + min);
//    }
//}

// -  14. Создать массив из 8 элементов и заменить все отрицательные числа на их модули.

//import java.util.Random;
//
//public class Main {
//    public static void main(String[] args) {
//        Random random=new Random();
//        int[] arr = new int[8];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]= random.nextInt(21)-10;
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]<0){
//                arr[i]=arr[i]-(arr[i]+arr[i]);
//            }
//            System.out.print(arr[i] + " ");
//        }
//    }
//}

// -  15. Заполнить массив из 12 элементов случайными числами от -20 до 20 и вывести произведение всех положительных элементов.

//import java.util.Random;
//
//public class Main {
//    public static void main(String[] args) {
//        Random random = new Random();
//        int[] arr = new int[12];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(41) - 20;
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        int multi = 1;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > 0) {
//                multi = multi * arr[i];
//            }
//        }
//        System.out.print("Произведение положительныъ элементов : " + multi);
//    }
//}

// -  16. Создать массив из 9 элементов заполнить случайными числами от -5 до 5 и вывести индексы всех нулевых элементов.

//import java.util.Random;
//
//public class Main {
//    public static void main(String[] args) {
//        Random random=new Random();
//        int[]arr=new int[9];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]= random.nextInt(11)-5;
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]==0){
//                arr[i]=i;
//                System.out.print(i + " "); // вывод индекса нулевого элемента
//            }
//        }
//    }
//}

// -  17. Заполнить массив из 10 элементов последовательностью 1, 2, 3, 4, ..., 10 и вывести сумму элементов с четными индексами.

//public class Main {
//    public static void main(String[] args) {
//        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(i + " "); // вывод индексов
//        }
//        System.out.println();
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");  // вывод значений
//        }
//        System.out.println();
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (i % 2 == 0) {
//                sum = sum + arr[i];
//                arr[i] = i;
//            }
//        }
//        System.out.print("Сумма элементов с четными индексами : " + sum);
//    }
//}

// -  18. Создать массив из 6 элементов и проверить, есть ли в нем хотя бы один отрицательный элемент.

//import java.util.Random;
//
//public class Main {
//    public static void main(String[] args) {
//        Random random = new Random();
//        int[] arr = new int[6];
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(11) - 5;
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < 0) {
//                System.out.print(arr[i] + " "); // вывод отрицательных элементов
//                count++;
//            }
//        }
//        System.out.println();
//        System.out.print("Количество отрицательных элементов : " + count);
//    }
//}

// -  19. Заполнить массив из 11 элементов числами от 11 до 1 в обратном порядке.

//public class Main {
//    public static void main(String[] args) {
//        int[]arr=new int[]{11,10,9,8,7,6,5,4,3,2,1};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        for (int i = arr.length -1; i >= 0 ; i--) {
//            System.out.print(arr[i] + " ");
//        }
//    }
//}

// +  20. Создать массив из 5 элементов, заполнить его случайными числами и определить, сколько элементов больше среднего арифметического.

//import java.util.Random;
//
//public class Main {
//    public static void main(String[] args) {
//        Random random = new Random();
//        int[] arr = new int[5];
//        double average=0;
//        int sum = 0;
//        int count=0;
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(20) + 1;
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < arr.length; i++) {
//            sum = sum + arr[i];
//            average = (double) sum / arr.length;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]>average){
//                count++;
//            }
//        }
//        System.out.print("sum : " + sum);
//        System.out.println();
//        System.out.print("average : " + average);
//        System.out.println();
//        System.out.print("> average : " + count);
//    }
//}

// -  21. Заполнить массив из 10 элементов кубами индексов (0, 1, 8, 27, ...).

//public class Main {
//    public static void main(String[] args) {
//        int[] arr = new int[10];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i;
//            arr[i] = i * i * i;
//            System.out.print(arr[i] + " ");
//        }
//    }
//}

// +  22. Создать массив из 7 элементов и посчитать, сколько раз в нем меняется знак числа при переходе от элемента к элементу.

//import java.util.Random;
//
//public class Main {
//    public static void main(String[] args) {
//        Random random = new Random();
//        int[] arr = new int[7];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(11) - 5;
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        int count = 0;
//        for (int i = 0; i < arr.length - 1; i++) {
//            if ((arr[i] > 0 && arr[i + 1] < 0) || (arr[i] < 0 && arr[i + 1] > 0)) {
//                count++;
//            }
//        }
//        System.out.print(count + " ");
//    }
//}

// -  23. Заполнить массив из 12 элементов случайными числами от 1 до 100 и вывести числа, кратные 5.

//import java.util.Random;
//
//public class Main {
//    public static void main(String[] args) {
//        Random random = new Random();
//        int[] arr = new int[12];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(100) + 1;
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]%5==0) {
//                System.out.print(arr[i] + " ");
//            }
//        }
//    }
//}

// -  24. Создать массив из 9 элементов и поменять местами первый и последний элементы.

//import java.util.Random;
//
//public class Main {
//    public static void main(String[] args) {
//        Random random=new Random();
//        int[]arr=new int[9];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]= random.nextInt(100)+1;
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(i + " ");
//
//        }
//        System.out.println();
//        for (int i = 0; i < arr.length; i++) {
//            int vremennaya=arr[0];
//            arr[0]= arr[arr.length-1];
//            arr[arr.length-1]=vremennaya;
//            System.out.print(arr[i] + " ");
//        }
//    }
//}

// -  25. Заполнить массив из 8 элементов случайными числами и найти разницу между максимальным и минимальным элементами.

//import java.util.Random;
//
//public class Main {
//    public static void main(String[] args) {
//        Random random = new Random();
//        int[] arr = new int[8];
//        int max = arr[0];
//        int difference=0;
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(100) + 1;
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//
//        }
//        System.out.print("max : " + max);
//        System.out.println();
//        int min=arr[0];
//        for (int i = 1; i < arr.length; i++) {
//
//            if (arr[i] < min) {
//                min = arr[i];
//            }
//        }
//        System.out.print("min : " + min);
//        System.out.println();
//        for (int i = 0; i < arr.length; i++) {
//            difference=max-min;
//        }
//        System.out.print("Разница между min и max : " + difference);
//    }
//}

// -  26. Создать массив из 10 элементов и посчитать, сколько элементов равны заданному числу.

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        int[]arr=new int[10];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print("Введите число " +(i+1)+ ": ");
//            arr[i]= scanner.nextInt();
//        }
//        System.out.print("Введите число для поиска : ");
//        int count=0;
//        int guestnumber= scanner.nextInt();
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]==guestnumber){
//                count++;
//            }
//
//        }
//        System.out.print("Количество элементов,равных " + guestnumber + ": " + count);
//
//    }
//}

// -  27. Заполнить массив из 6 элементов квадратами чисел от 1 до 6.

//public class Main {
//    public static void main(String[] args) {
//       int[]arr=new int[6];
//        for (int i = 0; i < arr.length; i++) {
//            int numb=i+1;
//            arr[i]=numb*numb;
//            System.out.print(arr[i] + " ");
//        }
//    }
//}

// -  28. Создать массив из 9 элементов и заменить каждый элемент на противоположный по знаку.

//import java.util.Random;
//
//public class Main {
//    public static void main(String[] args) {
//        Random random=new Random();
//        int[]arr=new int[9];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]= random.nextInt(11)-5;
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]>0){
//              arr[i]=arr[i]-arr[i]-arr[i];
//            } else if (arr[i]<0){
//                arr[i]=arr[i]-arr[i]-arr[i];
//            }
//            System.out.print(arr[i] + " ");
//        }
//    }
//}

// +  29. Заполнить массив из 12 элементов так, чтобы значения элементов с четными индексами были равны 0, а с нечетными индексами - равны их индексам.

//import java.util.Random;
//
//public class Main {
//    public static void main(String[] args) {
//        Random random=new Random();
//        int[]arr=new int[12];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]= random.nextInt(100)+1;
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < arr.length; i++) {
//            if (i%2==0){
//                arr[i]=i;
//                arr[i]=0;
//            }System.out.print(arr[i] + " ");
//        }
//    }
//}

// +  30. Создать массив из 10 элементов и найти сумму элементов, стоящих на позициях, кратных 3.

//import java.util.Random;
//
//public class Main {
//    public static void main(String[] args) {
//        Random random=new Random();
//        int[]arr=new int[10];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]= random.nextInt(100)+1;
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        int sum=0;
//        for (int i = 0; i < arr.length; i++) {
//            if (i%3==0){
//                sum=sum+arr[i];
//            }
//        }
//        System.out.print("sum : " + sum);
//    }
//}