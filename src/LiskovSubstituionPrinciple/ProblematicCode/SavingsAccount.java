package LiskovSubstituionPrinciple.ProblematicCode;

public class SavingsAccount extends BankAccount {
    @Override
    public void withdraw(double amount) {
        // Inherits withdraw() naturally
    }
}
