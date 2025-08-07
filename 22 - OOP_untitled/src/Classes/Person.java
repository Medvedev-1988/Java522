package Classes;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean isValid() {
        return name != null && !name.trim().isEmpty() && age > 0;
    }

    public void printInfo() {
        if (isValid()) {
            System.out.println(name + " " + age);
        } else {
            System.out.println("Данные не верны!");
        }
    }
}
