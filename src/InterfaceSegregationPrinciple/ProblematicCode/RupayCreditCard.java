package InterfaceSegregationPrinciple.ProblematicCode;

public class RupayCreditCard extends CreditCard {

    @Override
    public void swipeAndPay() {
        System.out.println("Rupay: Swiped and Paid.");
    }

    @Override
    public void deRefund() {
        System.out.println("Rupay: Refund processed.");
    }

    @Override
    public void onlinePayment() {
        System.out.println("Rupay: Online payment done.");
    }

    @Override
    public void tapAndPay() {
        System.out.println("Rupay: Tap and pay done.");
    }

    @Override
    public void upiPayment() {
        System.out.println("Rupay: UPI payment done.");
    }

    @Override
    public void intlPayment() {
        System.out.println("Rupay: International payment done.");
    }
}