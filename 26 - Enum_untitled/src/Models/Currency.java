package Models;

public enum Currency {
    USD(79.0),
    EUR(90.0),
    RUB(1.0);
    private final double rateToRuble;

    Currency(double rateToRuble) {
        this.rateToRuble = rateToRuble;
    }

    public double toRuble(double amount) {
        return amount * rateToRuble;
    }

    public double getRateToRuble() {
        return rateToRuble;
    }
}
