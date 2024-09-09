package Bank_industry;

import java.util.Scanner;

public class Method {
    public static Scanner scan = new Scanner(System.in);

    public static void Create_Acc_function() {
        while (true) {
            Bank_information bank = new Bank_information();
            System.out.printf("\nEnter username (0 to stop): ");
            String username = scan.nextLine().trim();

            if (username.equals("0")) {
                break;
            }
            // Check if the username is duplicated
            if (Addtional_function.is_duplicate_function(username)) {
                System.out.println("Username already exists, please try another one.");
                continue;
            }
            bank.setName(username);
            Bank_information.Banks[Variable.account_index++] = bank;

            // Get valid balance
            while (true) {
                float balance = Addtional_function.get_valid_balance("Enter balance (0 to stop): ");
                if (balance == 0) {
                    break;
                }
                if (balance < 0) {
                    System.out.println("Balance cannot be negative.\n");
                } else {
                    bank.setBalance(bank.getBalance()+balance);
                    bank.setDate(Variable.current_date);
                    System.out.println("Date: " + Variable.current_date);
                    int unique = Addtional_function.get_valid_id();
                    bank.setTransaction_id(unique);
                    System.out.println("ID: " + bank.getTransaction_id());
                }
            }
        }
    }

    public static void Deposit_function() {
        while (true) {
            System.out.printf("\nEnter username (0 to stop): ");
            String username = scan.nextLine().trim();

            if (username.equals("0")) {
                break;
            }

            Variable.is_deposite_user_found = 0;

            for (int i = 0; i < Variable.account_index; i++) {
                Bank_information bank = Bank_information.Banks[i];

                if (bank.getName().equals(username)) {
                    Variable.is_deposite_user_found = 1;

                    float depo_amount = Addtional_function.get_valid_balance("Enter amount to deposit (0 to stop): ");
                    if (depo_amount <= 0) {
                        System.out.println("Deposit amount must be greater than zero.");
                        continue; // Fixed this to continue asking for a valid amount
                    }

                    bank.setBalance(bank.getBalance() + depo_amount); // Update existing account balance
                    bank.setDate(Variable.current_date); // Update date for transaction

                    int deposit_id = Addtional_function.get_valid_id();
                    bank.setTransaction_id(deposit_id); // Set transaction ID
                    System.out.println("Deposit successful. New balance: " + bank.getBalance());
                    System.out.println("Deposit ID: " + bank.getTransaction_id());
                    break; // Exit the loop after successful deposit
                }
            }

            if (Variable.is_deposite_user_found == 0) {
                System.out.println("Account not found");
            }
        }
    }

    public static void Withdraw_function() {
        while (true) {
            System.out.printf("\nEnter username (0 to stop): ");
            String username = scan.nextLine().trim();

            if (username.equals("0")) {
                break;
            }

            Variable.is_withdraw_user_found = 0;

            for (int i = 0; i < Variable.account_index; i++) {
                Bank_information bank = Bank_information.Banks[i];

                if (bank.getName().equals(username)) {
                    Variable.is_withdraw_user_found = 1;

                    float withdraw_amount = Addtional_function.get_valid_balance("Enter amount to withdraw (0 to stop): ");
                    if (withdraw_amount <= 0) {
                        System.out.println("Withdrawal amount must be greater than zero.");
                        continue; 
                    }

                    if (withdraw_amount > bank.getBalance()) {
                        System.out.println("Insufficient balance, please enter a valid amount. Your current balance is: " + bank.getBalance());
                        continue; 
                    }

                    bank.setBalance(bank.getBalance() - withdraw_amount); 
                    bank.setDate(Variable.current_date); 

                    int withdraw_id = Addtional_function.get_valid_id();
                    bank.setTransaction_id(withdraw_id); 
                    System.out.println("Withdrawal successful. New balance: " + bank.getBalance());
                    System.out.println("Withdrawal ID: " + bank.getTransaction_id());
                    break; 
                }
            }

            if (Variable.is_withdraw_user_found == 0) {
                System.out.println("Account not found");
            }
        }
    }

