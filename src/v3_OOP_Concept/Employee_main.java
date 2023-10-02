package v3_OOP_Concept;

public class Employee_main {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        emp1.Employee_Name = "bob";
        emp1.Employee_Salary = 100000;
        emp1.displayEmployeeBonus();

        emp2.Employee_Name = "jhon";
        emp2.Employee_Salary = 25000;
        emp2.displayEmployeeBonus();
    }
}
