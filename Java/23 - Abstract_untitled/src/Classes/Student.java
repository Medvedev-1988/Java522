package Classes;

public class Student extends Person {
    String university;

    public Student(String name, int age, String university) {
        super(name, age);
        this.university = university;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Место учебы : " + university);
    }
}
