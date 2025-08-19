public class Main {
    public static void main(String[] args) {
//1)
//        *******
//        *******
//        *******
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5 ||
//                        i == 6 || i == 7 || i == 8 || i == 9 || i == 10) {
//                    System.out.print("  *");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        2)
//        *
//         *
//          *
//           *
//            *
//        for (int i = 0; i <= 5; i++) {
//            for (int j = 0; j <= 5; j++) {
//                if (i == 0 && j > 0 && j < 2
//                        || i == 1 && j > 1 && j < 3
//                        || i == 2 && j > 2 && j < 4
//                        || i == 3 && j > 3 && j < 5
//                        || i == 4 && j > 4 && j < 6
//                ) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        4)
//            *
//           *
//          *
//         *
//        *
//                for (int i = 0; i <= 5; i++) {
//            for (int j = 0; j <= 5; j++) {
//                if (i == 0 && j > 4 && j < 6
//                        || i == 1 && j > 3 && j < 5
//                        || i == 2 && j > 2 && j < 4
//                        || i == 3 && j > 1 && j < 3
//                        || i == 4 && j > 0 && j < 2
//                ) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        4)
//        *
//        **
//        ***
//        ****
//        *****
//        for (int i = 0; i <= 5; i++) {
//            for (int j = 0; j <= 5; j++) {
//                if (i == 0 && j > 0 && j < 2
//                        || i == 1 && j > 0 && j < 3
//                        || i == 2 && j > 0 && j < 4
//                        || i == 3 && j > 0 && j < 5
//                        || i == 4 && j > 0 && j < 6
//                ) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        5)
//        *****
//        ****
//        ***
//        **
//        *
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                if (i == 0
//                        || i == 1 && j <4
//                        || i == 2 && j < 3
//                        || i == 3 && j < 2
//                        || i == 4 && j < 1
//                ) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        6)
//             *
//            ***
//           *****
//          *******
//         *********
//        for (int i = 0; i < 9; i++) {
//            for (int j = 0; j < 9; j++) {
//                if (i == 0 && j > 3 && j < 5
//                        || i == 1 && j > 2 && j < 6
//                        || i == 2 && j > 1 && j < 7
//                        || i == 3 && j > 0 && j < 8
//                        || i == 4
//                ) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        7)
//               *
//              ***
//             *****
//            *******
//           *********
//            *******
//             *****
//              ***
//               *
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i == 0 && j == 4
                        || i == 1 && j > 2 && j < 6
                        || i == 2 && j > 1 && j < 7
                        || i == 3 && j > 0 && j < 8
                        || i == 4
                        || i == 5 && j > 0 && j < 8
                        || i == 6 && j > 1 && j < 7
                        || i == 7 && j > 2 && j < 6
                        || i == 8 && j == 4

                ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}