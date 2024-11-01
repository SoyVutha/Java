package Algorithms.Inheritence.Employee;

public class Worker extends Parent implements EmployeeInterface {
    public Worker(String name,int id,double salary){
        super(name,id,salary);
    }

    public void displayDetails(){
        super.displayDetails();
    }
}
