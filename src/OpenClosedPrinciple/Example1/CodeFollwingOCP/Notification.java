package OpenClosedPrinciple.Example1.CodeFollwingOCP;

//Created an interface - bcz Email, WhatsApp push etc -> all these are Email notifications
public interface Notification {

    void sendMessage(String message);
}
