package Bank_industry;

import java.util.Scanner;

public class Bank {
    
     
    
    //library
    public static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.printf("\nMENU:\n");
            System.out.printf("1.Create account\n");
            System.out.printf("2.Deposit money\n");
            System.out.printf("3.Withdraw money\n");
            System.out.printf("4.Tranfer money\n");
            System.out.printf("5.Check balance\n");
            System.out.printf("6.View transaction history\n");
            System.out.printf("7.Update account information\n");
            System.out.printf("8.Close acount\n");
            System.out.printf("9.User\n");
            System.out.printf("10.Exit\n");
            System.out.printf("Enter your choice: ");
            Variable.choice=scan.nextInt();
            scan.nextLine();
            switch (Variable.choice) {
                case 1:
                Method.Create_Acc_function();
                break;
                case 2:
                Method.Deposite_function();
                break;
                case 3:
                Method.Withdraw_function();
                break;
                case 4:
                Method.Tranfer_function();
                break;
                case 5:
                Method.Check_balance_function();
                break;
                case 6:
                Method.View_transaction_history_function();
                break;
                case 7:
                Method.Update_account_info_function();
                break;
                case 8:
                Method.Close_acc_function();
                break;
                case 9:
                Method.User_function();
                case 10:
                System.exit(0);

                default:
                System.out.println("Invalid choice");
            }

            
        }

        
    }
    
}

// global varible
// class
// constructor
// Encapulation
// method

           