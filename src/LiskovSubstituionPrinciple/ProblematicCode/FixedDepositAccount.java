package LiskovSubstituionPrinciple.ProblematicCode;


// Fixed Deposit Account causes a problem!
public class FixedDepositAccount extends BankAccount {
    @Override
    public void withdraw(double amount) {
        // LSP Violation: You can't withdraw early from a fixed deposit,
        // so we are forced to throw a surprise error!
        throw new UnsupportedOperationException("Withdrawals are not allowed from Fixed Deposit Account.");
    }
}

/*If you write a function that loops through a list of generic BankAccount objects and calls .withdraw() on each one,
passing a FixedDepositAccount into that list will crash your program.
 The child class (FixedDepositAccount) broke the promise made by the parent class (BankAccount).
 */
