package Algorithms.Inheritence.Employee;

public class Main {
    public static void main(String[] args) 
    {
        EmployeeInterface manager=new Manager("Duck",5,500);
        EmployeeInterface worker=new Manager("Quack",4,800);
    }
}
