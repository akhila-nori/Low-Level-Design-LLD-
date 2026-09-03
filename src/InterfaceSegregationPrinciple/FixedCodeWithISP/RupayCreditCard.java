package InterfaceSegregationPrinciple.FixedCodeWithISP;

public class RupayCreditCard extends CreditCard implements UpiCompatableCreditCard {
    @Override
    public void swipeAndPay() {
        System.out.println("Rupay card: Swiped and paid.");
    }

    @Override
    public void onlinePayment() {
        System.out.println("Rupay card: Online payment processed.");
    }

    @Override
    public void tapAndPay() {
        System.out.println("Rupay card: Tap and pay successful.");
    }

    @Override
    public void upiPayment() {
        System.out.println("Rupay card: UPI payment processed.");
    }
}
