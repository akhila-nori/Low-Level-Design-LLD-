package SingleResponsibilityPrinciple.Example2.Problematic_Code;

/*1. Core Definition
Definition: A class or module should have one and only one reason to change, meaning it should only be responsible for a single part of the software's functionality.

        2. The Problem: Violating SRP (Example Analysis)
In the UserManager class below, the class is burdened with multiple distinct responsibilities:

User Management / CRUD Operations: Adding, updating, retrieving, and deleting users.

Business Validation: Checking if a user is an adult (user.getAge() < 18) inside both addUser and update.

        Auditing / Logging: Tracking user actions via logUserActivity.

3. Why This Violates SRP (Reasons to Change)
This class has too many reasons to change, making it fragile and harder to maintain:

Reason 1: Changes in Business Validation Rules

Scenario: If the age requirement changes (e.g., to 21, or adding checks for valid email/location), you have to modify multiple methods (addUser and update).

Reason 2: Changes in Database or Persistence Logic

Scenario: If the way users are saved, updated, or fetched changes (e.g., migrating from an in-memory list to an SQL/NoSQL database), you have to modify the CRUD methods here.

Reason 3: Changes in Logging or Auditing Mechanisms

Scenario: If you switch logging frameworks or need to push activity logs to an external monitoring service, you have to modify logUserActivity().*/

public class UserManager {

    // Responsibility 1 : CRUD Operation
    public void addUser(User user){
        if (user.getAge() < 18) {
            throw new IllegalArgumentException("User is not adult");
        }
    }


    // Responsibility 1 : CRUD Operation
    public void delete(User user){
        System.out.println("User deleted");
    }


    // Responsibility 1: CRUD Operation
    public void update(User user){
        if (user.getAge() < 18) {
            throw new IllegalArgumentException("User is not adult");
        }
        System.out.println("User updated");
    }

    // Responsibility 1: CRUD Operation (Read)
    public void get(User user){
        System.out.println("User returned");
    }


    // Responsibility 2: Cross-Cutting Concern - Logging, Activity Monitoring - based on user clicks, scrolls , onMouseHover etc
    public void logUserActivity(User user){
        System.out.println("User activity logged");
    }
}
