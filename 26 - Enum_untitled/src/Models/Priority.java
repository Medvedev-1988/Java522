package Models;

public enum Priority {
    LOW(1),
    MEDIUM(2),
    HIGH(3),
    CRITICAL(4);
    private final int priorityCode;

    Priority(int priorityCode) {
        this.priorityCode = priorityCode;
    }

    public int getPriorityCode() {
        return priorityCode;
    }

}
