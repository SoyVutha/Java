package Food;

//public access modifier is not allowed for variables declared inside methods or constructors in Java
//only one public class per file
import java.text.SimpleDateFormat;

public class User {
    public  String name;
    public  float balance;
    public  int id;
    public  String date;
    public  SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    public static User[] Users=new User[100];

    // Default Constructor
    public User() {
        this.balance = 0.0f;
        this.id = 0;
        this.name = "";
        this.date = "";
    }

    // Parameterized Constructor
    public User(String name, float balance, int id, String date) {
        this.name = name;
        this.balance = balance;
        this.id = id;
        this.date = date;
    }

    // Getters
    public String getName() {
        return name;
    }

    public float getBalance() {
        return balance;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public SimpleDateFormat getFormat() {
        return format;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

class Menu extends User{
    public String name;
    public float price;
    public int id;
    public String date;
    public SimpleDateFormat format;
    public static Menu[] Menus = new Menu[100];
    //constructor
    public Menu ()
    {
        this.name="";
        this.price=0.0f;
        this.id=0;
        this.date="";
        this.format=new SimpleDateFormat("yyyy-MM-dd");
        
    }
    
    // Getters
    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public SimpleDateFormat getFormat() {
        return format;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setFormat(SimpleDateFormat format) {
        this.format = format;
    }
}
