import java.util.*;
import javax.print.attribute.standard.MediaSize.NA;
import javax.swing.*;   //1.
import java.util.jar.Attributes.Name;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class FinanceTracker 
{
    
    //GLOBAL VARIABLE
    static int choice;
    static int add_income_index=0;
    static int expanse_index=0;
    static int is_add_expanse_user_found=0;
    public static final int Max_Finace_Lenght=100;
    static int choiceV2;
    static String choiceV3;
    static String choiceV4;
    
    static SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd"); //The format must be like this
    static Random rand=new Random();
    static Scanner scan=new Scanner(System.in);


    static Personal_Finace[] finaces=new Personal_Finace[Max_Finace_Lenght];
    static Personal_Expanse[] Exapanses=new Personal_Expanse[Max_Finace_Lenght];

     //CLASS
    public static class Personal_Finace 
    {
        private String name;
        private String description;
        private float amount;
        private int Id;
        private String date;
        //DEFAULT VALUE
        public Personal_Finace()
        {
            this.name="";
            this.description="";
            this.amount=0.0f;
            this.Id=0;
            this.date="";
        }

        //GETTER AND SETTER
          public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public float getAmount() {
            return amount;
        }

        public void setAmount(  float amount) {
            this.amount = amount;
        }

        public int getId() {
            return Id;
        }

        public void setId(int Id) {
            this.Id = Id;
        }

        public String getdate () {
            return date;
        }

        public void setDate(String date ) {
            this.date = date;
        }




    }   
  
    public static class Personal_Expanse {
        private String name;
        private String description ;
        private float amount ;
        private int id ;
        private String date ;
        public Personal_Expanse()
        {
            this.name = "";
            this.description = "";
            this.amount = 0.0f ;
            this.id = 0 ;
            this.date = "";

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }


        public float getAmount() {
            return amount;
        }

        public void setAmount(float amount) {
            this.amount = amount;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }
    }    

    public static void main(String[] args) {
        while(true)
        {
            System.out.printf("\nMENU:\n");
            System.out.printf("1. Add Income\n");
            System.out.printf("2. Add Expense\n");
            System.out.printf("3. View Transaction\n");
            System.out.printf("4. View Budget\n");
            System.out.printf("5. Filter Transcation\n");
            System.out.printf("6. Exit\n");
            System.out.print("Enter your choice: ");
            choice=scan.nextInt();
            scan.nextLine();
            switch (choice) 
            {
                case 1:
                addIncome_function();
                break;
                case 2:
                addExpense_function();
                break;
                case 3:
                viewTransaction_function();
                break;
                case 4:
                viewBudget_function();
                break;
                case 5:
                filterTranscation_function();
                break;
                case 6:
                System.out.println("Exiting...");
                System.exit(0);
                break;
                default:
                System.out.println("Invalid choice");         
             }
        
    }

}
   
public static void addIncome_function() 
{
    while(true)
    {
        Personal_Finace finance=new Personal_Finace();   
        System.out.printf("Enter your name(0 to stop): ");
        finance.setName(scan.nextLine().trim());
        //check for break
        if(finance.getName().equals("0"))
        {
            break;
        }
        //check if the name is duplicate
        if(checkDuplicate(finance.getName()))
        {
            System.out.printf("This name is already exist, please enter another one\n");
            continue;
        }
        //check if the amount is valid
        finance.setAmount(getValidIncome("Enter " + finance.getName() + " transaction income: "));
        //check if the id is inque
        finance.setId(isIdunique());
        //check if the date is valid
        finance.setDate(getValidDate("Enter " + finance.getName() + " transaction date(YYYY-MM-DD): "));


        finaces[add_income_index++]=finance;

    }
}

public static boolean checkDuplicate(String name )
{

    for(int i=0;i<add_income_index;i++)
    {
        Personal_Finace finace=finaces[i];
        if(finace.getName().equals(name))
        {
            return true;
        }
    }
    return false;    
}

public static float getValidIncome(String prompt)
{
    float float_value=0.00f;
    boolean is_income_valid=false;
    while(!is_income_valid)
    {
        System.out.printf(prompt);
        String input=scan.nextLine().trim();

        if(input.isEmpty()){
            System.out.printf("Please enter a valid income\n");
            continue;
        }

        try{
            float_value=Float.parseFloat(input);
            if(float_value<=0)
            {
                System.out.printf("Please enter a valid income\n");
                continue;
            }
            is_income_valid=true;
        }
        catch(NumberFormatException e)
        {
            System.out.printf("Please enter a valid income\n");
        }
    }
    return float_value;
}

public static int isIdunique()
{
    int id=0;
    do{
        id=rand.nextInt(Integer.MAX_VALUE-1)+1;
    }
    while(idExist(id));
    return id;
}
public static boolean idExist(int id)
{
    for(int i=0;i<add_income_index;i++){
        Personal_Finace finace=finaces[i];
        if(finace.getId()==id)
        {
            return true;
        }
    }
    return false;
}

public static String  getValidDate(String prompt)
{
    boolean is_date_valid=false;
    String input="";
    while(!is_date_valid)
    {
        System.out.printf("%s",prompt);
        input=scan.nextLine();
    
        try{
            dateFormat.setLenient(false);
           dateFormat.parse(input);
           is_date_valid=true;
        }
        catch(ParseException e)
        {
            System.out.printf("Please enter a valid date\n");
        }
    }
    return input;
    
}


public static void addExpense_function() {
    while (true)
    {
        Personal_Expanse Expanse =new Personal_Expanse();
         System.out.printf("Enter username to add expanse(0 to stop): ");
         Expanse.setName(scan.nextLine().trim()); 
    
     if(Expanse.getName().equals("0"))
     {
        break;
     }

     if(checkduplicate(Expanse.getName()))
     {
        System.out.printf("Username already exists\n");
     }
     is_add_expanse_user_found=0;
     for(int i=0;i<add_income_index;i++)
     {
        Personal_Finace finace=finaces[i];
        if(Expanse.getName().equalsIgnoreCase(finace.getName()))
        {
            is_add_expanse_user_found=1;
            Expanse.setAmount(getValidIncome("Enter "+Expanse.getName()+" Expanse: "));

            Expanse.setDate(getValidDate("Enter "+Expanse.getName()+" Date(YYYY-MM_DD): "));

            Expanse.setId(is_IdUnique());
            System.out.printf("Enter expanse title: ");
            Expanse.setDescription(scan.nextLine().trim());
            if(Expanse.getDescription().isEmpty())
            {
                System.out.printf("Title cannot be empty\n");
            }
        }
     }
     if(is_add_expanse_user_found==0)
     {
        System.out.printf("User not found,user name must have an income to add expanse\n");
     }

     Exapanses[expanse_index++]=Expanse;
        
    }
}

public static boolean checkduplicate(String name) {

    for (int i = 0; i < expanse_index; i++) {
        Personal_Expanse Expanse = Exapanses[i];
        if (Expanse.getName().equals(name)) {
            return true;
        }
    }
    return false;
}

public static int is_IdUnique()
{
    int id = 0;
    do {
        id = rand.nextInt(Integer.MAX_VALUE - 1) + 1;
    } while (IdExist(id));
    return id;

}

public static boolean IdExist(int id)
{
    for (int i = 0; i < expanse_index; i++) {
        Personal_Expanse Expanse = Exapanses[i];
        if (Expanse.getId() == id) {
            return true;
        }
    }
    return false;
}




public static void viewTransaction_function() 
{
    System.out.printf("\n%-15s%-15s%-15s%-15s%-15s\n","Name","Id","Expanse","Title","date");
    for(int i=0;i<expanse_index;i++)
    {
        Personal_Expanse Expanse = Exapanses[i];
        System.out.printf("%-15s%-15d%-15.2f%-15s%-15s\n",Expanse.getName(),Expanse.getId(),Expanse.getAmount(),Expanse.getDescription(),Expanse.getDate());

    }

}

public static void viewBudget_function() {
    System.out.printf("\n%-15s%-15s%-15s%-15s\n","Name","Id","Amount","Date");
    for(int i=0;i<add_income_index;i++)
    {
        Personal_Finace finace = finaces[i];
        System.out.printf("%-15s%-15d%-15.2f%-15s",finace.getName(),finace.getId(),finace.getAmount(),finace.getdate());
    }
}



public static void filterTranscation_function() {
    // combine all income  into a single list
    System.out.println("\nFiltering and displaying incomes:\n");
    List<Personal_Finace> filteredFinances = new ArrayList<>();
    for(int i=0;i<add_income_index;i++)
    {
        filteredFinances.add(finaces[i]);
    }

    //sort the income
    filteredFinances.sort(Comparator.comparingDouble(Personal_Finace::getAmount));
    System.out.printf("\n%-15s%-15s%-15s%-15s\n", "Name", "Id", "Amount", "Date");
    for(Personal_Finace finace : filteredFinances)
    {
         System.out.printf("%-15s%-15d%-15.2f%-15s\n",finace.getName(),finace.getId(),finace.getAmount(),finace.getdate());
    }

    // combine all expanse into a single list
    System.out.println("\nFiltering and displaying expenses:");
    List<Personal_Expanse> allExpanses=new ArrayList<>();
    for(int i=0;i<expanse_index;i++)
    {
        allExpanses.add(Exapanses[i]);
    }
    allExpanses.sort(Comparator.comparingDouble(Personal_Expanse::getAmount));
    System.out.printf("\n%-15s%-15s%-15s%-15s%-15s\n", "Name", "Id", "Amount", "Description", "Date");
    for (Personal_Expanse expanse : allExpanses) {
        System.out.printf("%-15s%-15d%-15.2f%-15s%-15s\n",
                expanse.getName(), expanse.getId(), expanse.getAmount(),
                expanse.getDescription(), expanse.getDate());
    }

}
}




// global variable
// clas
// default value
// getter setter
// function
