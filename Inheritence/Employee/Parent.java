package Algorithms.Inheritence.Employee;

public class Parent {
    public String name;public int id;public double salary;
    public Parent(String name, int id, double salary) {this.name = name;this.id = id;this.salary = salary;}
    //getter
    public String getName() {return name;}
    public int getId() {return id;}
    public double getSalary() {return salary;}
    //setter
    public void setName(String name) {this.name = name;}
    public void setId(int id) {this.id = id;}
    public void setSalary(double salary) {this.salary = salary;}
    //method
    public void displayDetails()
    {
        System.out.println("Name : "+this.name);
        System.out.println("ID : "+this.id);
        System.out.println("Salary : "+this.salary);
        
    }
}
