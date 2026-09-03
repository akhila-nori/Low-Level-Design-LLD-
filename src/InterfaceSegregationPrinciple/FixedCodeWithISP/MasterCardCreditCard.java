package InterfaceSegregationPrinciple.FixedCodeWithISP;

public class MasterCardCreditCard extends CreditCard implements RefundCompatibleCreditCard {
    @Override
    public void swipeAndPay() {
        System.out.println("MasterCard: Swiped and paid.");
    }

    @Override
    public void onlinePayment() {
        System.out.println("MasterCard: Online payment processed.");
    }

    @Override
    public void tapAndPay() {
        System.out.println("MasterCard: Tap and pay successful.");
    }
}
