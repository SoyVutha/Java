package Bank_industry;

import java.util.Random;
import java.util.Scanner;

public class Addtional_function {

     public static Scanner scan=new Scanner(System.in);
     public static Random rand=new Random();

    public static boolean is_duplicate_function(String name)
    {
        for(int i=0;i<Variable.account_index;i++)
        {
            Bank_information bank=Bank_information.Banks[i];
            if(bank.getName().equals(name))
            {
                return true;
            }
        }
        return false;
    }

    public static float get_valid_balance(String prompt)
    {
        while (true) {
            System.out.printf(prompt);
            try {
                String input=scan.nextLine();
                float balance = Float.parseFloat(input);

                return balance;
            }
            catch(NumberFormatException e)
            {
                System.out.printf("Invalid, please enter a valiad one: \n");
            }
        }
        
    }

    public static int get_valid_id()
    {
        int id=0;
        do{
            id = 1000 + rand.nextInt(9000);
        }while(Balance_id_exist(id));
        return id;
    }
    public static boolean Balance_id_exist(int id)
    {
        for(int i=0;i<Variable.account_index;i++)
        {
            Bank_information bank=Bank_information.Banks[i];
            if(bank.getTransaction_id()==id)
            {
                return true;
            }
        }
        return false;
    }

    }
    

