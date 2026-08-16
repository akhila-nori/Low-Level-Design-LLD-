package SingleResponsibilityPrinciple.Example1.Problematic_Code;

/*Single Responsibility Principle (SRP) — Study Notes
1. Core Definition
Definition: The Single Responsibility Principle states that a class or a piece of code should have one and only one reason to change.

Rule of Thumb: A class should be responsible for a single part of the functionality provided by the software, and that responsibility should be entirely encapsulated by the class.

        2. The Problem: Violating SRP (Example Analysis)
When a class is tasked with too many responsibilities, any change in business requirements forces you to modify that same piece of code repeatedly.

Looking at the example Employee class, it currently handles multiple distinct responsibilities:

Business Logic / Calculations: Calculating salaries.

Reporting / Presentation: Printing performance reports.

Data Management / Persistence: Fetching and updating employee data.

3. Why Violating SRP Causes Issues (Reasons to Change)
A class violating SRP has too many reasons to change, making maintenance fragile:

Reason 1: Changes in Business Rules (Tax Slabs)

Scenario: If the government changes tax slabs in an upcoming budget, the salary calculation logic must be updated.

Impact: Forces changes inside the core Employee class.

Reason 2: Changes in Data Storage / Infrastructure

Scenario: A startup scales from 20–30 employees using a simple Excel sheet to 10,000+ employees requiring a dedicated database.

        Impact: Data storage requirements change, requiring updates to data-handling functions like updateEmployeeData().

Reason 3: Changes in Output / Report Formats

Scenario: Performance reports need to move from a Word document format to a PDF format.

Impact: The printPerformanceReport() function requires modification.*/



//problem with this employee class, this class is trying to do too many things (many functions). Problem of doing too many things in same piece of code - you need to change/update a lot of things in same piece of code

//there are too many reasons to update the code present in rhe class. This violates Single responsibility principle

//SINGLE RESPONSIBILITY PRINCIPLE - states that there should be one and only one reason to change a class or piece of code .
//ex This class should be doing only 1 thing - eg. crud or calculation of salary , or perfromance report  ... any one thing


public class Employee {
    private int id;
    private String name;
    private String address;

    public Employee(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    // Responsibility 1: Reporting
    public void printPerformanceReport(){
        System.out.println("Performance report of employee : "+name);
    }

    // Responsibility 2: Calculation / Business Logic
    public double computeSalary(){
        return 1000.0;
    }

    //if data storage req is changed, we might need to update this function
    // Responsibility 3: Data Management (Persistence)
    public void updateEmployeeData(){
        System.out.println("Employee data successfully updated");
    }


    // Responsibility 3: Data Management (Persistence)
    public void fetchEmployeeData(){
        System.out.println("Employee data fetched successfully");
    }
}
