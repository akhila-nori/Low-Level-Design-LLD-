package OpenClosedPrinciple.Example1.CodeFollwingOCP;

public class PushNotification implements Notification {


    @Override
    public void sendMessage(String message){
        System.out.println("Push: "+message);
    }
}
