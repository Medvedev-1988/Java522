public class Main {
    //        public static int length(char[] str)
//    public static int length(char[] str) {
//        char[]arr=new char[str.length];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=str[i];
//        }
//        return arr.length;
//    }

    //        public static int myIndexOf(char[] str,char symb)
//    public static int myIndexOf(char[] str, char symb) {
//        char[]arr=new char[str.length];
//        for (int i = 0; i < str.length; i++) {
//            arr[i]=str[i];
//            if (arr[i] == symb) {
//                return i;
//            }
//        }
//        return -1;
//    }

    //        public static int lastIndexOf(char[] str,char symb)
//    public static int lastIndexOf(char[] str, char symb) {
//        char[]arr=new char[str.length];
//        for (int i = arr.length - 1; i >= 0; i--) {
//            arr[i]=str[i];
//            if (symb == arr[i]) {
//                return i;
//            }
//        }
//        return -1;
//    }

    //        public static int lastIndexOf(char[] str,char symb,int beginIndex)
//    public static int lastIndexOf(char[] str, char symb, int beginIndex) {
//        char[] arr = new char[str.length];
//        for (int i = beginIndex; i >= 0; i--) {
//            arr[i] = str[i];
//            if (symb == arr[i]) {
//                return i;
//            }
//        }
//        return -1;
//    }

//            public static char[] myToUpperCase( char[] str)
//    public static char[] myToUpperCase(char[] str) {
//        char[] arr = new char[str.length];
//        for (int i = 0; i < arr.length; i++) {
//            if (str[i] >= 'a' && str[i] <= 'z') {
//                arr[i] = (char) (str[i] - 32);
//            } else {
//                arr[i] = str[i];
//            }
//        }
//        return arr;
//    }

    //        public static char[] toLowerCase( char[] str)
//    public static char[] toLowerCase(char[] str) {
//        char[] arr = new char[str.length];
//        for (int i = 0; i < arr.length; i++) {
//            if (str[i] >= 'A' && str[i] <= 'Z') {
//                arr[i] = (char) (str[i] + 32);
//            } else {
//                arr[i] = str[i];
//            }
//        }
//        return arr;
//    }

    //        public static char charAt( char[] str,int index)
//    public static char charAt(char[] str, int index) {
//        char[]arr=new char[str.length];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=str[i];
//        }
//        return  arr[index];
//    }
    //        public static boolean isEmpty( char[] str)
//    public static boolean isEmpty(char[] str) {
//        char[] arr = new char[str.length];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = str[i];
//        }
//        return arr.length == 0;
//    }
//        public static boolean isBlank( char[] str)
    public static boolean isBlank(char[] str) {
        char[] arr = new char[str.length];
        if (arr.length == 0) {
            return true;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = str[i];
            if (arr[i] == ' ') {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        //        public static int length(char[] str)
//        String str = "Dmitriy";
//        System.out.println(str.length());
//        char[] arr = str.toCharArray();
//        System.out.println(length(arr));
        //        public static int myIndexOf(char[] str,char symb)
//        String str = "Dmitriy";
//        System.out.println(str.indexOf('t', 1));
//        char[]arr=str.toCharArray();
//        System.out.println(myIndexOf(arr,'t'));
        //        public static int lastIndexOf(char[] str,char symb)
//        String str = "Dmitriy";
//        System.out.println(str.lastIndexOf('i'));
//        char[] arr = str.toCharArray();
//        System.out.println(lastIndexOf(arr,'i'));
        //        public static int lastIndexOf(char[] str,char symb,int beginIndex)
//        String str = "Dmitriy";
//        System.out.println(str.lastIndexOf('i', 4));
//        char[] arr = str.toCharArray();
//        System.out.println(lastIndexOf(arr, 'i', 4));
        //        public static char[] myToUpperCase( char[] str)
//        String str = "Dmitriy";
//        System.out.println(str.toUpperCase());
//        char[] arr = str.toCharArray();
//        System.out.println(myToUpperCase(arr));
        //        public static char[] toLowerCase( char[] str)
//        String str = "Dmitriy";
//        System.out.println(str.toLowerCase());
//        char[] arr = str.toCharArray();
//        System.out.println(toLowerCase(arr));
        //        public static char charAt( char[] str,int index)
//        String str = "Dmitriy";
//        System.out.println(str.charAt(2));
//        char[] arr = str.toCharArray();
//        System.out.println(charAt(arr, 2));
        //        public static boolean isEmpty( char[] str)
//        String str = " ";
//        System.out.println(str.isBlank());
//        char[] arr = str.toCharArray();
//        System.out.println();
        //        public static boolean isBlank( char[] str)
        String str = " ";
        System.out.println(str.isBlank());
        char[] arr = str.toCharArray();
        System.out.println(isBlank(arr));
    }
}