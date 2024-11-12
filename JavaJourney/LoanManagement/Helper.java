package LoanManagement;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Helper extends Method {
    public static Scanner scan=new Scanner(System.in);
    public static ArrayList<String> usernames=new ArrayList<>();
    public static Random rand=new Random();
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
                System.out.printf("Income is valid.");
                return income;
            }
            else{
                System.out.println("Income cannot be negative.");
            }
        }
        catch(Exception e)
        {
            System.out.println("Income invalid, Income cannot be none numeric");
        }
       }
    }

    public static int isIdvalid(){
        int id=0;
        do{id=rand.nextInt(Integer.MAX_VALUE-1)+1;}
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
}
