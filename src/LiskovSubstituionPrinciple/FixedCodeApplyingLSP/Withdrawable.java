package LiskovSubstituionPrinciple.FixedCodeApplyingLSP;

interface Withdrawable {
    void withdraw(double amount);
}

/*Why do we need the Interface (Withdrawable)?
Need: To handle a capability that not all bank accounts share.

Not all accounts act the same: A Savings Account allows withdrawals, but a Fixed Deposit locks your money away.

The Interface as a "Permission Tag": By making Withdrawable an interface with a withdraw() method, it acts like a special tag or badge. Only classes that actually support withdrawals choose to wear that badge (implements Withdrawable).

 */