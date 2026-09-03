package InterfaceSegregationPrinciple.FixedCodeWithISP;

public class DinnersCreditCard extends CreditCard implements RefundCompatibleCreditCard{
    @Override
    public void swipeAndPay() {

    }

    @Override
    public void onlinePayment() {

    }

    @Override
    public void tapAndPay() {

    }
}