    public static void Transfer_function() {
        while (true) {
            System.out.printf("\nEnter your username (0 to stop): ");
            String fromUsername = scan.nextLine().trim();

            if (fromUsername.equals("0")) {
                break;
            }

            System.out.printf("Enter recipient username: ");
            String toUsername = scan.nextLine().trim();

            if (toUsername.equals(fromUsername)) {
                System.out.println("Cannot transfer to the same account.");
                continue;
            }

            Variable.is_tranfer_user_found = 0;
            Bank_information fromAccount = null;
            Bank_information toAccount = null;

            // Find both accounts
            for (int i = 0; i < Variable.account_index; i++) {
                Bank_information bank = Bank_information.Banks[i];
                if (bank.getName().equals(fromUsername)) {
                    fromAccount = bank;
                    Variable.is_tranfer_user_found = 1;
                }
                if (bank.getName().equals(toUsername)) {
                    toAccount = bank;
                }
            }

            if (fromAccount != null && toAccount != null) {
                float transfer_amount = Addtional_function.get_valid_balance("Enter amount to transfer (0 to stop): ");
                if (transfer_amount <= 0) {
                    System.out.println("Transfer amount must be greater than zero.");
                    continue; 
                }

                if (transfer_amount > fromAccount.getBalance()) {
                    System.out.println("Insufficient balance for transfer. Your current balance is: " + fromAccount.getBalance());
                    continue; 
                }

                fromAccount.setBalance(fromAccount.getBalance() - transfer_amount);
                toAccount.setBalance(toAccount.getBalance() + transfer_amount); 
                fromAccount.setDate(Variable.current_date); 
                toAccount.setDate(Variable.current_date); 

                int transfer_id = Addtional_function.get_valid_id();
                fromAccount.setTransaction_id(transfer_id);
                System.out.println("Transfer successful. New balance for " + fromUsername + ": " + fromAccount.getBalance());
                System.out.println("Transfer ID: " + fromAccount.getTransaction_id());
                break; 
            } else {
                System.out.println("Account not found");
            }
        }
    }
    public static void View_transaction_history_function() {
        while (true) {
            System.out.printf("\nEnter username (0 to stop): ");
            String username = scan.nextLine().trim();

            if (username.equals("0")) {
                break;
            }

            Variable.is_view_transac_found = 0;

            for (int i = 0; i < Variable.account_index; i++) {
                Bank_information bank = Bank_information.Banks[i];
                if (bank.getName().equals(username)) {
                    Variable.is_view_transac_found = 1;

                    System.out.print("-----------Amount-------------------------------------------------\n");
                    System.out.printf("%-15s%-15s%-15s%-15s\n", "Name","Amount", "Date", "Transaction ID");
                    // Display transaction history
                    for (int j = 0; j < Variable.account_index; j++) {
                        Bank_information transaction = Bank_information.Banks[j];
                        System.out.printf("%-15s%-15.2f%-15s%-15s\n",transaction.getName(), transaction.getBalance(), transaction.getDate(), transaction.getTransaction_id());
                    }
                    Bank_information.Banks[Variable.view_transac_index++] = bank;
                    break; // Exit loop after displaying transaction history
                }
            }

            if (Variable.is_view_transac_found == 0) {
                System.out.println("User not found");
            }
        }
    }

    public static void Update_account_info_function() {
        while (true) {
            System.out.print("Enter username (0 to stop): ");
            String username = scan.nextLine().trim();

            if (username.equals("0")) {
                break;
            }

            Variable.is_update_acc_found = 0;

            for (int i = 0; i < Variable.account_index; i++) {
                Bank_information bank = Bank_information.Banks[i];
                if (bank.getName().equals(username)) {
                    Variable.is_update_acc_found = 1;

                    System.out.print("Enter new name: ");
                    String newName = scan.nextLine().trim();
                    bank.setName(newName);
                    bank.setDate(Variable.current_date);

                    System.out.println("Account updated successfully.");
                    break; // Exit loop after updating account info
                }
            }

            if (Variable.is_update_acc_found == 0) {
                System.out.println("User not found");
            }
        }
    }

    public static void Close_acc_function() {
        while (true) {
            System.out.printf("\nEnter username to close account (0 to stop): ");
            String username = scan.nextLine().trim();
            if (username.equals("0")) {
                break;
            }

            Variable.is_close_acc_found = 0;
            for (int i = 0; i < Variable.account_index; i++) {
                if (Bank_information.Banks[i].getName().equals(username)) {
                    // Found the account to be closed
                    for (int j = i; j < Variable.account_index - 1; j++) {
                        Bank_information.Banks[j] = Bank_information.Banks[j + 1];
                    }
                    Bank_information.Banks[Variable.account_index - 1] = null; // Clear the last element
                    Variable.account_index--; // Reduce the account index
                    System.out.println("Account closed successfully.");
                    Variable.is_close_acc_found = 1;
                    break;
                }
            }
            if (Variable.is_close_acc_found == 0) {
                System.out.println("Account not found.");
            }
        }
    }

}
