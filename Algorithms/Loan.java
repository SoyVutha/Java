package Algorithms;

import java.util.Scanner;

public class Loan {
    public static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.printf("Enter Loan principle: ");
        double principle = scan.nextDouble();
        scan.nextLine();

        System.out.printf("Enter Anual interest reate: ");
        double interest = scan.nextDouble();
        scan.nextLine();

        System.out.printf("Enter Loan Term: ");
        int term = scan.nextInt();
        scan.nextLine();

        double monthly_interest_rate=(interest/(100*12));
        int number_of_payment=term*12;
        double monthly_payment=principle*monthly_interest_rate*Math.pow(1+monthly_interest_rate,number_of_payment);
        double fully_monthy_payment=monthly_payment/(Math.pow(1+monthly_interest_rate,number_of_payment)-1);

        System.out.println("Your monthlyu payment is:"+fully_monthy_payment);

    }

    
}
