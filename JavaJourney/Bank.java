import java.text.SimpleDateFormat;
import java.util.*;// This is more dynamic compared to until. rand .....

public class Bank {
    //GLOBAL VARIABLE
    static int choice;
    static int Max_Finace_Lenght=100;
    static int account_index=0;
    static int choiceV2;


    static Scanner scan = new Scanner(System.in);
    static Random rand = new Random();
    static SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dddd");


    //Object
    static bank_information[] Banks = new bank_information[Max_Finace_Lenght];

    //Class
    public static class bank_information
    {
        private int account_number;
        private String account_name;
        private String account_type;
        private float balance;
        private String phone_number;
        private String date;
        private List<String> transaction_History;
        private int transaction_id;

        //Constructor
        public bank_information()
        {
            this.account_number=0;
            this.account_name="";
            this.account_type="";
            this.balance=0.0f;
            this.phone_number="";
            this.date="";
            this.transaction_History=new ArrayList<>();
            this.transaction_id=0;
        }
        //Encapsulation
            public int getAccount_number() {
                return account_number;
            }
            public void setAccount_number(int account_number) {
                this.account_number = account_number;
            }

            public String getAccount_name() {
                return account_name;
            }
            public void setAccount_name(String account_name) {
                this.account_name = account_name;
            }

            public String getAccount_type() {
                return account_type;
            }
            public void setAccount_type(String account_type) {
                this.account_type = account_type;
            }

            public float getBalance() {
                return balance;
            }
            public void setBalance(float balance) {
                this.balance = balance;
            }

            public String getPhone_number() {
                return phone_number;
            }
            public void setPhone_number(String phone_number) {
                this.phone_number = phone_number;
            }

            public String getDate() {
                return date;
            }
            public void setDate(String date) {
                this.date = date;
            }

            public List<String> getTransaction_History() {
                return transaction_History;
            }
            public void setTransaction_History(List<String> transaction_History) {
                this.transaction_History = transaction_History;
            }

            public int gettransaction_id()
            {
                return transaction_id;
            }
            public void settransaction_id(int transaction_id)
            {
                this.transaction_id=transaction_id;
            }

    }
    public static void main(String[] args) {
        while(true)
        {
            

            System.out.println("\nMENU:\n");
            System.out.printf("1.Create account\n");
            System.out.println("2.Deposit money\n");
            System.out.println("3.Withdraw money\n");
            System.out.println("4.Tranfer money\n");
            System.out.println("5.Check balance\n");
            System.out.println("6.View transaction history\n");
            System.out.println("7.Update account information\n");
            System.out.println("8.Close acount\n");
            System.out.println("9.Exit\n");
            System.out.printf("Enter your choice:");
            choice=scan.nextInt();
            scan.nextLine();
            switch(choice)
            {
                case 1:
                create_account_function();
                break;
                case 2:
                deposit_money_function();
                break;
                case 3:
                withdraw_money_function();
                break;
                case 4:
                tranfer_money_function();
                break;
                case 5:
                check_balance_function();
                break;
                case 6:
                view_transaction_function();
                break;
                case 7:
                update_account_function();
                break;
                case 8:
                close_account_function();
                break;
                case 9:
                System.out.printf("Exiting....\n");
                System.exit(0);
                default:
                System.out.printf("Invalid choice. Please choose a valid option.\n");
            } 
        }
        
    }
    //FUNCTIONS
    public static void create_account_function()//name, //accoutn type //created acount date //generate account id
    //1.naming duplication //2. valid money input //3.valid date //4.unique id 
    {
        while(true)
        {
            bank_information Bank = new bank_information();
            System.out.printf("Enter your name(0 to stop):");
            Bank.setAccount_name(scan.nextLine().trim());
            if(Bank.getAccount_name().equals("0"))
            {
                break;
            }

            //Check if the name if duplicated
            if(is_duplicate_function(Bank.getAccount_name()))
            {
                System.out.printf("This name is taken, please enter another one\n");
                continue;
            }

            //generate number
            Bank.setAccount_number(isIdUnique());

            //Account type
            System.out.printf("Enter your account type(1 for saving, 2 for checking):");
            choiceV2=scan.nextInt();
            scan.nextLine();
            if(choiceV2==1)
            {
                Bank.setAccount_type("Save");
            }
             else if(choiceV2==2)
            {
                Bank.setAccount_type("Check");
            }
            else {
                System.out.printf("Invalid choice. Please choose a valid option.\n");
                break;
            }
            
            //account create date 
            String currentDate=date.format(new Date());
            Bank.setDate(currentDate);
            System.out.println("Account successfully created on: "+ Bank.getDate());

            Banks[account_index++]=Bank;
            
        }
    }

    public static boolean is_duplicate_function(String name)
    {
        for(int i=0;i<account_index;i++)
        {
            bank_information Bank=Banks[i];
            if(Bank.getAccount_name().equals(name))
            {
                return true;
            }
        }
            return false;   
    }

    public static int isIdUnique()
    {
        int id=0;
        do{
            id=rand.nextInt(Integer.MAX_VALUE-1)+1;
        }while(idExist(id));
        return id;
    }

    public static boolean idExist(int id)
    {
        for( int i=0;i<account_index;i++)
        {
            bank_information Bank=Banks[i];
            if(Bank.getAccount_number()==id){
                return true;
            }
        }
        return false;
    }

    public static void deposit_money_function()
    //allow a single user to to input multiple deposit
    {

    }

    public static void withdraw_money_function()
    {

    }

    public static void tranfer_money_function()
    {

    }

    public static void check_balance_function()
    {

    }

    public static void view_transaction_function()
    {

    }

    public static void update_account_function()
    {

    }

    public static void close_account_function()
    {

    }
}

//global varible 
//class
//constructor
//Encapulation
//method
