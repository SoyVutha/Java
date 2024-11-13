package LoanManagement;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Helper extends Method {
    public static Scanner scan=new Scanner(System.in);
    public static Random rand=new Random();

    public static ArrayList<String> usernames=new ArrayList<>();
    public static ArrayList<Integer> id=new ArrayList<>();


    public static boolean isDuplicate(String username){
        if(usernames.contains(username))
        {
            return true;
        }
        else
        {
            usernames.add(username);
            return false;
        }
    }

    public static double getIncome(String prompt){
       while(true){
        try{
            System.out.printf(prompt);
            double income=scan.nextDouble();
            scan.nextLine();
            if(income>=0)
            {
                System.out.println("Income is valid.");
                return income;
            }
            else{
                System.out.println("Income cannot be negative.");
            }
        }
        catch(Exception e)
        {
            System.out.println("Income invalid, Income cannot be none numeric");
            scan.nextLine();
            
        }
       }
    }

    public static int isIdvalid(){
        int id=0;
        do{id=rand.nextInt(Integer.MAX_VALUE-1)+1;
            System.out.println("customer ID : "+id);
        }
        while(isIdduplicate(id));
        return id;
    }
    public static boolean isIdduplicate(int userId){
        boolean duplicate=false;
        if(id.contains(userId)){
            duplicate=true;
        }        
        else{
            id.add(userId);
        }
        return duplicate;

    }

    public static double getLoan(String promt){
        while(true)
        {
            try{
                System.out.printf(promt);
                double Loan=scan.nextDouble();
                scan.nextLine();
                if(Loan>=0)
                {
                    System.out.println("Valid loan amount.\n");
                    return Loan;
                }
                else{
                    System.out.println("Loan cannot be negative.");
                }
            }
            catch(Exception e){
                System.out.println("Unvalid input, please enter a valid one.");
                scan.nextLine();
            }   
        }
    }

    public static double getTemp(String prompt){
        while(true){
            try{
                System.out.printf(prompt);
                double amount=scan.nextDouble();
                scan.nextLine();
                boolean isvalid=false;
                if(amount>=0){
                    isvalid=true;
                    if(amount>customer.getIncome()){
                        System.out.println("You cannot afford this loan, Your amount is higger than the loan");
                    }
                    return amount;
                }
                else{
                    System.out.println("Amount cannot be negative.");
                }
            }
            catch(Exception e){
                System.out.println("Amount cannot be none numeric");
                scan.nextLine();
            }
        }
    }


}
