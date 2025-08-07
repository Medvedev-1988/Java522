package Classes;

public class Employee {
    private String name;
    private int age;
    private int id;
    private static int idcounter = 1;

    public Employee(String name, int age) {
        if (age < 0 || age > 65) {
            System.out.println("Ошибка!Возраст должен быть в диапозоне от 18 до 65 лет");
            return;
        }
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Ошибка!Имя не должно быть пустым");
            return;
        }
        this.name = name;
        this.age = age;
        this.id = idcounter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Ошибка!Имя не должно быть пустым");
            return;
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18 || age > 65) {
            System.out.println("Ошибка!Возраст должен быть в диапозоне от 18 до 65 лет");
            return;
        }
        this.age = age;
    }

    public int getId() {
        return id;
    }
}
