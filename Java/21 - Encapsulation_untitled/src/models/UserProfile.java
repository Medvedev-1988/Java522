package models;

public class UserProfile {
    private String username;
    private String email;
    private String password;

    public UserProfile(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || !email.contains("@")) {
            System.out.println("Ошибка!Неверный формат email");
            return;
        }
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password == null || password.length() < 8) {
            System.out.println("Ошибка!Пароль должен быть не меньше 8 символов");
            return;
        }
        this.password = password;
    }
}
