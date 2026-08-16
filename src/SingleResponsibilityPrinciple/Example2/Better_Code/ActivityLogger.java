package SingleResponsibilityPrinciple.Example2.Better_Code;

import SingleResponsibilityPrinciple.Example2.Problematic_Code.User;

public class ActivityLogger {

    // Responsibility 2: Cross-Cutting Concern - Logging, Activity Monitoring - based on user clicks, scrolls , onMouseHover etc
    public void logUserActivity(User user){
        System.out.println("User activity logged");
    }
}
