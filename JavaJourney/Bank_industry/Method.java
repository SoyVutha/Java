package Bank_industry;

import java.util.Scanner;

public class Method {
    public static Scanner scan=new Scanner(System.in);
    
    public static void Create_Acc_function()
    {
        while(true)
        {
            Bank_information bank=new Bank_information();
            System.out.printf("\nEnter username(0 to stop):");
            String username=scan.nextLine();
            
            if(username.equals("0"))
            {
                break;
            }
            //check if the username is duplicated
            if(Addtional_function.is_duplicate_function(username))
            {
                System.out.println("Username already exists, please try another one.");
                continue;
            }
            bank.setName(username);

            //get valid balance
            while(true)
            {
                float balance=Addtional_function.get_valid_balance("Enter balance(o to stop):");
                if(balance==0)
                {
                    break;
                }
                bank.setBalance(balance);
                bank.setDate(Variable.current_date);
                System.out.println("Date : "+Variable.current_date);
                int unique=Addtional_function.get_valid_id();
                bank.setTransaction_id(unique);
                System.out.println("ID: "+bank.getTransaction_id());
                Bank_information.Banks[Variable.account_index++]=bank;
            }


        }        
    }

    public static void Deposite_function(){
        while(true)
        {
            Bank_information deposit=new Bank_information();
            System.out.printf("\nEnter username(0 to stop):");
            deposit.setName(scan.nextLine().trim());
            if(deposit.getName().equals("0"))
            {
                break;
            }
            Variable.is_deposite_user_found=0;
            for(int i=0;i<Variable.account_index;i++)
            {
                Bank_information bank= Bank_information.Banks[i];
                if(bank.getName().equals(deposit.getName()))
                {
                    Variable.is_deposite_user_found=1;
                    float depo_amount=Addtional_function.get_valid_balance("Enter amount to Deposite( 0 to stop): ");
                    if(depo_amount==0)
                    {
                        break;
                    }
                    bank.setBalance(bank.getBalance()+depo_amount);
                    deposit.setDate(Variable.current_date);
                    System.out.println("Date: "+deposit.getDate());

                    int unique=Addtional_function.get_valid_id();
                    deposit.setTransaction_id(unique);
                    System.out.println("Withdraw ID: "+deposit.getTransaction_id());




                    Bank_information.Banks[Variable.deposite_index++]=deposit;
                }
            }
            if(Variable.is_deposite_user_found==0)
            {
                System.out.println("Account not found");
            }
        }

    }

    public static void Withdraw_function()
    {
        while(true)
        {
            Bank_information withdraw=new Bank_information();
            System.out.printf("\nEnter username(0 to stop):");
            withdraw.setName(scan.nextLine().trim());
            if(withdraw.getName().equals("0"))
            {
                break;
            }

            Variable.is_withdraw_user_found=0;
            for(int i=0;i<Variable.account_index;i++)
            {
                Bank_information bank= Bank_information.Banks[i];
                if(bank.getName().equals(withdraw.getName()))
                {
                    Variable.is_withdraw_user_found=1;
                    float withdraw_amount=Addtional_function.get_valid_balance("Enter amount to withdraw(0 to stop): ");
                    if(withdraw_amount==0)
                    {
                        break;
                    }

                    if(withdraw_amount>bank.getBalance())
                    {
                        System.out.println("Insufficient balance, please enter a valid one, your current balance is: "+bank.getBalance());
                        continue;
                    }
                    else{
                        bank.setBalance(bank.getBalance()-withdraw_amount);
                        bank.setDate(Variable.current_date);
                        System.out.println("Withdrawal successful, your current balance is: "+bank.getBalance());
                        int withdraw_id=Addtional_function.get_valid_id();
                        bank.setTransaction_id(withdraw_id);
                        System.out.println("Withdraw Date: " + bank.getDate()+"ID: "+bank.getTransaction_id());

                        Bank_information.Banks[Variable.withdraw_index++]=withdraw;
                    }
                }
            }
            if(Variable.is_withdraw_user_found==0)
            {
                System.out.println("Account not found");
            }
        }
    }

    public static void Tranfer_function()
    {
        while(true)
        {
            Bank_information transfer=new Bank_information();
            System.out.printf("\nEnter username(0 to stop):");
            transfer.setName(scan.nextLine().trim());
            if(transfer.getName().equals("0"))
            {
                break;
            }

            Variable.is_tranfer_user_found=0;
            for(int i=0;i<Variable.account_index;i++)
            {
                Bank_information bank=Bank_information.Banks[i];
                if(bank.getName().equals(transfer.getName()))
                {
                    Variable.is_tranfer_user_found=1;

                    float tranfer_amount=Addtional_function.get_valid_balance("Enter amount to tranfer( 0 to stop): ");
                    if(tranfer_amount==0)
                    {
                        break;
                    }

                    if(tranfer_amount>bank.getBalance())
                    {
                         System.out.println("Insufficient balance, please enter a valid one, your current balance is: "+bank.getBalance());
                         continue;
                    }
                    else
                    {
                        bank.setBalance(bank.getBalance()-tranfer_amount);
                        System.out.println("Withdrawal successful, your current balance is: " + bank.getBalance());
                        bank.setDate(Variable.current_date);
                        bank.setTransaction_id(Addtional_function.get_valid_id());
                        System.out.println("Tranfer Date: " + bank.getDate());

                        Bank_information.Banks[Variable.transfer_index++]=transfer;
                    }
                }
            }
            if(Variable.is_tranfer_user_found==0)
            {
                System.out.println("Account not found");
            }
        }

    }

