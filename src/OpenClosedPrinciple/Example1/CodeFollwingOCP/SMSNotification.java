package OpenClosedPrinciple.Example1.CodeFollwingOCP;

public class SMSNotification implements Notification {
    @Override
    public void sendMessage(String message){
        System.out.println("SMS: "+message);
    }
}
