//  - 1 Создать двумерный массив 2x5 и вывести его на экран.

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] arr = new int[2][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(100) + 1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//  - 2 Ввести с клавиатуры 2 строки по 3 числа и посчитать сумму всех элементов массива.

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int[][] arr = new int[2][3];
//        int sum=0;
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print("Введите число строк " + (i + 1) + ": ");
//            i = scanner.nextInt();
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print("Введите число столбцов " + (j + 1) + ": ");
//                arr[i][j] = scanner.nextInt();
//                sum=sum+arr[i][j];
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(i + ": ");
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.print("Сумма всех элементов массива : " + sum);
//    }
//}

//  - 3 Создать двумерный массив 2x4 и вывести все элементы в обратном порядке (от последнего к первому).

//public class Main {
//    public static void main(String[] args) {
//        int[][] arr = {
//                {1, 2, 3, 4},
//                {5, 6, 7, 8}
//        };
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(i + ": ");
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(i + ": ");
//            for (int j = arr[i].length - 1; j >= 0; j--) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}

//  - 4 Заполнить двумерный массив 3x4 числами от 1 до 12 и найти их среднее арифметическое.

//public class Main {
//    public static void main(String[] args) {
//        int[][] arr = {
//                {1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9, 10, 11, 12}
//        };
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(i + ": ");
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//        int sum = 0;
//        double average = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                sum = sum + arr[i][j];
//                average = (double) sum / 12;
//            }
//        }
//        System.out.print("Сумма равна : " + sum);
//        System.out.println();
//        System.out.print("Среднее арифметическое число : " + average);
//    }
//}

//  - 5 Заполнить двумерный массив 2x5 случайными числами от 0 до 100 и вывести только чётные числа.

//import java.util.Random;
//
//public class Main {
//    public static void main(String[] args) {
//        Random random = new Random();
//        int[][] arr = new int[2][5];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(i + ": ");
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = random.nextInt(100);
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (arr[i][j] % 2 == 0) {
//                    System.out.print(arr[i][j] + " ");
//                }
//            }
//        }
//    }
//}

//  - 6 Заполнить двумерный массив 3x5 случайными числами от 1 до 100 и найти максимальное значение.

//import java.util.Random;
//
//public class Main {
//    public static void main(String[] args) {
//        Random random = new Random();
//        int[][] arr = new int[3][5];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(i + ": ");
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = random.nextInt(100) + 1;
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//        int max = arr[0][0];
//        for (int i = 0; i < arr.length; i++) {
//
//            for (int j = 0; j < arr[i].length; j++) {
//                if (arr[i][j] > max) {
//                    max = arr[i][j];
//                }
//            }
//        }
//        System.out.print(max);
//    }
//}

//  - 7 Заполнить двумерный массив 3x5 чётными числами от 2 до 30 по порядку.

//public class Main {
//    public static void main(String[] args) {
//        int[][] arr = new int[3][5];
//        int evennumber = 0;
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(i + ": ");
//            for (int j = 0; j < arr[i].length; j++) {
//                evennumber += 2;
//                System.out.print(evennumber + " ");
//            }
//            System.out.println();
//        }
//    }
//}

//  - 8 Ввести двумерный массив 2x3 с клавиатуры и посчитать количество положительных элементов.

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int[][] arr = new int[2][3];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print("Введите число для строки " + (i + 1) + ": ");
//            i = scanner.nextInt();
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print("Введите число для столбца " + (j + 1) + ": ");
//                arr[i][j] = scanner.nextInt();
//            }
//        }
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(i + ": ");
//            for (int j = 0; j < arr[i].length; j++) {
//                if (arr[i][j] > 0) {
//                    count++;
//                }
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.print("Количество положительных элементов : " + count);
//    }
//}

//  - 9 Заполнить двумерный массив 2x5 случайными числами от -10 до 10 и вывести только отрицательные числа.

//import java.util.Random;
//
//public class Main {
//    public static void main(String[] args) {
//        Random random = new Random();
//        int[][] arr = new int[2][5];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(i + ": ");
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = random.nextInt(21) - 10;
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (arr[i][j] < 0) {
//                    System.out.print(arr[i][j] + " ");
//                }
//            }
//        }
//    }
//}

//  -10 Создать двумерный массив 2x5 и заменить все нечётные числа на 0.

//import java.util.Random;
//
//public class Main {
//    public static void main(String[] args) {
//        Random random = new Random();
//        int[][] arr = new int[2][5];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(i + ": ");
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = random.nextInt(100) + 1;
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(i + ": ");
//            for (int j = 0; j < arr[i].length; j++) {
//                if (arr[i][j] % 2 != 0) {
//                    arr[i][j] = 0;
//                }
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}

//  -11 Заполнить двумерный массив 1x7 случайными числами от 0 до 50 и вывести их сумму.
// Массив 1x7 является одномерным,поэтому я зделаю дополнительно с двумерным массивом 2x7.

//import java.util.Random;
//
//public class Main {
//    public static void main(String[] args) {
//        Random random = new Random();
//        int[][] arr = new int[1][7];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(i + ": ");
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = random.nextInt(50);
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                sum = sum + arr[i][j];
//            }
//        }
//        System.out.print("Сумма чисел равна : " + sum);
//    }
//}

//import java.util.Random;
//
//public class Main {
//    public static void main(String[] args) {
//        Random random = new Random();
//        int[][] arr = new int[2][7];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(i + ": ");
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = random.nextInt(50);
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                sum = sum + arr[i][j];
//            }
//        }
//        System.out.print("Сумма чисел равна : " + sum);
//    }
//}

//  -12 Создать двумерный массив 2x5 и посчитать количество чётных и нечётных элементов.

//import java.util.Random;
//
//public class Main {
//    public static void main(String[] args) {
//        Random random = new Random();
//        int[][] arr = new int[2][5];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(i + ": ");
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = random.nextInt(100) + 1;
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//        int evencount = 0;
//        int oddcount = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (arr[i][j] % 2 == 0) {
//                    evencount++;
//                } else if (arr[i][j] % 2 != 0) {
//                    oddcount++;
//                }
//            }
//        }
//        System.out.print("Количество четных чисел : " + evencount);
//        System.out.println();
//        System.out.print("Количество нечетных чисел : " + oddcount);
//    }
//}

//  -13 Ввести с клавиатуры двумерный массив 3x5 и найти минимальное значение.

//import java.util.Random;
//
//public class Main {
//    public static void main(String[] args) {
//        Random random = new Random();
//        int[][] arr = new int[3][5];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(i + ": ");
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = random.nextInt(100) + 1;
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//        int min = arr[0][0];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (arr[i][j] < min) {
//                    min = arr[i][j];
//                }
//            }
//        }
//        System.out.print("Минимальное число : " + min);
//    }
//}

//  -14 Создать двумерный массив 2x4 и заменить все отрицательные числа на их модули.

//import java.util.Random;
//
//public class Main {
//    public static void main(String[] args) {
//        Random random = new Random();
//        int[][] arr = new int[2][4];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(i + ": ");
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = random.nextInt(21) - 10;
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(i + ": ");
//            for (int j = 0; j < arr[i].length; j++) {
//                if (arr[i][j] < 0) {
//                    arr[i][j] = - arr[i][j];
//                }
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}

//  -15 Заполнить двумерный массив 3x4 случайными числами от -20 до 20 и найти произведение всех положительных элементов.

//import java.util.Random;
//
//public class Main {
//    public static void main(String[] args) {
//        Random random = new Random();
//        int[][] arr = new int[3][4];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(i + ": ");
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = random.nextInt(41) - 20;
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//        int multiplie = 1;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (arr[i][j] > 0) {
//                    multiplie = multiplie * arr[i][j];
//                }
//            }
//        }
//        System.out.print("Произведение положительных чисел : " + multiplie);
//    }
//}

//  -16 Создать двумерный массив 3x3, заполнить случайными числами от -5 до 5 и вывести индексы всех нулевых элементов.

//import java.util.Random;
//
//public class Main {
//    public static void main(String[] args) {
//        Random random = new Random();
//        int[][] arr = new int[3][3];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(i + ": ");
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = random.nextInt(11) - 5;
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (arr[i][j] == 0) {
//                    arr[i][j] = i;
//                    System.out.print(i + " "); // Вывод индексов нулевых элементов
//                }
//            }
//        }
//    }
//}

//  -17 Заполнить двумерный массив 2x5 числами от 1 до 10 и найти сумму элементов с чётными индексами (строка и столбец одновременно чётные).

//import java.util.Random;
//
//public class Main {
//    public static void main(String[] args) {
//        Random random = new Random();
//        int[][] arr = new int[2][5];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(i + ": ");
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = random.nextInt(10) + 1;
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//        int sum=0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (i%2==0&&arr[i][j]%2==0){
//                    sum=sum+arr[i][j];
//                }
//            }
//        }
//        System.out.print("Сумма элементов с четными индексами равна : " + sum);
//    }
//}

//  -18 Создать двумерный массив 2x3 и проверить, есть ли в нём хотя бы один отрицательный элемент.

//import java.util.Random;
//
//public class Main {
//    public static void main(String[] args) {
//        Random random = new Random();
//        int[][] arr = new int[2][3];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(i + ": ");
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = random.nextInt(21) -10;
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (arr[i][j] < 0) {
//                    count++;
//                }
//            }
//        }
//        System.out.print("Количество отрицательных элементов : " + count);
//    }
//}