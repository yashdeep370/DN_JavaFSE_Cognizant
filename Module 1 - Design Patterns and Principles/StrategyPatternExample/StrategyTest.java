public class StrategyTest {

    public static void main(String[] args) {

        PaymentContext payment =
                new PaymentContext(
                        new CreditCardPayment());

        payment.makePayment(5000);

        payment.setStrategy(
                new PayPalPayment());

        payment.makePayment(10000);

        payment.setStrategy(
                new UPIPayment());

        payment.makePayment(2000);
    }
}