    public static void Check_balance_function(){
        System.out.printf("\n%-15s%-15s\n","Name","Balance");
        for(int i=0;i<Variable.account_index;i++)
        {
            Bank_information bank=Bank_information.Banks[i];
            System.out.printf("\n%-15s%-15.2f\n",bank.getName(),bank.getBalance());
        }

    }

    public static void View_transaction_history_function(){
        while (true) {
            Bank_information View_transaction=new Bank_information();
            System.out.printf("\nEnter username(0 to stop): ");
            View_transaction.setName(scan.nextLine().trim());
            if(View_transaction.getName().equals("0"))
            {
                break;
            }

            Variable.is_view_transac_found=0;
            for(int i=0;i<Variable.account_index;i++)
            {
                Bank_information bank=Bank_information.Banks[i];
                if(bank.getName().equals(View_transaction.getName()))
                {
                    Variable.is_view_transac_found=1;
                    System.out.print("-----------Transaction-------------------------------------------------\n");
                    System.out.printf("%-15s%-15s%-15s\n", "Amount", "Date", "Transaction ID");
                    for(int j=0;j<Variable.deposite_index;j++)
                    {
                        Bank_information deposit=Bank_information.Banks[i];
                        System.out.printf("%-15.2f%-15s%-15s\n",deposit.getBalance(),deposit.getDate(),deposit.getTransaction_id());
                    }
                    System.out.print("-----------Withdraw-------------------------------------------------\n");
                    System.out.printf("%-15s%-15s%-15s\n", "Amount", "Date", "Withdraw ID");
                    for(int k=0;k<Variable.withdraw_index;k++)
                    {
                        Bank_information withdraw=Bank_information.Banks[i];
                        System.out.printf("%-15.2f%-15s%-15s\n",withdraw.getBalance(),withdraw.getDate(),withdraw.getTransaction_id());
                    }
                    System.out.print("-----------transfer-------------------------------------------------\n");
                    System.out.printf("%-15s%-15s%-15s\n", "Amount", "Date", "Transfer ID");
                    for(int z=0;z<Variable.transfer_index;z++)
                    {
                        Bank_information transfer=Bank_information.Banks[i];
                      System.out.printf("%-15.2f%-15s%-15s\n",transfer.getBalance(),transfer.getDate(),transfer.getTransaction_id());   
                    }
                    Bank_information.Banks[Variable.view_transac_index++]=View_transaction;
                }
            }
            if(Variable.is_view_transac_found==0)
            {
                System.out.printf("User not found\n");
            }
        }

    }

    public static void Update_account_info_function(){
        while (true) {
            Bank_information update_acc=new Bank_information();
            System.out.print("Enter username(0 to stop): ");
            update_acc.setName(scan.nextLine().trim());
            if(update_acc.getName().equals("0"))
            {
                break;
            }
            Variable.is_update_acc_found=0;
            for(int i=0;i<Variable.account_index;i++)
            {
                Bank_information bank=Bank_information.Banks[i];
                if(bank.getName().equals(update_acc.getName()))
                {
                    Variable.is_update_acc_found=1;
                    System.out.printf("Enter new username:");
                    String username=scan.nextLine();
                    if(Addtional_function.is_duplicate_function(username))
                    {
                        System.out.printf("Username already exists,please enter another one. ");
                        continue;

                    }
                    bank.setName(username);
                }
                Bank_information.Banks[Variable.is_update_acc_index++]=update_acc;
            }
            if(Variable.is_update_acc_found==0)
            {
                System.out.printf("user not found\n");
            }
        }
    }

    public static void  Close_acc_function(){
        while (true) {
            Bank_information close_acc=new Bank_information();
            System.out.print("Enter username(0 to stop): ");
            close_acc.setName(scan.nextLine());
            if(close_acc.getName().equals("0"))
            {
                break;
            }
            Variable.is_close_acc_found=0;
            for(int i=0;i<Variable.account_index;i++)
            {
                Bank_information bank=Bank_information.Banks[i];
                if(bank.getName().equals(close_acc.getName()))
                {
                    Variable.is_close_acc_found=1;
                    for(int j=i;j<Variable.account_index-1;j++)
                    {
                        Bank_information.Banks[j]=Bank_information.Banks[j+1];
                    }
                    Variable.account_index--;
                    System.out.printf("Account close successfully\n");
                }
            }
            if(Variable.is_close_acc_found==0)
            {
                System.out.printf("User not found\n");
            }

            }
 
    }
}


