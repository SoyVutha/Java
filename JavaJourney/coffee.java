import java.util.Scanner;

public class coffee{

    //classes
    public class customer_Information
    {
        public String username;
        public int phonenumber;
    }



    public static void main(String[] args) {
    //GLOBAL VARIABLE
   
    int choice;
    coffee outer=new coffee();
    customer_Information customer=outer.new customer_Information(); 
    Scanner scanner=new Scanner(System.in);
    while(true)
    {
        System.out.printf("\nMENU:\n1.Coffee\n2.Tea\n3.Soda\n");
        choice=scanner.nextInt();
        switch(choice)
        {
            case 1:
            System.out.printf("Enter customer name:");
            customer.username=scanner.nextLine();
            System.out.printf("%s cofee price is 3$\n",customer.username);
            break;
            case 2:
            System.out.printf("Enter customer name");
            customer.username=scanner.nextLine();
            System.out.printf("%s Tea price is 1$\n",customer.username);
            break;
            case 3:
            System.out.printf("Enter customer name");
            customer.username=scanner.nextLine();
            System.out.printf("%s Soda price is 2$\n",customer.username);
            break;
            default:
            System.out.printf("Invalid choice, please enter another one");
            break;
        }
    System.out.printf("Do you want to continue(1.yes/2.no)");
    int ContinueOrNo=scanner.nextInt();
    if(ContinueOrNo==2)
    {
        break;
    }

    }
    scanner.close();
        
    }
}