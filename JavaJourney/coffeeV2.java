import java.util.Scanner;

public class coffeeV2 {
//GLOBAL VARIABLE
static int customer_Index=0;
static int choice;

static Scanner scan=new Scanner(System.in);
static coffeeV2 outer=new coffeeV2();
static customer_Information customer=outer.new customer_Information();

//CLASSSES
public class customer_Information
{
    private String username;
    private int quantity;
    private float total;

    //GETTER AND SETTER METHOD
    public String getusername()
    {
        return username;
    }
    public void setusername(String username)
    {
        this.username=username;
    }

    public int  getquantity()
    {
        return quantity;
    }
    public void setquantity(int quantity)
    {
        this.quantity=quantity;
    }

    public  float gettotal()
    {
        return total;
    }
    public void settotal(float total)
    {
        this.total=total;
    }
}

    public static void main(String[] args) {
        while(true)
        {
            System.out.printf("\nMenu:\n1.Coffee\n2.Tea\n3.Milk Tea\n4.Lemonnade\n");
            System.out.printf("Enter Your choice:");
            choice=scan.nextInt();
            scan.nextLine();
            switch(choice)
            {
                case 1:
                BuyCoffee();
                break;
                case 2:
                BuyTea();
                break;
                case 3:
                BuyMilktea();
                break;
                case 4:
                BuyLemonnade();
                break;
                default:
                System.out.printf("Invalid choice");
                break;
            }

        }
        
    }
    public static void BuyCoffee()
    {
        System.out.printf("Enter username: ");
        customer.username=scan.nextLine();
        System.out.printf("Enter %s quantity: ",customer.username);
        customer.quantity=scan.nextInt();
        scan.nextLine();
        float price=2f;
        customer.total=customer.quantity*price;
        System.out.printf("%s total: %f",customer.username,customer.total);
    }

    public static void BuyTea()
    {
        System.out.printf("Enter username: ");
        customer.username=scan.nextLine();
        System.out.printf("Enter %s quantity: ",customer.username);
        customer.quantity=scan.nextInt();
        scan.nextLine();
        float price=1.5f;
        customer.total=customer.quantity*price;
        System.out.printf("%s Total: %f",customer.username,customer.total);
    }

    public static void BuyMilktea()
    {
        System.out.printf("Enter username: ");
        customer.username=scan.nextLine();
        System.out.printf("Enter %s quantity: ",customer.username);
        customer.quantity=scan.nextInt();
        scan.nextLine();
        float price=3.50f;
        customer.total=customer.quantity*price;
        System.out.printf("%s Total: %f",customer.username,customer.total);
    }

    public static void BuyLemonnade()
    {
        System.out.printf("Enter username: ");
        customer.username=scan.nextLine();
        System.out.printf("Enter %s quantity: ",customer.username);
        customer.quantity=scan.nextInt();
        scan.nextLine();
        float price=2.5f;
        customer.total=customer.quantity*price;
        System.out.printf("%s Total: %f",customer.username,customer.total);
    }

}
