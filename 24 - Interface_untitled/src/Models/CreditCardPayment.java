package Models;

public class CreditCardPayment implements Payment {
    private String cardHolderName;
    private int cardNumber;

    public CreditCardPayment(String cardHolderName, int cardNumber) {
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Оплата картой. Сумма: " + amount);
        System.out.println("Имя владельца: " + cardHolderName);
        System.out.println("Номер карты: " + cardNumber);
        System.out.println("Оплата прошла успешно.");
    }
}
