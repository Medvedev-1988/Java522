package Classes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PhoneBook {
    private List<Contact> contacts;
    private Logger logger;

    public PhoneBook(Logger logger) {
        this.contacts = new ArrayList<>();
        this.logger = logger;
    }

    public void addContact(Contact contact) {
        if (contact.getName() == null || contact.getName().isEmpty() ||
                contact.getLastName() == null || contact.getLastName().isEmpty() ||
                contact.getPhoneNumber() == null || contact.getPhoneNumber().isEmpty()) {
            logger.log("Ошибка при добавлении контакта");
        }
        Contact newContact = new Contact(contact.getId(), contact.getName(), contact.getLastName(), contact.getPhoneNumber(), contact.getAge());
        contacts.add(newContact);
        logger.log("Добавлен новый контакт: " + contact.getName() + " " + contact.getLastName());
    }

    public void deleteContactById(int id) {
        contacts.removeIf(contact -> contact.getId() == id);
        logger.log("Удалён контакт с ID: " + id);

    }

    public void deleteContactByNameOrLastname(String nameOrLastname) {
        contacts.removeIf(contact -> contact.getName().equalsIgnoreCase(nameOrLastname) || contact.getLastName().equalsIgnoreCase(nameOrLastname));
        logger.log("Удалён контакт с именем или фамилией: " + nameOrLastname);

    }

    public void deleteContactByPhoneNumber(String phoneNumber) {
        contacts.removeIf(contact -> contact.getPhoneNumber().equals(phoneNumber));
        logger.log("Удалён контакт с телефоном: " + phoneNumber);

    }

    public void updateContact(int id, Contact updatedContact) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getId() == id) {
                contacts.set(i, updatedContact);
                logger.log("Обновлён контакт с ID: " + id);
                return;
            }
        }
        logger.log("Ошибка обновления контакта(контакт с ID: " + id + " не найден)");
    }

    public List<Contact> getAllContacts() {
        return new ArrayList<>(contacts);
    }

    public List<Contact> searchContact(String request, int userChoice) {
        String requestLowerCase = request.toLowerCase();
        List<Contact> findContacts = new ArrayList<>();
        for (Contact contact : contacts) {
            switch (userChoice) {
                case 1:
                    if (contact.getName().toLowerCase().equals(requestLowerCase)) {
                        findContacts.add(contact);
                    }
                    break;
                case 2:
                    if (contact.getLastName().toLowerCase().equals(requestLowerCase)) {
                        findContacts.add(contact);
                    }
                    break;
                case 3:
                    if (contact.getPhoneNumber().equals(request)) {
                        findContacts.add(contact);
                    }
                    break;
                case 5:
                    if (contact.getName().toLowerCase().contains(requestLowerCase)
                            || contact.getLastName().toLowerCase().contains(requestLowerCase)
                            || contact.getPhoneNumber().contains(request)) {
                        findContacts.add(contact);
                    }
                    break;
            }
        }
        return findContacts;
    }

    public List<Contact> specialFindContact(String request) {
        String requestLowerCase = request.toLowerCase();
        List<Contact> results = new ArrayList<>();
        for (Contact contact : contacts) {
            if (matchesPattern(contact.getName().toLowerCase(), requestLowerCase) ||
                    matchesPattern(contact.getLastName().toLowerCase(), requestLowerCase) ||
                    matchesPattern(contact.getPhoneNumber().toLowerCase(), requestLowerCase)) {
                results.add(contact);
            }
        }
        return results;
    }

    private boolean matchesPattern(String text, String pattern) {
        pattern = pattern.replace("_", ".")
                .replace("%", ".*");
        return text.matches("(?i)" + pattern);
    }

    public List<Contact> filterContactsByAge(int age, boolean greaterThan) {
        return contacts.stream()
                .filter(contact -> greaterThan ? contact.getAge() > age : contact.getAge() < age)
                .collect(Collectors.toList());
    }

    public List<Contact> filterContactsByMale() {
        return contacts.stream()
                .filter(contact -> contact.getLastName().endsWith("ev") || contact.getLastName().endsWith("ov") || contact.getLastName().endsWith("in"))
                .collect(Collectors.toList());
    }

    public List<Contact> filterContactsByFemale() {
        return contacts.stream()
                .filter(contact -> contact.getLastName().endsWith("eva") || contact.getLastName().endsWith("ova") || contact.getLastName().endsWith("ina"))
                .collect(Collectors.toList());
    }

    public void sortByFirstName(boolean ascending) {
        if (ascending) {
            contacts.sort(Comparator.comparing(Contact::getName));
        } else {
            contacts.sort(Comparator.comparing(Contact::getName).reversed());
        }
        logger.log("Контакты отсортированы по имени (" + (ascending ? "A-Z" : "Z-A") + ")");
    }

    public void sortByLastName() {
        contacts.sort(Comparator.comparing(Contact::getLastName));
        logger.log("Контакты отсортированы по фамилии.");
    }

    public void sortByPhoneNumber() {
        contacts.sort(Comparator.comparing(Contact::getPhoneNumber));
        logger.log("Контакты отсортированы по номеру телефона.");
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
}
