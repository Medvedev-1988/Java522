public class Main {
    public static void main(String[] args) {
//1)
//        int size = 10;
//        for (int i = size; i >= 1; i--) {
//            System.out.print(i + " ");
//        }
//        2)
//        for (int i = 1; i <= 50; i++) {
//            if (i % 2 != 0) {
//                System.out.print(i + " ");
//            }
//        }
//        3)
//        int n = 10;
//        int sum = 0;
//        for (int i = 1; i <= n; i++) {
//            if (i % 2 == 0) {
//                sum += i;
//            }
//        }
//        System.out.println("Сумма четных чисел = "+ sum);
//        4)
//        int count = 0;
//        for (int i = 1; i <= 100; i++) {
//            if (i % 5 == 0) {
//                count++;
//            }
//            System.out.print(i + " ");
//        }
//        System.out.println("\nкратно 5 = " + count);
//        5)
//        for (int i = 1; i <= 10; i++) {
//            System.out.print((i * i) + " ");
//        }
//        6)
//        int n = 100;
//        int countEven = 0, countOdd = 0, count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0;
//        for (int i = 1; i <= n; i++) {
//            System.out.print(i + " ");
//            if (i % 2 == 0) {
//                countEven++;
//            }
//            if (i % 2 != 0) {
//                countOdd++;
//            }
//            if (i % 5 == 0 && i % 6 == 0) {
//                count1++;
//            }
//            if (i % 2 == 0 && i % 3 == 0) {
//                count2++;
//            }
//            if (i % 2 == 0 || i % 10 == 0) {
//                count3++;
//            }
//            if (i % 2 == 0 || i % 4 == 0) {
//                count4++;
//            }
//            if (i % 7 == 0 && i % 3 == 0) {
//                count5++;
//            }
//        }
//        System.out.println();
//        System.out.println("количество четных: " + countEven);
//        System.out.println("количество нечетных: " + countOdd);
//        System.out.println("делится на 5 и на 6: " + count1);
//        System.out.println("делится на 2 и на 3: " + count2);
//        System.out.println("делится на 2 или на 10: " + count3);
//        System.out.println("делится на 2 или на 4: " + count4);
//        System.out.println("делится на 7 и на 3: " + count5);
//        7)
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0) {
//                System.out.print(i + " ");
//            }
//        }
//        8)
//        int sum = 0;
//        for (int i = 1; i <= 50; i++) {
//            sum += i;
//        }
//        System.out.println("Сумма чисел от 1го до 50 = " + sum);
//        9)
//        int n = 20;
//        for (int i = 1; i <= n; i++) {
//            System.out.print(i + " ");
//        }
//        10)
//        int n = 10;
//        int multi = 1;
//        for (int i = 1; i <= n; i++) {
//            multi *=i;
//            System.out.print(multi + " ");
//        }
//        11)
//        int n = 10;
//        int count = 0;
//        for (int i = 1; i <= n; i++) {
//            if (i % 2 == 0 || i % 5 == 0) {
//                count++;
//            }
//        }
//        System.out.println("делится на 2 или на 5 = " + count);
//    12)
        int sum = 0;
        int n = 10;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("сумма чисел равна = " + sum);
    }
}
