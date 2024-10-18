package ObjectClass2;
import java.util.*;
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    public Account(){
        this.id=0;  this.balance=0;  this.annualInterestRate=0;this.dateCreated=new Date();
    }
    public Account(int id,double balance,double annualInterestRate){
        this.id=id;  this.balance=balance;  this.annualInterestRate=annualInterestRate; this.dateCreated=new Date();
    }
    //setter
    public void setId(int id){
        this.id=id;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate=annualInterestRate;
    }
    //getter
    public int getID(){
        return this.id;
    }
    public double getBalance(){
        return this.balance;
    }
    public double getAnnualInterestRate(){
        return this.annualInterestRate;
    }
    public Date getDate(){
        return this.dateCreated;
    }
    
    public double getMonthlyInterestRate(){
        
    }


    
}


// A method named getMonthlyInterestRate() that returns the monthly interest rate.
// A method named getMonthlyInterest() that returns the monthly interest.
// A method named withdraw that withdraws a specified amount from the account.
// A method named deposit that deposits a specified amount to the account.