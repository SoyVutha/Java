package Food;

import java.util.Scanner;

import javax.jws.soap.SOAPBinding.Use;

public class Method {// check for duplicate user, unique id, acc create date, valid date
    public static Scanner scan =new Scanner(System.in);


    public static void Create_acc_func()
    {
        while(true)
        {
            User Single_User=new User();
            System.out.print("\nEnter username(0 to stop):");
            String username=scan.nextLine().trim();
            if(username.equals("0"))
            {
                break;
            }
            //check if duplicated
            if(Additional_func.is_username_duplicate(username))
            {
                System.out.print("The username already existed\n");
                continue;
            }
            Single_User.setName(username);
            //uniue id
            int account_id=Additional_func.unique_id();
            Single_User.setId(account_id);
            //account creation date
            Single_User.setDate(Variable.CurrentDate);
            System.out.printf("Account created successfully\nUsername: "+Single_User.getName()+"/\t\tAccount Create date: "+Single_User.getDate()+"/\t\tAccount ID: "+Single_User.getId()+"\n");
            User.Users[Variable.create_acc_index++]=Single_User;
        }
    }

    public static void Log_in_func()
    {
        while (true) {
            System.out.printf("\nEnter username to log in(0 to stop):");
            String username = scan.nextLine().trim();
            if (username.equals("0")) {
                {
                    break;
                }
            }
            Variable.is_login_found=0;
            for (int i = 0; i < Variable.create_acc_index; i++) {
                User Single_User=User.Users[i];
                if(username!=null&&Single_User.getName().equals(username))
                {
                    Variable.is_login_found=1;
                    User Login_user=new User();
                    Login_user=Single_User;
                    System.out.print("Login Successfully\nLog in name:"+Login_user.getName()+"/\t\tAccount ID: "+"/\t\tAccount Create Date: "+Login_user.getDate());
                    User.Users[Variable.login_index++]=Login_user;
                    break;
                }
                if(username==null)
                {
                    System.out.println("Username cannot be empty");
                }
            }
            if(Variable.is_login_found==0)
            {
                System.out.println("Account Not found\n");
            }
            
        }

    } 
    
    public static void Deposit_func()
    {
        while (true) 
        {
            System.out.printf("Enter username to deposit(0 to stop):");
            String username = scan.nextLine().trim();
            if(username.equals("0"))
            {
                break;
            }
            Variable.is_deposit_found=0;
            for (int i = 0; i < Variable.create_acc_index; i++) {
                User Single_User=User.Users[i];
                User Login_user=User.Users[i];
                if(username!=null&&(Single_User.getName().equals(username)||Login_user.getName().equals(username)))
                {
                    Variable.is_deposit_found=1;
                    while (true) {
                        float depo_amount=Additional_func.get_valid_amount("Enter amount to Deposit(0 to stop): ");
                        if(depo_amount==0)
                        {
                            break;
                        }
                    }
                }
            }
            if(Variable.is_deposit_found==0)
            {
                System.out.printf("Account Not Found\n");
            }
        }

    }
    
    public static void View_menu_func()
    {
        Additional_func.view_menu_function();
    }
    
    public static void Add_to_cart_func()
    {
        while(true)
        {   
            User add_to_cart=new User();
            System.out.printf("Enter username to add to cart(0 to stop):");
            String username = scan.nextLine().trim();
            if(username.equals("0"))
            {
                break;
            }
            Variable.is_add_to_cart_found=0;
            for(int i=0;i<Variable.create_acc_index;i++)
            {
                User singUser=User.Users[i];
                if(username.equals(singUser.getName()))
                {
                    Variable.is_add_to_cart_found=1;
                    add_to_cart.setName(username);
                    while (true) {
                        System.out.printf("Please enter menu name(0 to stop): ");
                        String menu_name = scan.nextLine().trim();
                        if(menu_name.equals("0"))
                        {
                            break;
                        }
                        //check if the item is valid
                        Additional_func.MenuItem menuItems=Additional_func.getITem(menu_name);
                        if(menuItems!=null)
                        {
                            int quantity=Additional_func.getQuantity("Enter quantity:");
                            float price=menuItems.getPrice();
                            float total=price*quantity;

                            add_to_cart.setMenuName(menu_name);
                            add_to_cart.setMenuPrice(price);
                            add_to_cart.setTotal(total);
                            add_to_cart.setQuantity(quantity);
                            User.Users[Variable.add_to_cart_index++]=add_to_cart;
                        }
                        else{
                            System.out.printf("Menu item not found\n");
                        }
                    
                    }
                }                
            }
            if(Variable.is_add_to_cart_found==0)
            {
                System.out.printf("Account Not Found\n");
            }

            
        }
    }
    
    public static void View_cart_func()
    {

    }
    
    public static void Delete_cart_func()
    {

    }
    
    public static void Place_order_func()
    {

    }
    
    public static void View_orders_func()
    {

    } 
    
    public static void log_out_func()
    {

    }
    
    
}
