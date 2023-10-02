package v3_OOP_Concept;

public class Employee {
    String Employee_Name = "Varshil";
    int  Employee_ID = 100;
    int Employee_Salary = 50000;


    public void displayEmployeeBonus(){
        System.out.println(Employee_Name + " is gets the bonus of " + (Employee_Salary * 0.20));
    }
}
