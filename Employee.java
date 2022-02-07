package Overloading;

public class Employee {
    int employeeID=105;
    String employeeName="Dinesh";

    void searchEmployee(int empId){
        if (empId==employeeID){
            System.out.println("Employee id is "+employeeID);
            System.out.println("Employee Name is "+employeeName);
        }else {
            System.out.println("Record not Found");
        }
    }void searchEmployee(String name){
        if (name.equalsIgnoreCase(employeeName)){
            System.out.println("Employee Id is "+employeeID);
            System.out.println("Employee Name is "+employeeName);
        }else{
            System.out.println("Record not Found");
        }
    }
}
