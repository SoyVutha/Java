package LoanManagement;
import java.util.*;

import Leetcode.Symmetric;
public class Main {
    public static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        while(true)
        {
            System.out.printf("\n1. Apply for a new loan \n");
            System.out.printf("2. View loan detail \n");
            System.out.printf("3. Make a payment \n");
            System.out.printf("4. View payment history \n");
            System.out.printf("5. Calculate monthy payment \n");
            System.out.printf("6. View all active loan \n");
            System.out.printf("7. Exit \n");
            System.out.printf("Enter your choice: ");
            int choice=scan.nextInt();
            switch(choice)
            {
                case 1:
                Method.applyForLoan();
                break;
                case 2:
                Method.viewLoanDetail();
                break;
                case 3:
                Method.makePayment();
                break;
                case 4:
                Method.paymentHistory();
                break;
                case 5:
                Method.monthlyPayment();
                break;
                case 6:
                Method.acitveLoan();
                break;
                case 7:
                System.exit(0);
                default:
                System.out.println("Invalid choice");
            }

        }

        
    }
}
