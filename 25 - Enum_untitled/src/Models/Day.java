package Models;

public enum Day {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресение");
    private final String dayOfTheWeekend;

    Day(String dayOfTheWeekend) {
        this.dayOfTheWeekend = dayOfTheWeekend;
    }

    public String getDayOfTheWeekend() {
        return dayOfTheWeekend;
    }

    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }
}
