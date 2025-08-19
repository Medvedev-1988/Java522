package Models;

public enum Direction {
    NORTH("Север"),
    SOUTH("Юг"),
    EAST("Восток"),
    WEST("Запад");
    private final String direction;

    Direction(String direction) {
        this.direction=direction;
    }

    public String getDirection() {
        return direction;
    }

    public Direction opposite() {
        switch (this) {
            case NORTH -> {
                return SOUTH;
            }
            case SOUTH -> {
                return NORTH;
            }
            case EAST -> {
                return WEST;
            }
            case WEST -> {
                return EAST;
            }
            default -> {
                return null;
            }
        }
    }
}
