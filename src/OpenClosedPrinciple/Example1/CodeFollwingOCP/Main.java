package OpenClosedPrinciple.Example1.CodeFollwingOCP;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //1 Create a list of Notification objects (polymorphism in action)
        List<Notification> notificationList = Arrays.asList(
                new SMSNotification(),
                new EmailNotification(),
                new PushNotification()
        );

        //2. Instantiate the NotificationSender class and call the sendNotifications method
        NotificationSender notificationSender = new NotificationSender();

        // 3. call the sendNotifications method to Send notifications using the list of Notification objects
        notificationSender.sendNotifications(notificationList, "Hello, this is a system alert!");
    }
}
