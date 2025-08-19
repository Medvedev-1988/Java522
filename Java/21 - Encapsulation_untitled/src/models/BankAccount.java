package models;

public class BankAccount {
    private double balance;

    public BankAccount(double initBalance) {
        this.balance = initBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Сумма для пополнения должна быть положительной");
        }
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Сумма для снятия должна быть положительной");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Не хватает средств на счету");
        }
        this.balance -= amount;
    }
}
