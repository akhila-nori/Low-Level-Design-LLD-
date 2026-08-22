package OpenClosedPrinciple.Example1.BetterCode;

//This class will be modified everytime we introduce or remove any type of notification . This is a clear violation of OCP. The features of this class don't look extensible.
//

import java.util.List;

public class NotificationSender {

    public void sendNotifications(List<String> notificationTypes, String message){
        for(String n :  notificationTypes){
            switch(n){
                case "SMS":
                    SMSNotification smsNotification = new SMSNotification(message);
                    break;

                case "EMAIL":
                    EmailNotification emailNotification = new EmailNotification(message);
                    break;

                case "PUSH":
                   PushNotification pushNotification = new PushNotification(message);
                    break;
            }
        }
    }
}
