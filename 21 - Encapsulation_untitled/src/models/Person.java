package models;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Ошибка!Возраст не может быть отрицательным");
            return;
        }
        this.age = age;
    }

    public void info() {
        System.out.println(name + " " + age);
    }
}
