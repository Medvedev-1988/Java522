package Classes;

public class Passport {
    private String nationality;
    private final String number;

    public Passport(String nationality, String number) {
        this.nationality = nationality;
        this.number = number;
    }

    public String getNationality() {
        return nationality;
    }

    public String getNumber() {
        return number;
    }
}
