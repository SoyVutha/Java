package Food;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
public class Additional_func 
{

    public static Random rand=new Random();
    public static Scanner scan=new Scanner(System.in);
    public static List<MenuItem> menuItems = new ArrayList<>(); 


    public static boolean is_username_duplicate(String name)
    {
        for(int i=0;i<Variable.create_acc_index;i++)
        {
            User Single_User=User.Users[i];
            if(Single_User.getName().equals(name))
            {
                return true;
            }

        }
        return false;
    }

    public static int unique_id()
    {
        int id=0;
        do{
              id = 1000 + rand.nextInt(9000);
              return id;
        }while(id_existed(id));
    }
    public static boolean id_existed(int id)
    {
        for(int i=0;i<Variable.create_acc_index;i++)
        {
            User Single_User=User.Users[i];
            if(Single_User.getId()==id)
            {
                return true;
            }

        }
        return false;
    }

    public static float get_valid_amount(String prompt)
    {
        while (true) {
            System.out.printf(prompt);
            try
            {
                String input=scan.nextLine().trim();
                float amount=Float.parseFloat(input);
                if(amount>0)
                {
                   return amount;
                }
                else{
                    System.out.printf("Amount cannot be lower or equal to zero, please enter another one: ");
                    
                }

            }
            catch(NumberFormatException e)
            {
                System.out.println("Unvalid amount, please enter another proper amount: ");
                continue;
            }
            
        }
    }

    public static void view_menu_function() {
        if (menuItems.isEmpty()) {
            System.out.println("No menu items available");
        } else {
            
            System.out.printf("%-15s %-30s %-10s\n", "Name", "Description", "Price");
            System.out.println("--------------------------------------------------------------"); 

            // Print menu items
            for (MenuItem parementer : menuItems) {//this is like for each
                System.out.printf("%-15s %-30s %-10.2f\n", 
                        parementer.getName(), parementer.getDescription(), parementer.getPrice());
            }
        }
    }

    static{
        menuItems.add(new MenuItem("Burger", "A delicious beef burger", 5.99f));
        menuItems.add(new MenuItem("Pizza", "Cheese pizza with tomato sauce", 8.99f));
        menuItems.add(new MenuItem("Salad", "Fresh garden salad", 4.99f));
    }
        //class
        public static class MenuItem {
        public String name;
        public String description;
        public float price;
        
        public MenuItem(String name, String description, float price) {
            this.name = name;
            this.description = description;
            this.price = price;
        }
    
        public String getName() {
            return name;
        }
    
        public String getDescription() {
            return description;
        }
    
        public float getPrice() {
            return price;
        }
        }
    public static MenuItem getITem(String name){
        for(MenuItem parem:menuItems)
        {
            if(parem.getName().equals(name))
            {
                return parem;
            }
        }
        return null;
    }
    public static int getQuantity(String promt)
    {
        while(true)
        {
            System.out.print(promt);
            try{
                String input=scan.nextLine();
                int quantity=Integer.parseInt(input);
                if(quantity>0)
                {
                    return quantity;
                }
                else{
                    System.out.println("Please enter a positive number");
                }
            }
            catch(NumberFormatException e)
            {
                System.out.println("cannot accept String as Quantiy, please enter valid quantity: ");
            }
        }
    }
}


