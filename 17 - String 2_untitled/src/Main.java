// 10.       -     contains("  "));

public class Main {
    public static boolean myContains(char[] str, char[] str1) {
        if (str1.length > str.length) return false;
        for (int i = 0; i <= str.length- str1.length; i++) {
            boolean found = true;
            for (int j = 0; j < str1.length; j++) {
                if (str1[j] != str[i+j]) {
                    found = false;
                    break;
                }
            }
            if (found)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "Привет,как дела?";
        String str1 = "как";
        System.out.println(str.contains("как"));
        char[] arr = str.toCharArray();
        char[] arr1 = str1.toCharArray();
        System.out.println(myContains(arr, arr1));

    }
}

