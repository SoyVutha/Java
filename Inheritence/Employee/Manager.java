package Algorithms.Inheritence.Employee;

public class Manager extends Parent implements EmployeeInterface{
    public Manager(String name, int id, double salary){
        super(name,id,salary);  
    }

    public void displayDetails(){
        super.displayDetails();
    }
}
