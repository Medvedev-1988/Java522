public class Main {
    public static void main(String[] args) {
//1)
//        * * * * *
//        *       *
//        *       *
//        * * * * *
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                if (i == 0
//                        || j == 0
//                        || j == 4
//                        || i == 4
//                ) {
//                    System.out.print("  *");
//                } else {
//                    System.out.print("   ");
//                }
//            }
//            System.out.println();
//        }
//        2)
//        *
//        * *
//        *   *
//        *     *
//        * * * * *
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                if (i == 0 && j < 1
//                        || i == 1 && j < 2
//                        || i == 2 && j > 1 && j < 3
//                        || i == 3 && j > 2 && j < 4
//                        || i == 4
//                        || j == 0
//                ) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        3)
//        *****
//        *  *
//        * *
//        **
//        *
//        for (int i = 0; i <= 5; i++) {
//            for (int j = 0; j <= 5; j++) {
//                if (i == 0
//                        || i == 1 && j > 3 && j < 5
//                        || i == 2 && j > 2 && j < 4
//                        || i == 3 && j > 1 && j < 3
//                        || i == 4 && j <2
//                        || j==0
//                ) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        4)
//         *
//        * *
//       *   *
//      *     *
//     *********
//        for (int i = 0; i <= 8; i++) {
//            for (int j = 0; j <= 8; j++) {
//                if (i == 1 && j == 4
//                        || i == 2 && j == 3
//                        || i == 2 && j == 5
//                        || i == 3 && j == 2
//                        || i == 3 && j == 6
//                        || i == 4 && j == 1
//                        || i == 4 && j == 7
//                        || i == 5
//
//                ) {
//                    System.out.print(" *");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//        5)
//              *
//             * *
//            *   *
//             * *
//              *
        for (int i = 0; i <= 8; i++) {
            for (int j = 0; j <= 8; j++) {
                if (i == 0 && j == 4
                        || i == 1 && j == 3
                        || i == 1 && j == 5
                        || i == 2 && j == 2
                        || i == 2 && j == 6
                        || i == 3 && j == 1
                        || i == 3 && j == 7
                        || i == 4 && j == 0
                        || i == 4 && j == 8
                        || i == 5 && j == 1
                        || i == 5 && j == 7
                        || i == 6 && j == 2
                        || i == 6 && j == 6
                        || i == 7 && j == 3
                        || i == 7 && j == 5
                        || i == 8 && j == 4

                ) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}