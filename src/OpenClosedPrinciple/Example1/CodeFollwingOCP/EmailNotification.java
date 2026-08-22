package OpenClosedPrinciple.Example1.CodeFollwingOCP;

public class EmailNotification implements Notification  {

    //Constructor Chaining / Immediate Execution: Calling a method inside a constructor to perform an immediate action during object initialization.

    //Immediate Execution / Fire-and-Forget Actions: You want an object to perform a task instantly the second it is instantiated (like logging an event, triggering a notification, or establishing a connection).

    //Dependency Injection / Initialization: You need to pass required data into an object so it has everything it needs before it starts running its logic.
//    public EmailNotification(String m){
//        sendMessage(m);
//    }

        @Override
        public void sendMessage(String message) {
            System.out.println("Email: "+message);
        }
}

/*If you don't call sendMessage(message) inside the constructor, nothing will happen automatically when the object is created.

Here is what changes if you leave it out:

        1. The Object is Created, But Idle
If your constructor is empty (or only stores fields like this.message = message;), instantiating the object with new EmailNotification("Hello") will just allocate memory for it and store the data. It will not print or send anything on its own.

        2. You Have to Call the Method Manually Later
To actually send or print the notification, you would have to capture the created object in a variable and call the method yourself on a separate line:

Java
// 1. Create the object (nothing prints yet)
EmailNotification emailNotification = new EmailNotification("Hello");

// 2. You must manually call the method to make it run
emailNotification.sendMessage("Hello");

Summary
Calling sendMessage() inside the constructor triggers the action instantly upon creation. Omitting it means the object waits passively until you explicitly invoke the method later in your code.
*/