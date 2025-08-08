package Classes;

public class PartTimeEmployee extends Employee {
    private double hourSalary;
    private int hourWorked;

    public PartTimeEmployee(String name, double hourSalary, int hourWorks) {
        super(name);
        this.hourSalary = hourSalary;
        this.hourWorked=hourWorks;
    }

    @Override
    public double calculateSalary() {
        return hourSalary * hourWorked;
    }
}
