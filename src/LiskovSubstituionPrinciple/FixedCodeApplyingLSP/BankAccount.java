package LiskovSubstituionPrinciple.FixedCodeApplyingLSP;

abstract public class BankAccount {
    double balance;
}

//Before writing code, an engineer asks: "If I replace the parent type with the child type anywhere in the codebase, will anything break?"

/* Why do we need the Abstract Class (BankAccount)?
Need: To share common data and prevent invalid base objects.

        Sharing Data (double balance;): Every bank account in the world—whether it's a savings account, a checking account, or a fixed deposit—needs to track money (balance). Instead of writing double balance; inside every single class separately, we put it in one place (BankAccount) so it is automatically shared.

        */


//Preventing direct creation: We use abstract because a generic "Bank Account" is too vague to exist on its own in real life.
// If someone tries to open just a raw new BankAccount(), the system blocks it.
// You must open a specific type of account (like a Savings or Fixed Deposit).