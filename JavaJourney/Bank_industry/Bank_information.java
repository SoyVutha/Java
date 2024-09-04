package Bank_industry;

import java.util.Date;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Bank_information
{
    public String name;
    public float balance;
    public String account_number;
    public int transaction_id;
    public String  date;
    public SimpleDateFormat date_format=new SimpleDateFormat("yyyy-MM-dd");

    public static Bank_information[] Banks = new Bank_information[100];

    public Bank_information(){
        this.name="";
        this.balance=0.0f;
        this.account_number="";
        this.transaction_id=0;  
        this.date=""; 
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for balance
    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    // Getter and Setter for account_number
    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    // Getter and Setter for transaction_id
    public int getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(int transaction_id) {
        this.transaction_id = transaction_id;
    }

    public String getDate(){
        return date;
    }

    public void setDate(String date){
       this.date=date;

    
    }

}
