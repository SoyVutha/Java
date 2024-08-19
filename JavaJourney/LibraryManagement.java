
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;


import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.PhoneNumberFormat;
import com.google.i18n.phonenumbers.PhoneNumber;


public class LibraryManagement {
    //GLOBAL VARIABLE
    static int choice;
    static int Add_book_Index=0;
    static int isSearchFound=0;
    static int choiceV2;
    static int User_Index=0;

    static book_information[] books =new book_information[100]; 
    static User_information[] users =new User_information[100];
    static Random rand=new Random();
    static Scanner scan=new Scanner(System.in);


    //CLASS
    public static class book_information
    {
        private String book_tittle;
        private int book_id;
        private float book_price;
        private int book_quantity;

        //DEFAULT VALUE
        public book_information()
        {
            book_tittle = "";
            book_id = 0;
            book_price = 0.0f;
            book_quantity = 0;
        }
        //GETTER AND SETTER
        public String getBookTitle() {
            return book_tittle;
        }
    
        public void setBookTitle(String book_tittle) {
            this.book_tittle = book_tittle;
        }
    
        // GETTER AND SETTER FOR bookId
        public int getBookId() {
            return book_id;
        }
    
        public void setBookId(int book_id) {
            this.book_id = book_id;
        }
    
        // GETTER AND SETTER FOR bookPrice
        public float getBookPrice() {
            return book_price;
        }
    
        public void setBookPrice(float book_price) {
            this.book_price = book_price;
        }
    
        // GETTER AND SETTER FOR bookQuantity
        public int getBookQuantity() {
            return book_quantity;
        }
    
        public void setBookQuantity(int book_quantity) {
            this.book_quantity = book_quantity;
        }

    }

    //CLASS
   public static class User_information {
    private int userId;
    private String name;
    private String phoneNumber;

    // DEFAULT CONSTRUCTOR
    public User_information() {
        userId = 0;
        name = "";
        phoneNumber = " ";
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}





    public static void main(String[] args) 
    {
        while(true)
        {
            System.out.printf("\nMENU:\n" +
                  "1. Add Book\n" +
                  "2. View Book\n" +
                  "3. Search Book\n" +
                  "4. User Management\n" +
                  "5. Book Reservation\n" +
                  "6. Return Book\n" +
                  "7. View User Book Reservation\n");
            System.out.printf("Enter your choice:");
            choice=scan.nextInt();
            scan.nextLine();
            switch(choice)
            {
                case 1:
                addBook();
                break;
                case 2:
                viewBook();
                break;
                case 3:
                searchBook();
                break;
                case 4:
                bookReservation();
                break;
                case 5:
                returnbook();
                break;
                case 6:
                userManagement();
                break;
                case 7:
                viewUserBookReservation();
                break;
                default:
                System.out.printf("Invalid choice\n");
            }

        }

    }
    public static void addBook()
    {
        if(Add_book_Index>=books.length)
        {
            System.out.printf("Our library is full\n");
            return;
        }
        while (true) 
        {
            book_information book=new book_information();
          System.out.printf("\nEnter boook Tittle(0 to stop): ");
          book.setBookTitle(scan.nextLine());


          if(book.getBookTitle().isEmpty()){
            System.out.printf("Book title cannot be empty\n");
            continue;//continue for the user to input again
          }

          if(book.getBookTitle().equals("0"))
          {
            break;
          }

          if (isDuplicateBookTitle(book.getBookTitle())) 
          {
            System.out.printf("A book with the title '%s' already exists. Please enter a different title.\n", book.getBookTitle());
            continue; // Prompt user to enter a different title
            }

          
          book.setBookId(isIdunique());
          System.out.printf("Book : %s , ID : %d\n",book.getBookTitle(),book.getBookId());


          book.setBookPrice(getValidInput("Enter book price:"));
       
          book.setBookQuantity(getValidQuantity("Enter book %s quantity: "));

          books[Add_book_Index++]=book;
        }
    }

    //Additional function
    private static boolean isDuplicateBookTitle(String tittle) //This function is only working if the case the true
    {
        for(int i=0;i<Add_book_Index;i++)
        {
            if(books[i].getBookTitle().equals(tittle))
            {
                return true;
            }
        }
        return false;
    
    }
    //Additional function
    public static float getValidInput(String prompt)
    {
        float float_value=0.00f;
        boolean isValid=false;
        while(!isValid)
        {
            System.out.printf("%s",prompt);
            String input=scan.nextLine().trim();
            if(input.isEmpty())
            {
                System.out.println("Please enter a valid value");//make sure the user input is not empty
                continue;
            }
            try
            {
                float_value=Float.parseFloat(input);
                isValid=true;
            }
            catch(NumberFormatException e)
            {
                System.out.println("Invalid input, please enter a valid number");
                scan.nextLine();//in the catch usally use the nextline
                
            }
        }
        return float_value;
    }
    //Additional function
    public static int getValidQuantity(String prompt)
    {
        int quanity=0;
        boolean isvalid=false;
        while(!isvalid)
        {
            System.out.printf("%s",prompt);
            String input=scan.nextLine().trim();
            if(input.isEmpty())
            {
                System.out.println("Please enter a valid value");//make sure the user input is not empty
                continue;
            }
            try
            {
                quanity=Integer.parseInt(input); 
                isvalid=true;
            }
            catch(NumberFormatException e) //The exception need to be specific, so the easiest approach is to ask Ai
            {
                System.out.println("Invalid input, please enter a valid number");
                scan.nextLine();
            }

        }
        return quanity;
    }

