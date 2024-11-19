package LoanManagement.Classes;

public class Customer {
   private String name;
   private int Id;
   private String email;
   private double income;
   private double loan;
   private double annualInterestRate;
   private int loanTermMonths;

   public Customer(String name, int Id,String email,double income){
    this.Id=Id; this.name=name; this.email=email; this.income=income;
   }
   public Customer(){
      this.name=""; this.Id=0; this.email=""; this.income=0;this.loan=0;this.annualInterestRate = 0.0;this.loanTermMonths = 0;
   }

   //getter
   public String getName(){return this.name;}
   public int getID(){return this.Id;}
   public String getEmail(){return this.email;}
   public double getIncome(){return this.income;}
   public double getLoan(){return this.loan;}
   public double getInterestrate(){return this.annualInterestRate;}
   public int getLoanTerm(){return this.loanTermMonths;}

   //setter
   public void setName(String name){this.name=name;}
   public void setId(int Id){this.Id=Id;}
   public void setEmail(String email){this.email=email;}
   public void setIncome(double income){this.income=income;}
   public void setLoan(double loan){this.loan=loan;}
   public void setAnual(double annualInterestRate){this.annualInterestRate=annualInterestRate;}
   public void setLoanTerm(int loanTermMonths){this.loanTermMonths=loanTermMonths;}

}
