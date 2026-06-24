public class AdapterTest {

    public static void main(String[] args) {

        PaymentProcessor paytm =
                new PaytmAdapter();

        PaymentProcessor stripe =
                new StripeAdapter();

        paytm.processPayment(5000);

        stripe.processPayment(10000);
    }
}