    //Additional function
    private static int isIdunique()
    {
        int id;
        do{
             id=rand.nextInt(Integer.MAX_VALUE-1)+1;
        }
        while(isIdExist(id));
        return id;
    }

    private static boolean isIdExist(int id){
        for(int i=0;i<Add_book_Index;i++)
        {
            if(books[i].getBookId()==id)
            {
                return true;
            }
        }
        return false;
        
    }

    public static void viewBook()
    {
        System.out.printf("\n%-15s,%-15s,%-15s,%-15s\n","Title","ID","Price","Quantity");
        for(int i=0;i<Add_book_Index;i++)
        {
            book_information book=books[i];
            System.out.printf("\n%-15s,%-15d,%-15.2f,%-15d",book.getBookTitle(),book.getBookId(),book.getBookPrice(),book.getBookQuantity());
        }
    }

    public static void searchBook()
    {
        while(true)
        {   
            System.out.printf("\nEnter Book Id or Tittle to search(0 to search):");
            String search=scan.nextLine();
            if(search.equals("0"))
            {
                break;
            }
            
            if(search.isEmpty())
            {
                System.out.println("Please enter a valid search term.\n");
            }
            isSearchFound=0;

            for(int i=0;i<Add_book_Index;i++)
            {
                book_information book=books[i];
                {
                    if(book.getBookId()==Integer.parseInt(search) || book.getBookTitle().equals(search))
                    {
                        isSearchFound=1;
                        System.out.printf("Book Found\tTitle: %s\tID: %d\tPrice: %.2f\tQuantity: %d\n",book.getBookTitle(),book.getBookId(),book.getBookPrice(),book.getBookQuantity());
                        break;
                    }
                }
            }
            if(isSearchFound==0)
            {
                System.out.println("Book not found");
            }
        }
    }

    public static void userManagement()
    {
        while(true)
        {
            System.out.println("\nUser Management Menu\n");
            System.out.printf("1.Login User\n");
            System.out.printf("2.Logout User\n");
            System.out.printf("3.Exit\n");
            System.out.printf("Enter your choice: ");
            choiceV2=scan.nextInt();
            scan.nextLine();
            switch (choiceV2) {
                case 1:
                Login_Function();
                break;
                case 2:
                break;
                case 3:
                return;//Exit the user management function
                default:
                System.out.printf("Invalid choice. Please try again.");
            }
        }
    }

    public static void Login_Function()
    {
        String is_have_account;
        
        while (true) {
            User_information user=new User_information();

            System.out.println("\nDo You have an account (Y/N)(0 to stop): \n");
            is_have_account = scan.nextLine().trim();
            if(is_have_account.equals("0"))
            {
                break;
            }

            if(is_have_account.isEmpty())
            {
                System.out.println("Please enter Y or N");
                continue;
            }

            if(is_have_account.equalsIgnoreCase("N"))
            {
                System.out.printf("\nUser Register\n");
                System.out.printf("User name(0 to stop): ");
                user.setName(scan.nextLine().trim());
                if(user.getName().equals("0"))
                {
                    break;
                }

                user.setUserId(isUSerIdunique());
                System.out.printf("%s ID: %d\n",user.getName(),user.getUserId());

                
                user.setPhoneNumber(getvalid_Phone());

            }
        users[User_Index++]=user;      
        }
    }

    public static int isUSerIdunique()
    {
        int userId = 0;
        do{
            userId=rand.nextInt(Integer.MAX_VALUE-1)+1;
        }
        while (userIdExists(userId));
        return userId;
    }
    public static boolean userIdExists(int userId)
    {
        for(int i=0;i<User_Index;i++)
        {
            if (users[i].getUserId()==userId) {
                return true;   
            }
        }
        return false;
    }

    public static String getvalid_Phone()
    {
        String PhoneNumber;
        PhoneNumberUtil phoneNumberUtil = PhoneNumberUtil.getInstance();
        while(true)
        {
            System.out.printf("Phone Number: ");
            PhoneNumber=scan.nextLine().trim();
            try{
                PhoneNumber number=phoneNumberUtil.parse(PhoneNumber,"US");
                if(phoneNumberUtil.isValidNumber(number))
                {
                    phoneNumber =phoneNumberUtil.format(number,PhoneNumberFormat.E164);
                    break;
                }
                else{
                     System.out.println("Invalid Phone Number");
                }

            }catch(Exception e)
            {
                System.out.println("Invalid Phone Number: " + e.getMessage());
            }
        }
        return PhoneNumber;
    }


    public static void bookReservation()
    {

    }

    public static void returnbook()
    {

    }


    public static void viewUserBookReservation()
    {

    }

}

//global variable
//clas
//default value
//getter setter
//functio