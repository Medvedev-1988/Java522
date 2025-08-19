import Classes.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static void contactsMenu(Scanner scanner, PhoneBook phoneBook, String username, FileManager fileManager, Logger logger) {
        while (true) {
            System.out.println("\nУправление контактами");
            System.out.println("1 - Добавить");
            System.out.println("2 - Удалить");
            System.out.println("3 - Редактировать");
            System.out.println("4 - Отобразить все");
            System.out.println("5 - Назад");
            System.out.print("Выберите действие: ");

            int select = 0;
            if (!scanner.hasNextInt()) {
                System.out.println("Вы ввели не число");
                scanner.nextLine();
                break;
            } else {

                select = scanner.nextInt();
                scanner.nextLine();

                switch (select) {
                    case 1:
                        addContact(scanner, phoneBook);
                        fileManager.saveContactToFile(phoneBook.getAllContacts(), username);
                        break;
                    case 2:
                        deleteContactMenu(scanner, phoneBook, logger);
                        fileManager.saveContactToFile(phoneBook.getAllContacts(), username);
                        break;
                    case 3:
                        editContact(scanner, phoneBook);
                        fileManager.saveContactToFile(phoneBook.getAllContacts(), username);
                        break;
                    case 4:
                        displayContacts(phoneBook);
                        break;
                    case 5:
                        fileManager.saveContactToFile(phoneBook.getAllContacts(), username);
                        return;
                    default:
                        System.out.println("Неверный выбор. Пожалуйста, попробуйте снова.");
                }
            }
        }
    }

    private static void deleteContactMenu(Scanner scanner, PhoneBook phoneBook, Logger logger) {
        System.out.println("1 - удаление по ID");
        System.out.println("2 - удаление по имени или фамилии");
        System.out.println("3 - удаление по номеру телефона");
        System.out.print("Выберите действие: ");

        int select = 0;

        if (!scanner.hasNextInt()) {
            System.out.println("вы ввели не число");
            scanner.nextLine();

        } else {

            select = scanner.nextInt();
            scanner.nextLine();

            switch (select) {
                case 1:
                    deleteContactByID(scanner, phoneBook, logger);
                    break;
                case 2:
                    deleteContactByNameOrLastname(scanner, phoneBook, logger);
                    break;
                case 3:
                    deleteContactByPhoneNumber(scanner, phoneBook, logger);
                    break;
                default:
                    System.out.println("Неверный выбор");
            }
        }
    }


    private static void addContact(Scanner scanner, PhoneBook phoneBook) {
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        System.out.print("Введите фамилию: ");
        String lastName = scanner.nextLine();
        System.out.print("Введите номер телефона: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        Random random = new Random();
        int id = random.nextInt(1000);

        try {
            Contact newContact = new Contact(id, name, lastName, phoneNumber, age);
            phoneBook.addContact(newContact);
            System.out.println("Контакт добавлен: " + name + " " + lastName);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private static void deleteContactByID(Scanner scanner, PhoneBook phoneBook, Logger logger) {
        System.out.print("Введите ID для удаления контакта: ");

        int id = 0;

        if (!scanner.hasNextInt()) {
            System.out.println("Вы ввели не число");
            scanner.nextLine();

        } else {
            id = scanner.nextInt();
            scanner.nextLine();

            List<Contact> contacts = phoneBook.getAllContacts();
            boolean contactFound = false;

            for (Contact contact : contacts) {
                if (contact.getId() == id) {
                    contactFound = true;
                    try {
                        phoneBook.deleteContactById(id);
                        System.out.println("Контакт с ID: " + id + " успешно удален");
                    } catch (Exception e) {
                        System.out.println("Ошибка!" + e.getMessage());
                    }
                    break;
                }
            }

            if (!contactFound) {
                System.out.println("Контакт с таким ID не найден");
                logger.log("Ошибка удаления контакта -> ID контакта не найден");
            }
        }
    }

    private static void deleteContactByNameOrLastname(Scanner scanner, PhoneBook phoneBook, Logger logger) {
        System.out.print("Введите имя или фамилию для удаления: ");
        String nameOrLastname = scanner.nextLine();
        boolean contactFound = false;

        List<Contact> contactsToDelete = new ArrayList<>();

        for (Contact contact : phoneBook.getAllContacts()) {
            if (contact.getName().equalsIgnoreCase(nameOrLastname) || contact.getLastName().equalsIgnoreCase(nameOrLastname)) {
                contactsToDelete.add(contact);
                contactFound = true;
            }
        }

        if (contactFound) {
            for (Contact contact : contactsToDelete) {
                phoneBook.deleteContactByNameOrLastname(nameOrLastname);
            }
            System.out.println("Контакт(ы) с именем или фамилией: " + nameOrLastname + " успешно удалены");
        } else {
            System.out.println("Контакт с таким именем или фамилией не найден");
            logger.log("Ошибка удаления контакта -> имя или фамилия контакта не найдена");
        }
    }


    private static void deleteContactByPhoneNumber(Scanner scanner, PhoneBook phoneBook, Logger logger) {
        System.out.print("Введите номер телефона для удаления: ");
        String phoneNumber = scanner.nextLine();
        boolean contactFound = false;

        List<Contact> contactsToDelete = new ArrayList<>();

        for (Contact contact : phoneBook.getAllContacts()) {
            if (contact.getPhoneNumber().equals(phoneNumber)) {
                contactsToDelete.add(contact);
                contactFound = true;
            }
        }

        if (contactFound) {
            for (Contact contact : contactsToDelete) {
                phoneBook.deleteContactByPhoneNumber(phoneNumber);
            }
            System.out.println("Контакт(ы) с телефоном: " + phoneNumber + " успешно удален(ы)");
        } else {
            System.out.println("Контакт с таким телефоном не найден");
            logger.log("Ошибка удаления контакта -> телефон контакта не найден");
        }
    }


    public static void editContact(Scanner scanner, PhoneBook phoneBook) {
        System.out.print("Введите ID контакта для редактирования: ");
        int id = 0;
        if (!scanner.hasNextInt()) {
            System.out.println("Вы ввели не число");
            scanner.nextLine();

        } else {
            id = scanner.nextInt();
            scanner.nextLine();
            List<Contact> contacts = phoneBook.getAllContacts();
            boolean contactFound = false;

            for (Contact contact : contacts) {
                if (contact.getId() == id) {
                    contactFound = true;
                    System.out.print("Введите новое имя: ");
                    String name = scanner.nextLine();
                    System.out.print("Введите новую фамилию: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Введите новый телефон: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Введите новый возраст: ");
                    int age = 0;
                    if (scanner.hasNextInt()) {
                        age = scanner.nextInt();
                    } else {
                        System.out.println("Вы ввели не число");
                        scanner.nextLine();
                        return;
                    }
                    scanner.nextLine();
                    try {
                        Contact updateContact = new Contact(id, name, lastName, phoneNumber, age);
                        phoneBook.updateContact(id, updateContact);
                        System.out.println("Контакт с ID: " + id + " успешно изменён");
                    } catch (Exception e) {
                        System.out.println("Ошибка!" + e.getMessage());
                    }
                    break;
                }
            }

            if (!contactFound) {
                System.out.println("Контакт с таким ID не найден");
            }
        }
    }

    private static void displayContacts(PhoneBook phoneBook) {
        List<Contact> contacts = phoneBook.getAllContacts();
        if (contacts.isEmpty()) {
            System.out.println("Телефонная книга пуста.");
        } else {
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }

    private static void searchContacts(Scanner scanner, PhoneBook phoneBook) {
        System.out.println("\nПоиск контактов");
        System.out.println("1 - По имени");
        System.out.println("2 - По фамилии");
        System.out.println("3 - По номеру телефона");
        System.out.println("4 - Специальный поиск ( _ , % )");
        System.out.println("5 - По всем параметрам");
        System.out.print("Выберите действие: ");

        int select = 0;
        if (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.println("Вы ввели не число");
        } else {
            select = scanner.nextInt();
            scanner.nextLine();

            if (select < 1 || select > 5) {
                System.out.println("Неверный выбор, попробуйте заново");
                return;
            }

            System.out.print("Введите запрос для поиска: ");
            String request = scanner.nextLine();

            List<Contact> results;

            switch (select) {
                case 1:
                    results = phoneBook.searchContact(request, 1);
                    break;
                case 2:
                    results = phoneBook.searchContact(request, 2);
                    break;
                case 3:
                    results = phoneBook.searchContact(request, 3);
                    break;
                case 4:
                    results = phoneBook.specialFindContact(request);
                    break;
                case 5:
                    results = phoneBook.searchContact(request, 5);
                    break;
                default:
                    System.out.println("Неверный выбор,попробуй заново");
                    return;
            }
            if (results.isEmpty()) {
                System.out.println("Контакты не найдены.");
            } else {
                System.out.println("Найденные контакты:");
                for (Contact contact : results) {
                    System.out.println(contact);
                }
            }
        }
    }

    private static void filterContacts(Scanner scanner, PhoneBook phoneBook) {
        System.out.println("\nФильтрация контактов");
        System.out.println("1 - Возраст больше N");
        System.out.println("2 - Возраст меньше N");
        System.out.println("3 - только мужской пол");
        System.out.println("4 - толькой женский пол");
        System.out.print("Выберите действие: ");

        List<Contact> results = new ArrayList<>();
        int age = 0;
        int select = 0;
        if (!scanner.hasNextInt()) {
            System.out.println("Вы ввели не число");
            scanner.nextLine();
            return;
        }
        select = scanner.nextInt();
        scanner.nextLine();

        switch (select) {
            case 1:
                System.out.print("Введите возраст N: ");
                if (!scanner.hasNextInt()) {
                    System.out.println("Вы ввели не число");
                    scanner.nextLine();
                    break;
                } else {
                    age = scanner.nextInt();
                    scanner.nextLine();
                    results = phoneBook.filterContactsByAge(age, true);
                    break;
                }

            case 2:
                System.out.print("Введите возраст N: ");
                if (!scanner.hasNextInt()) {
                    System.out.println("Вы ввели не число");
                    scanner.nextLine();
                    break;
                } else {
                    age = scanner.nextInt();
                    scanner.nextLine();
                    results = phoneBook.filterContactsByAge(age, false);
                    break;
                }

            case 3:
                results = phoneBook.filterContactsByMale();
                break;
            case 4:
                results = phoneBook.filterContactsByFemale();
                break;
            default:
                System.out.println("Неправильный выбор,попробуйте заново");
                return;
        }
        if (results.isEmpty()) {
            System.out.println("Контакты не найдены.");
        } else {
            System.out.println("Найденные контакты:");
            for (Contact contact : results) {
                System.out.println(contact);
            }
        }
    }

    private static void sortContacts(Scanner scanner, PhoneBook phoneBook) {
        System.out.println("\nСортировка контактов");
        System.out.println("1 - По имени (A-Z)");
        System.out.println("2 - По имени (Z-A)");
        System.out.println("3 - По фамилии");
        System.out.println("4 - По номеру телефона");
        System.out.print("Выберите действие: ");

        int select = 0;
        if (!scanner.hasNextInt()) {
            System.out.println("Вы ввели не число");
            scanner.nextLine();

        } else {
            select = scanner.nextInt();
            scanner.nextLine();

            switch (select) {
                case 1:
                    phoneBook.sortByFirstName(true);
                    break;
                case 2:
                    phoneBook.sortByFirstName(false);
                    break;
                case 3:
                    phoneBook.sortByLastName();
                    break;
                case 4:
                    phoneBook.sortByPhoneNumber();
                    break;
                default:
                    System.out.println("Неправильный выбор,попробуйте заново");
                    return;
            }
            System.out.println("Контакты отсортированы.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileManager fileManager = new FileManager("Users.txt", "contacts.txt");
        List<User> users = fileManager.loadUsers();
        Logger logger = new Logger("Log.txt");
        PhoneBook phoneBook = new PhoneBook(logger);
        User currentUser = null;
        while (currentUser == null) {
            System.out.println("-----------------------");
            System.out.println("|                     |");
            System.out.println("|   1 - Sign in       |");
            System.out.println("|   2 - Sign up       |");
            System.out.println("|   3 - Print logger  |");
            System.out.println("|   4 - Exit          |");
            System.out.println("|                     |");
            System.out.println("-----------------------");
            System.out.print("Выберите действие: ");

            int select = 0;
            if (!scanner.hasNextInt()) {
                System.out.println("Вы ввели не число");
                scanner.nextLine();

            } else {
                select = scanner.nextInt();
                scanner.nextLine();

                switch (select) {
                    case 1:
                        currentUser = Authentication.signIn(scanner, users);
                        if (currentUser != null) {
                            phoneBook.setContacts(fileManager.loadContactsFromFile(currentUser.getUsername()));
                        }
                        break;
                    case 2:
                        currentUser = Authentication.signUp(scanner, users, fileManager);
                        break;
                    case 3:
                        System.out.println("Логи можно посмотреть в файле: Log.txt");
                        break;
                    case 4:
                        System.out.println("Выход из программы");
                        return;
                    default:
                        System.out.println("Неверный выбор попробуй еще");
                        break;
                }
            }
        }

        while (true) {
            System.out.println("\nТелефонная книга");
            System.out.println("1 - Контакты");
            System.out.println("2 - Поиск");
            System.out.println("3 - Фильтрация");
            System.out.println("4 - Сортировка");
            System.out.println("5 - Выйти");
            System.out.print("Выберите действие: ");

            int select = 0;
            if (!scanner.hasNextInt()) {
                System.out.println("Вы ввели не число");
                scanner.nextLine();

            } else {
                select = scanner.nextInt();
                scanner.nextLine();

                switch (select) {
                    case 1:
                        contactsMenu(scanner, phoneBook, currentUser.getUsername(), fileManager, logger);
                        break;
                    case 2:
                        searchContacts(scanner, phoneBook);
                        break;
                    case 3:
                        filterContacts(scanner, phoneBook);
                        break;
                    case 4:
                        sortContacts(scanner, phoneBook);
                        break;
                    case 5:
                        System.out.println("Выход из программы");
                        return;
                    default:
                        System.out.println("Неправильный выбор,попробуйте заново");
                        break;
                }
            }
        }
    }
}
