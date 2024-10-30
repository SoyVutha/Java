package LoanManagement.Classes;

public class Customer {
   private String name;
   private int Id;
   private String email;
   private double income;

   public Customer(String name, int Id,String email,double income){
    this.Id=Id; this.name=name; this.email=email; this.income=income;
   }

   //getter
   public String getName(){return this.name;}
   public int getID(){return this.Id;}
   public String getEmail(){return this.email;}
   public double getIncome(){return this.income;}

   //setter
   public void setName(String name){this.name=name;}
   public void setId(int Id){this.Id=Id;}
   public void setEmail(String email){this.email=email;}
   public void setIncome(double income){this.income=income;}

}
