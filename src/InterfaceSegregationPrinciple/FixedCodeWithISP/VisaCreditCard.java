package InterfaceSegregationPrinciple.FixedCodeWithISP;

public class VisaCreditCard extends CreditCard {
    @Override
    public void swipeAndPay() {
        System.out.println("Visa card: Swiped and paid.");
    }

    @Override
    public void onlinePayment() {
        System.out.println("Visa card: Online payment processed.");
    }

    @Override
    public void tapAndPay() {
        System.out.println("Visa card: Tap and pay successful.");
    }
}
