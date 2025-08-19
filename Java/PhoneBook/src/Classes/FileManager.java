package Classes;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    private final String usersFileName;
    private final String contactsFileName;

    public FileManager(String usersFileName, String contactsFileName) {
        this.usersFileName = usersFileName;
        this.contactsFileName = contactsFileName;
    }

    public List<User> loadUsers() {
        List<User> users = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(usersFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    String name = parts[0].trim();
                    String lastName = parts[1].trim();
                    String username = parts[2].trim();
                    String password = parts[3].trim();
                    users.add(new User(name, lastName, username, password));
                }
            }
        } catch (Exception e) {
            System.out.println("Ошибка загрузки пользователей из файла" + e.getMessage());
        }
        return users;
    }

    public void saveUsers(List<User> users) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(usersFileName))) {
            for (User user : users) {
                writer.write(user.getName() + ", " + user.getLastName() + ", " + user.getUsername() + ", " + user.getPassword());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка сохранения пользователя в файл" + e.getMessage());
        }
    }

    public List<Contact> loadContactsFromFile(String username) {
        List<Contact> contacts = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(contactsFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 5) {
                    try {
                        int id = Integer.parseInt(parts[0].trim());
                        String firstName = parts[1].trim();
                        String lastName = parts[2].trim();
                        String phoneNumber = parts[3].trim();
                        int age = Integer.parseInt(parts[4].trim());
                        contacts.add(new Contact(id, firstName, lastName, phoneNumber, age));
                    } catch (NumberFormatException e) {
                        System.err.println("Ошибка при чтении файла контактов: " + e.getMessage());
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка при загрузке контактов из файла: " + e.getMessage());
        }
        return contacts;
    }

    public void saveContactToFile(List<Contact> contacts, String username) {
        String usernameContactsFile = contactsFileName.replace("username", username);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(usernameContactsFile))) {
            for (Contact contact : contacts) {
                writer.write(contact.getId() + ", " + contact.getName() + ", " + contact.getLastName() + ", " + contact.getPhoneNumber() + ", " + contact.getAge());
                writer.newLine();
            }
        } catch (Exception e) {
            System.out.println("Ошибка сохранения контакта в файл");
        }
    }
}
