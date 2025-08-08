package Classes;

public class FullTimeEmployee extends Employee {
    private double monthSalary;

    public FullTimeEmployee(String name, double monthSalary) {
        super(name);
        this.monthSalary = monthSalary;
    }

    @Override
    public double calculateSalary() {
        return monthSalary;
    }
}
