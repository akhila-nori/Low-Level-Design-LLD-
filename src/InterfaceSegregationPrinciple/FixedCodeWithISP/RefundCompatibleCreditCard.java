package InterfaceSegregationPrinciple.FixedCodeWithISP;

public interface RefundCompatibleCreditCard {

    default void doRefund() {
        System.out.println("Refund processed successfully.");
    }
}
