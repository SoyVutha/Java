package LoanManagement;
import java.util.*;

import LoanManagement.Classes.Customer;
public class Method {
    public static Scanner scan=new Scanner(System.in);
    public static Customer customer=new Customer();

    public static void applyForLoan(){
        while(true)
        {
            System.out.printf("Enter username( 0 to stop) : ");
            customer.setName(scan.nextLine());
            if(customer.getName().equals("0")){
                break;
            }
            if(Helper.isDuplicate(customer.getName())){
                System.out.println("Username already exists");
            }
            
            customer.setIncome(Helper.getIncome("Enter user's income : "));
            customer.setId(Helper.isIdvalid());

        }
    }

    public static void viewLoanDetail(){

    }

    public static void makePayment(){

    }

    public static void paymentHistory(){

    }

    public static void monthlyPayment(){

    }

    public static void acitveLoan(){
        
    }
}
