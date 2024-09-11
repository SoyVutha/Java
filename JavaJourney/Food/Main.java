package Food;

import java.util.Scanner;

public class Main {
    public static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        while(true)
        {
            System.out.printf("\nMENU:\n");
            System.out.println("1. Create Account");
            System.out.println("2. Log In");
            System.out.println("3. Deposit Funds");
            System.out.println("4. View Menu");
            System.out.println("5. Add to Cart");
            System.out.println("6. View Cart");
            System.out.println("7. Delete Cart");
            System.out.println("8. Place Order");
            System.out.println("9. View Orders");
            System.out.println("10. Log Out");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");
            Variable.choice=scan.nextInt();
            scan.nextLine();
            switch (Variable.choice) {
                    case 1:
                    Method.Create_acc_func();
                    break;
                    case 2:
                    Method.Log_in_func();
                    break;
                    case 3:
                    Method.Deposit_func();
                    break;
                    case 4:
                    Method.View_menu_func();
                    break;
                    case 5:
                    Method.Add_to_cart_func();
                    break;
                    case 6:
                    Method.View_cart_func();
                    break;
                    case 7:
                    Method.Delete_cart_func();
                    break;
                    case 8:
                    Method.Place_order_func();
                    break;
                    case 9:
                    Method.View_orders_func();
                    break;
                    case 10:
                    Method.log_out_func();
                    break;
                    case 11:
                    System.exit(0);
                    break;
                    default:
                    System.out.println("Invalid choice");
            }

        }
    }

    
}
