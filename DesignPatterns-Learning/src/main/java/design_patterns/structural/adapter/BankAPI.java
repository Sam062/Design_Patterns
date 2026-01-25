package design_patterns.structural.adapter;

public class BankAPI {
    public void makeTransaction(double value) {
        System.out.println("Transaction of Rs." + value + " processed via BankAPI.");
    }
}
