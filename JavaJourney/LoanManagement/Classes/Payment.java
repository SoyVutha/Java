package LoanManagement.Classes;
import java.util.*;
public class Payment {
    private String CustomerName;
    private double amount;
    private Date date;


    public Payment(String name,double amount){
        this.CustomerName=name;
        this.amount=amount;
        this.date=new Date();
    }

    public String getName(){
        return CustomerName;
    }
    public double getAmount()
    {
        return amount;
    }
    public Date getdate(){
        return date;
    }
    
    

}
