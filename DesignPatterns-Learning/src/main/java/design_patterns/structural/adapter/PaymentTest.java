package design_patterns.structural.adapter;

public class PaymentTest {
    public static void main(String[] args) {
        // Using adapter to connect incompatible interfaces
        BankAPI bankAPI = new BankAPI();
        PaymentProcessor paymentProcessor = new BankAdapter(bankAPI);
        paymentProcessor.pay(10000); // Client still calls pay(), internally routed to makeTransaction()
    }
}
