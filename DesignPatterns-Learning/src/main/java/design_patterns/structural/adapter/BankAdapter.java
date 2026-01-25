package design_patterns.structural.adapter;

public class BankAdapter implements PaymentProcessor {

    private BankAPI bankAPI;

    public BankAdapter(BankAPI bankAPI) {
        this.bankAPI = bankAPI;
    }

    @Override
    public void pay(double amount) {
        // Translate pay() into makeTransaction()
        bankAPI.makeTransaction(amount);
    }
}
