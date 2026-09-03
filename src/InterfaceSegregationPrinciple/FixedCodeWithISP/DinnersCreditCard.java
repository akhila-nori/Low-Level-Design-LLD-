package InterfaceSegregationPrinciple.FixedCodeWithISP;

public class DinnersCreditCard extends CreditCard implements RefundCompatibleCreditCard{
    @Override
    public void swipeAndPay() {
        System.out.println("Dinners Club card: Swiped and paid.");
    }

    @Override
    public void onlinePayment() {
        System.out.println("Dinners Club card: Online payment processed.");

    }

    @Override
    public void tapAndPay() {
        System.out.println("Dinners Club card: Tap and pay successful.");
    }
}
