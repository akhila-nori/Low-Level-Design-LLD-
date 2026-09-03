package InterfaceSegregationPrinciple.FixedCodeWithISP;

public class RupayCreditCard extends CreditCard implements UpiCompatableCreditCard {
    @Override
    public void swipeAndPay() {

    }

    @Override
    public void onlinePayment() {

    }

    @Override
    public void tapAndPay() {

    }

    @Override
    public void upiPayment() {

    }
}
