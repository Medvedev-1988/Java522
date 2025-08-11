package Classes;

public class Employee {
    private int id;
    private int idCount = 1;
    private String name;
    private int age;

    public Employee(int idCount, String name, int age) {
        this.id = idCount++;
        this.idCount = idCount;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (getName() == null) {
            System.out.println("Имя не должно быть пустым");
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18 || age > 65) {
            System.out.println("Возраст должен быть в диапазоне от 18 до 65 лет");
        } else {
            this.age = age;
        }
    }
}
