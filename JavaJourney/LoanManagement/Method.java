package LoanManagement;
import java.util.*;

import LoanManagement.Classes.Customer;
import LoanManagement.Classes.Payment;
public class Method {
    public static Scanner scan=new Scanner(System.in);
    public static Customer customer=new Customer();
    public static int Customer_index=0;

    public static List<Payment> paymentsHistoryList=new ArrayList<>(); // To make sure only Payment objects are
                                                                         // allowed in this list.

    public static int is_make_found=0;
    public static boolean is_monthly_found=false;


    public static void applyForLoan(){

        while(true)
        {
            System.out.printf("Enter username( 0 to stop ) : ");
            String name=scan.nextLine();
            if(name.equals("0")){
                break;
            }
            if(Helper.isDuplicate(name)){
                System.out.println("Username already exists");
                continue;
            }
            customer.setName(name);
            customer.setIncome(Helper.getIncome("Enter user's income : "));
            customer.setId(Helper.isIdvalid());
            customer.setLoan(Helper.getLoan("Enter intention loan amount : "));
            Customer_index++;
        }
    }
    

    public static void viewLoanDetail(){
        System.out.printf("%-15s%-15s%-15s%-15s\n","Customer","ID","Income","Loan");
        for(int i=0;i<Customer_index;i++)
        {
            System.out.printf("%-15s%-15d%-15.2f%-15.2f\n",customer.getName(),customer.getID(),customer.getIncome(),customer.getLoan());
        }
    }

    public static void makePayment(){
        while(true)
        {
            System.out.printf("Enter user name (0 to stop) : ");
            String username=scan.nextLine();
            if(username.equals("0")){break;}
            for(int i=0;i<Customer_index;i++)
            {
                if(username.equals(customer.getName())){
                    is_make_found=1;
                    double temp=Helper.getTemp("User found, please enter intention amount to pay : ");
                    customer.setLoan(customer.getLoan()-temp);
                    System.out.println("Payment successful, Loan amount : "+customer.getLoan());

                    Payment payment=new Payment(customer.getName(), temp);
                    paymentsHistoryList.add(payment);

                }
            }
            if(is_make_found==0){
                System.out.println("User not found");
            }
        }
    }

    public static void paymentHistory()
    {
        System.out.printf("%-15s%-15s%-15s\n", "Customer", "Amount", "Date");
        for( Payment payments: paymentsHistoryList)
        {
            System.out.printf("%-15s%-15.2f%-15s\n",payments.getName(),payments.getAmount(),payments.getdate().toString());
        }
    }

    public static void monthlyPayment(){
        while(true){
            System.out.printf("Enter user name (0 to stop) : ");
            String username=scan.nextLine();
            if(username.equals("0")){break;}
            for(int i=0;i<Customer_index;i++)
            {
                if(username.equals(customer.getName()))
                {
                    is_monthly_found=true;
                    double annualInterestRate=Helper.getTemp("Enter annual interest rate : ");
                    int loanTerm=Helper.getLoanTerm("Enter loan repayment term : ");  
                    Helper.monthlyPaymentList(annualInterestRate,loanTerm,customer.getLoan());  
                }   
            }
            if(is_monthly_found=false){
                System.out.println("User not found");
            }
        }

    }

    public static void acitveLoan(){
        System.out.printf("%-15s%-15s%-15s\n", "Customer", "Amount", "ID");
        boolean hasactive=false;
        for(int i=0;i<Customer_index;i++)
        {
            if(customer.getLoan()>0)
            {
                hasactive=true;
                System.out.printf("%-15s%-15.2f%-15s\n",customer.getName(),customer.getLoan(),customer.getID());
            }
        }
        if(hasactive==false){
            System.out.println("No active loan");
        }
        
        
        
        
        
    }
}
