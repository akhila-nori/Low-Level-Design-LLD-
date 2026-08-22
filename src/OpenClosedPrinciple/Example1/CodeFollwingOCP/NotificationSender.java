package OpenClosedPrinciple.Example1.CodeFollwingOCP;

//This class will be modified everytime we introduce or remove any type of modification . This is a clear violation of OCP

import java.util.List;

public class NotificationSender {

    //NotificationSender iterates through the list of Notification interfaces without needing to know whether they are emails, SMS, or push alerts
    //Each respective class executes its own implementation of sendMessage(message).

    //Instead of being tightly coupled to type of notifications - kept it generic List<Notification>, we now depend on notification interface.
    //Even if we introduce new type of notifications or remove any older one, the sender class is not impacted. This is the essence of OCP.
    public void sendNotifications(List<Notification> notificationTypes, String message){
        for(Notification n :  notificationTypes){
            n.sendMessage(message);
            }
        }
    }

// How OCP solved the problem - This NotificationSender class is no longer tightly coupled with the Types of Notification
// now if we introduce a new type of notification, we don't need to modify this class. We just need to create a new class that implements the Notification interface and add it to the list of notificationTypes. This way, we can add new types of notifications without modifying the existing code.

// The NotificationSender class is now open for extension but closed for modification. We can add new types of notifications without modifying the existing code. This is the essence of the Open/Closed Principle.

// now if we introduce a new type of notification, or remove any type of notification, we don't need to modify this class (THIS CLASS DOESN'T NEED TO BE MODIFIED - or this class doesn't care).


//------------------------------------------------------------Extra notes line wise concepts-----------------------------
/*for (Notification n : notificationTypes) {
    n.sendMessage(message);
}
Step A: Compile Time (The Compiler's View)
When Java compiles your code, it looks at n and says: "I don't know what specific object n will hold when the app runs. But because its type is Notification, I trust that whatever it is, it has a sendMessage() method."

The compiler is satisfied because the interface guarantees that method exists.

Step B: Runtime (The JVM's View)
When your program is actually executing and hits that loop, the list hands items to n one by one:

First iteration: n holds an EmailNotification object. The Java Virtual Machine (JVM) looks at the memory and says, "Ah, this specific box actually contains an EmailNotification!" It runs the email version of sendMessage.
Second iteration: n holds an SMSNotification object. The JVM checks memory, sees it's an SMS object, and runs the SMS version of sendMessage.
Third iteration: n holds a PushNotification object. The JVM runs the push version.

point - Why is this powerful? (No more if-else / switch)
Without dynamic dispatch, your NotificationSender would have to manually inspect each item using a switch or if-else statement to figure out what it is:

// WITHOUT Dynamic Dispatch (The old, rigid way)
if (n instanceof EmailNotification) {
    ((EmailNotification) n).sendEmail();
} else if (n instanceof SMSNotification) {
    ((SMSNotification) n).sendSMS();
}

If you wanted to add a WhatsAppNotification tomorrow, you would have to go back and rewrite/modify that if-else block, violating the Open-Closed Principle (OCP).

With Dynamic Dispatch, Java's runtime handles the decision-making under the hood. Your NotificationSender just says "Send the message!" and steps out of the way, letting each object handle its own behavior automatically.

 */

/*
When you create an object in Java (like new EmailNotification()), the JVM allocates a block of memory for it on the heap.
Even though the variable n is typed as a generic Notification interface, the actual object sitting in the heap memory proudly carries a tag saying: "I am an EmailNotification!"

Check the Heap: The JVM looks at the current item referenced by n in memory.

Read the Class Tag: It checks the object's hidden class pointer to see its true identity (e.g., SMSNotification).
Jump and Execute: The CPU jumps directly to that memory address and runs it.

Because this lookup happens dynamically while the program is running (rather than being locked down when the code was compiled), it is called Dynamic Method Dispatch.
 */