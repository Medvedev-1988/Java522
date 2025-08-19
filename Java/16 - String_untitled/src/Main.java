// 1.       -     equals("Farid"));

public class Main {
    public static boolean myEquals(char[]str,char[]str1) {
        for (int i = 0; i < str.length; i++) {
            if (str[i]!=str1[i]){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {

        String str="Dmitriy";
        String str1="Dmitriy";
        System.out.println(str.equals(str1));
        char[]arr=str.toCharArray();
        char[]arr1=str1.toCharArray();
        System.out.println(myEquals(arr,arr1));
    }
}

// 2.      -     endsWith("dlayev"));

//public class Main {
//    public static boolean myEndsWith(char[] str, char[] str1) {
//        if (str1.length > str.length) {
//            return false;
//        }
//        for (int i = 0; i < str1.length; i++) {
//            if (str[str.length - str1.length + i] != str1[i]) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//
//    public static void main(String[] args) {
//
//        String str = "Dmitriy";
//        String str1="riy";
//        System.out.println(str.endsWith("riy"));
//        char[] arr = str.toCharArray();
//        char[] arr1 = str1.toCharArray();
//        char[] arr1 = {'r', 'i', 'y'};
//
//        System.out.println(myEndsWith(arr,arr1));
//
//
//    }
//
//}

// 3.        -     startsWith("Abdullayev"));

//public class Main {
//    public static boolean myStartsWith(char[] str, char[] str1) {
//        if (str1.length > str.length) {
//            return false;
//        }
//        for (int i = 0; i < str1.length; i++) {
//            if (str[i] != str1[i]) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//
//        String str = "Dmitriy";
//        String str1="Dm";
//        System.out.println(str.startsWith("Dm"));
//        char[] arr = str.toCharArray();
//        char[]arr1=str1.toCharArray();
//        char[] arr1 = {'D', 'm'};
//        System.out.println(myStartsWith(arr, arr1));
//    }
//}

// 4.       -     replace('F','Z'));

//public class Main {
//    public static char[] myReplace(char[] str, char symb, char newSymb) {
//        char[] arr = new char[str.length];
//        for (int i = 0; i < arr.length; i++) {
//            if (str[i] == symb) {
//                arr[i] = newSymb;
//            }else{
//                arr[i]=str[i];
//            }
//        }
//        return arr;
//    }
//
//    public static void main(String[] args) {
//
//        String str = "Dmitriy";
//        System.out.println(str.replace('m', 'r'));
//        char[] arr = str.toCharArray();
//        System.out.println(myReplace(arr, 'm', 'r'));
//        System.out.println(arr);
//    }
//}


// 5.       -     toCharArray());

//public class Main {
//    public static char[] myToCharArray(char[]str) {
//        char[] arr = new char[str.length];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=str[i];
//        }
//
//        return arr;
//    }
//
//    public static void main(String[] args) {
//
//        String str = "Dmitriy";
//        System.out.println(str.toCharArray());
//        char[]arr=str.toCharArray();
//        System.out.println(myToCharArray(arr));
//
//    }
//}

// 6.       -     equalsIgnoreCase("Farid"));

// public class Main {
// public static boolean myEqualsIgnoreCase(char[]str,char[]str1) {
//        char[] arr = new char[str.length];
//        for (int i = 0; i < arr.length; i++) {
//            char sym = str[i];
//            if (sym > 'a' && sym < 'z') {
//                sym -= 32;
//            }
//            arr[i]=sym;
//        }
//     char[] arr1 = new char[str1.length];
//     for (int i = 0; i < arr1.length; i++) {
//         char sym = str1[i];
//         if (sym > 'a' && sym < 'z') {
//             sym -= 32;
//         }
//         arr1[i]=sym;
//     }
//     for (int i = 0; i < str.length; i++) {
//         if (arr[i]!=arr1[i]){
//         return false;
//         }
//     }
//     return true;
//    }
//
//
//    public static void main(String[] args) {
//
//        String str="dmitriy";
//        String str1="Dmitriy";
//        System.out.println(str.equalsIgnoreCase(str1));
//        char[]arr=str.toCharArray();
//        char[]arr1=str1.toCharArray();
//        System.out.println(myEqualsIgnoreCase(arr,arr1));
//    }
//}

// 7.       -     substring(10));

//public class Main {
//    public static char[] mySubstring(char[] str, int beginIndex) {
//        char[] newArr = new char[str.length-beginIndex];
//        for (int i = beginIndex; i < str.length; i++) {
//            newArr[i-beginIndex] = str[i];
//        }
//        return newArr;
//    }
//    public static void main(String[] args) {
//        String str = "Dmitriy";
//        System.out.println(str.substring(2));
//        char[] arr = str.toCharArray();
//        System.out.println(mySubstring(arr, 2));
//    }
//}

// 8.       -     substring(10,20));

//public class Main {
//    public static char[] mySubstring(char[] str, int beginIndex,int endIndex) {
//        char[] newArr = new char[endIndex-beginIndex];
//        for (int i = beginIndex; i < endIndex; i++) {
//            newArr[i-beginIndex] = str[i];
//        }
//        return newArr;
//    }
//    public static void main(String[] args) {
//        String str = "Dmitriy";
//        System.out.println(str.substring(0,4));
//        char[] arr = str.toCharArray();
//        System.out.println(mySubstring(arr,0,4));
//    }
//}

// 9.       +     trim());

//public class Main {
//    public static char[] myTrim(char[] str) {
//       int countL=0;
//        for (int i = 0; i < str.length; i++) {
//            if (str[i]==' '){
//                countL++;
//            }else{
//                break;
//            }
//        }
//        int countR=0;
//        for (int i = str.length-1; i >=0; i--) {
//            if (str[i]==' '){
//                countR++;
//            }else {
//                break;
//            }
//        }
//        System.out.println(countR);
//        char[]arr=new char[str.length-countL-countR];
//        for (int i = countL,j=0; i < str.length-countR ; i++,j++) {
//                arr[j]=str[i];
//        }
//        return arr;
//    }
//    public static void main(String[] args) {
//        String str = "  Dmitriy  ";
//        System.out.println(str.trim());
//        char[] arr = str.toCharArray();
//        System.out.println(myTrim(arr));
//    }
//}





