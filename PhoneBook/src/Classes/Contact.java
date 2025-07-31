package Classes;

import java.util.Objects;

public class Contact {
    private int id;
    private String name;
    private String lastName;
    private String phoneNumber;
    private int age;

    public Contact(int id, String name, String lastName, String phoneNumber, int age) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", Имя: " + name +
                ", Фамилия: " + lastName +
                ", Телефон: " + phoneNumber +
                ", Возраст: " + age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return id == contact.id && age == contact.age && Objects.equals(name, contact.name) && Objects.equals(lastName, contact.lastName) && Objects.equals(phoneNumber, contact.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastName, phoneNumber, age);
    }
}
