package Food;

//public access modifier is not allowed for variables declared inside methods or constructors in Java
//only one public class per file
import java.text.SimpleDateFormat;

public class User extends Menu {
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

class Menu {
    public String name_menu_input;
    public float price_menu_price;
    public int id;
    public String date_menu_input;
    public SimpleDateFormat format;
    public static float total;
    public static int quantity;
    public static Menu[] Menus = new Menu[100];
    //constructor
    public Menu ()
    {
        this.name_menu_input="";
        this.price_menu_price=0.0f;
        this.id=0;
        this.date_menu_input="";
        this.total=0.0f;
        this.quantity=0;
        this.format=new SimpleDateFormat("yyyy-MM-dd");
        
    }
    
    // Getters
    public String getMenuName() {
        return name_menu_input;
    }
    
    public static float getTotal() {
        return total;
    }

    public float getMenuPrice() {
        return price_menu_price;
    }

    public int getId() {
        return id;
    }

    public String getMenuDate() {
        return date_menu_input;
    }

    public SimpleDateFormat getFormat() {
        return format;
    }

    public int getQuantity() {
        return quantity;
    }
    // Setters
    public void setMenuName(String name_menu_input) {
        this.name_menu_input = name_menu_input;
    }

    public void setMenuPrice(float price_menu_price) {
        this.price_menu_price = price_menu_price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMenuDate(String date_menu_input) {
        this.date_menu_input = date_menu_input;
    }

    public void setFormat(SimpleDateFormat format) {
        this.format = format;
    }
    
    public static void setTotal(float total) {
        Menu.total = total; 
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
   
}
