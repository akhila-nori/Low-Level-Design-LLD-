package SingleResponsibilityPrinciple.Example1.Better_Code;


//core employee class need not change
//each class segregation of concern
//in this way we are able to achieve single responsibility principle (SRP) - this class follows SRP

//This class is now only responsible for basic employee data creation and fetching

public class Employee {

    private int id;
    private String name;
    private String address;

    public Employee(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getEmployeeId(){
        return id;
    }

    public String getEmployeeName(){
        return name;
    }

    public String getEmployeeAddress(){
        return address;
    }

    public void setEmployeeAdress(){
        this.address = address;
    }

    public void setEmployeeName(){
        this.name = name;
    }

}
