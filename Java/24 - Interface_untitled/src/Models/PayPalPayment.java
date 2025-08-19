package Models;

public class PayPalPayment implements Payment {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Оплата через PayPal. Сумма: " + amount);
        System.out.println("Email: " + email);
        System.out.println("Оплата прошла успешно.");
    }
}
