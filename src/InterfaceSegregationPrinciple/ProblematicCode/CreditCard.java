package InterfaceSegregationPrinciple.ProblematicCode;

//Credit card class is abstract class because, credit card in itself is nothing ... it is driven by credit card issuing company like Visa, Mastercard, etc. So, it is abstract class and not interface because it has some common properties like card number, card holder name, expiry date, cvv etc. which are common to all credit cards.

public abstract class CreditCard {

    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;
    private int cvv;

    //Getter and Setter methods for the above fields

    // Getters and Setters
    public String getCardNumber() { return cardNumber; }
    public void setCardNumber(String cardNumber) { this.cardNumber = cardNumber; }

    public String getCardHolderName() { return cardHolderName; }
    public void setCardHolderName(String cardHolderName) { this.cardHolderName = cardHolderName; }

    public String getExpiryDate() { return expiryDate; }
    public void setExpiryDate(String expiryDate) { this.expiryDate = expiryDate; }

    public int getCvv() { return cvv; }
    public void setCvv(int cvv) { this.cvv = cvv; }

    public abstract void swipeAndPay();

    public abstract void deRefund(); //doRefund() is not supported via Dinners . If you pay anything apart from Dinners, you can do refund but if you pay via Dinners, you cannot do refund. So, this method is not supported by Dinners.
    //very likely Dinners will throw exception for refund() - Rupay, MasterCard, Visa will support refund()

    public abstract void onlinePayment();

    public abstract void tapAndPay();

    public abstract void upiPayment(); //UPI payment is not supported by all credit cards LIKE Visa, Dinners and Amex
    //you can only do upi on Rupay cards - sad but reality --> Currently
    // What if gov of India mandates all CreditCards to support UPI ?


    public abstract void intlPayment(); //International payment is not supported by all credit cards LIKE Rupay card
    //And Scenario - for intl transactions - lets say Mastercard expects a PIN but Visa, Dinners doesn't expect a PIN. So, this method is not supported by all credit cards.

//CreditCard is driven by issuing company not bank - it can be Visa credit card

    public static void main(String[] args) {
        CreditCard myCard = new RupayCreditCard();
        myCard.setCardHolderName("Akhila");
        System.out.println("Cardholder: " + myCard.getCardHolderName());
        myCard.swipeAndPay();
    }
}