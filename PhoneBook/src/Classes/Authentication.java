package Classes;

import java.util.List;
import java.util.Scanner;

public class Authentication {
    public static User signIn(Scanner scanner, List<User> users) {
        System.out.print("Введите имя пользователя: ");
        String userName = scanner.nextLine();
        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();
        for (User user : users) {
            if (user.getUsername().equals(userName) && user.getPassword().equals(password)) {
                System.out.println("Добро пожаловать " + user.getUsername());
                return user;
            }
        }
        System.out.println("Неверное имя пользователя или пароль");
        return null;
    }

    public static User signUp(Scanner scanner, List<User> users, FileManager fileManager) {
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        System.out.print("Введите фамилию: ");
        String lastName = scanner.nextLine();

        String username;
        boolean userNameExists;

        do {
            System.out.print("Введите имя пользователя");
            username = scanner.nextLine();
            userNameExists = false;
            for (User user : users) {
                if (user.getUsername().equals(username)) {
                    System.out.println("Такое имя пользователя уже существует,попробуй снова");
                    userNameExists = true;
                    break;
                }
            }
        } while (userNameExists);

        String password;
        String repeatPassword;

        do {
            System.out.print("Введите пароль: ");
            password = scanner.nextLine();
            System.out.print("Повторите пароль: ");
            repeatPassword = scanner.nextLine();
            if (!password.equals(repeatPassword)) {
                System.out.println("Пароли не совпадают,повторите пароль заново");
            }
        } while (!password.equals(repeatPassword));
        User newUser = new User(name, lastName, username, password);
        users.add(newUser);
        fileManager.saveUsers(users);
        System.out.println("Регистрация прошла успешно!");
        return newUser;
    }
}
