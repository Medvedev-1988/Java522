package Models;

public class CryptoPayment implements Payment {
    private String walletAddress;
    private String cryptocurrency;

    public CryptoPayment(String walletAddress, String cryptocurrency) {
        this.walletAddress = walletAddress;
        this.cryptocurrency = cryptocurrency;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Оплата криптовалютой " + cryptocurrency + ". Сумма: " + amount);
        System.out.println("Адрес кошелька: " + walletAddress);
        System.out.println("Операция прошла успешно.");
    }
}
