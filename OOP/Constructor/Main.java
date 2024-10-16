package OOP.Constructor;

public class Main {
    public static void main(String[] args) {
        // Constructor with no parameter
        Class duck=new Class();
        Class2 Quack=new Class2();
        System.out.println("Age"+Quack.userage);
        Quack.Info("Quack", 98);
        System.out.println("Name: " + Quack.username + " / Age: " + Quack.userage);

        System.out.println("Name: "+duck.name+" / Age: "+duck.age);

    }   
}
