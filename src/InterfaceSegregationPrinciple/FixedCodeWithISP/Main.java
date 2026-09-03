package InterfaceSegregationPrinciple.FixedCodeWithISP;

public class Main {
    public static void main(String[] args) {
        CreditCard visa = new VisaCreditCard();
        visa.swipeAndPay();

        System.out.println("-------------------");

        MasterCardCreditCard masterCard = new MasterCardCreditCard();
        masterCard.onlinePayment();
        masterCard.doRefund();

        System.out.println("-------------------");

        RupayCreditCard rupayCard = new RupayCreditCard();
        rupayCard.tapAndPay();
        rupayCard.upiPayment();
    }
}