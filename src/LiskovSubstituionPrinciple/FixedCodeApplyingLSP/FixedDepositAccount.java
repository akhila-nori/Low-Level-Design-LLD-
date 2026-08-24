package LiskovSubstituionPrinciple.FixedCodeApplyingLSP;


//Fixed Deposit Account is a BankAccount, but it does NOT implement Withdrawable
public class FixedDepositAccount extends BankAccount {
    // FixedDepositAccount does not implement Withdrawable, so it cannot withdraw funds
    // This adheres to the Liskov Substitution Principle

    // No broken withdraw() method here!
    // It safely does its own thing without surprising anyone.
}
