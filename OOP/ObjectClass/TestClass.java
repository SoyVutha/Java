package OOP.ObjectClass;
public class TestClass {
    String name="Vutha";
    int age=24;
    private String Surname="Duck";

    public int getAge(){
        return age;
    }
    public String getname(){
        return name;
    }

    public void SayHi(){
        System.out.println("Hello, my name is "+name+" and I am "+age+" years");
    }

    public void SayBye(){
        System.out.println("Bye, my name is "+name+" and I am "+age+"");    
    }

}
