package Solid;

//problem with this employee class, this class is trying to do too many things . Problem of doing too many things in same piece of code - you need to change a lot of things

//because the employee class is doing too many things, if a function needs to be updated - we might have to update the Employee class

//there are too many reasons to update the code present in rhe class. This violates Single responsibility principle

//SINGLE RESPONSIBILITY PRINCIPLE - states that there should be one and only one reason to change a class or piece of code .
//ex This class should be doing only 1 thing - eg. crud or calculation of salary


public class Employee {
    private int id;
    private String name;
    private String address;

    public Employee(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void printPerformanceReport(){
        System.out.println("Performance report of employee : "+name);
    }

    public double computeSalary(){
        return 1000.0;
    }

    //if data storage req is changed, we might need to update this function
    public void updateEmployeeData(){
        System.out.println("Employee data successfully updated");
    }


    public void fetchEmployeeData(){
        System.out.println("Employee data fetched successfully");
    }
}
