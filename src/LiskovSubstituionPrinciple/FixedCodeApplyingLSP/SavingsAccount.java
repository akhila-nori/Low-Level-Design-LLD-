package LiskovSubstituionPrinciple.FixedCodeApplyingLSP;

public class SavingsAccount extends BankAccount implements Withdrawable {
    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawing $" + amount + " from Savings.");
    }
}
