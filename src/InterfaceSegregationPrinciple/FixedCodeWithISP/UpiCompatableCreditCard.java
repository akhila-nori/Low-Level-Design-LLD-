package InterfaceSegregationPrinciple.FixedCodeWithISP;

//not all credit cards support UPI payment, so we will create a separate interface for UPI compatible credit cards
// only those credit cards which support UPI payment will implement this interface
public interface UpiCompatableCreditCard {
    void upiPayment();
}
