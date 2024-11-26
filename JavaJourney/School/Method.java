package School;
import java.util.*;
public class Method {
    public static Scanner scan=new Scanner(System.in);
    public static void studentmanagement(){
        while(true){
            System.out.println("1. Add Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Student's Attandance");
            System.out.println("4. Display Student");
            System.out.println("5. Update Student");
            System.out.println("6. Exit");
            System.out.println("Enter your choice");
            int choice=scan.nextInt();
            switch(choice){
                case 1:
                Method2.Addstudent();
                break;
                case 2:
                Method2.Deletestudent();
                break;
                case 3:
                Method2.studentattandance();
                break;
                case 4:
                Method2.updatestudent();
                break;
                case 5:
                Method2.displaystudent();
                break;
                case 6:
                System.out.println("Exiting");
                System.exit(0);
                default:
                System.out.println("Unvalid choice");


            }

        }
    }
    
    public static void teachermanagement(){}

    public static void classmanagement(){}

    public static void attendancemanagement(){}

    public static void examandgrademanagement(){}

    public static void generalutilities(){}
}
