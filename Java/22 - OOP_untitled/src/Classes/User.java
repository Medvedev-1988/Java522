package Classes;

public class User {
    private static int count = 0;

    public User(String name, int age) {
        count++;
    }

    public static int getCount() {
        return count;
    }

    static {
        System.out.println("Произошел вход в Class User.");
    }
}
