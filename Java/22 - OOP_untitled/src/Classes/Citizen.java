package Classes;

public class Citizen {
    String name;
    private Passport passport;

    public Citizen(String name, Passport passport) {
        this.name = name;
        this.passport = passport;
    }

    public Passport getPassport() {
        return passport;
    }

    public String getName() {
        return name;
    }

    public void printPassportInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Национальность: " + passport.getNationality());
        System.out.println("Номер пасспорта: " + passport.getNumber());
    }
}


