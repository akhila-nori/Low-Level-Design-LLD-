package LiskovSubstituionPrinciple.ProblematicCode;

class BankAccount {
    public void withdraw(double amount) {
        System.out.println("Successfully withdrew: " + amount);
    }
}