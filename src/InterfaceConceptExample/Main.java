package InterfaceConceptExample;

interface PaymentGateway {
    // 1. Abstract method: Has no body; MUST be implemented by any class that implements this interface.
    void processPayment(double amount);

    // 2. Default method: Has a body; inherited automatically by implementing classes,
    // but can be overridden if a class wants a custom version.
    default void printReceipt(double amount) {
        System.out.println("Default Receipt: Transaction of $" + amount + " was successful.");
    }

    // 3. Static method: Has a body and belongs strictly to the interface itself.
    // Cannot be overridden by classes and must be called using the interface name.
    static void displaySupportedCurrency() {
        System.out.println("Supported Currency: USD ($)");
    }
}

// Implementing Class
class CreditCardPayment implements PaymentGateway {

    // Must implement the abstract method
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing $" + amount + " securely via Credit Card network.");
    }

    // Note: We are NOT forced to implement printReceipt() because it is a 'default' method.
    // We inherit the default behavior automatically, though we could override it if we wanted to.
}

public class Main {
    public static void main(String[] args) {
        // --- STATIC METHOD ACCESS ---
        // Called directly on the Interface name. No object required.
        PaymentGateway.displaySupportedCurrency();
        // Output: Supported Currency: USD ($)

        // --- ABSTRACT & DEFAULT METHOD ACCESS ---
        // Created via an object instance of the concrete class
        PaymentGateway payment = new CreditCardPayment();

        // Calls the subclass's implementation of the abstract method
        payment.processPayment(250.00);
        // Output: Processing $250.00 securely via Credit Card network.

        // Calls the inherited default method from the interface
        payment.printReceipt(250.00);
        // Output: Default Receipt: Transaction of $250.00 was successful.
    }
}