public class Main {
    public static void main(String[] args) {
//        1)
        int a = 5;
        a++;
        a++;
        a++;
        System.out.println(a);  // 8
//        2)
        int b = 10;
        b--;
        b--;
        b--;
        b--;
        System.out.println(b);  // 6
//        3)
        int x = 2;
        int y = 3;
        x++;
        y++;
        System.out.println(x + y);  // 7
//        4)
        int m = 8;
        int n = 5;
        m -= 2;
        n -= 2;
        System.out.println(m - n);  // 3
//        5)
        int p = 4;
        int result = ++p + p++; // 10
        System.out.println(result);
//        6)
        int q = 7;
        int output = --q - q--; // 0
        System.out.println(output);
//        7)
        int r = 9;
        r += 2;
        System.out.println(r % 5); // 1
//        8)
        int s = 15;
        s -= 3;
        System.out.println(s % 4);  // 0
//        9)
        int t = 6;
       int result1 = ++t - t-- + t++; // 6
        System.out.println(result1);
//        10)
        int u = 12;
        int finalResult = u-- % ++u + --u; // 11
        System.out.println(finalResult);
    }
}