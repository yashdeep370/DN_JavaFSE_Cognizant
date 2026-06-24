class PaytmAdapter implements PaymentProcessor {

    private PaytmGateway paytmGateway;

    public PaytmAdapter() {
        paytmGateway = new PaytmGateway();
    }

    public void processPayment(double amount) {
        paytmGateway.makePayment(amount);
    }
}