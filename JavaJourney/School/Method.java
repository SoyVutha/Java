package School;
import java.util.*;
public class Method {
    public static Scanner scan=new Scanner(System.in);
    public static void studentmanagement(){
        while(true){
            System.out.println("\n\n1. Add Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Student's Attandance");
            System.out.println("4. Display Student");
            System.out.println("5. Update Student");
            System.out.println("6. Exit");
            System.out.printf("Enter your choice : ");
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
                Method2.displaystudent();
                break;
                case 5:
                Method2.updatestudent();
                break;
                case 6:
                System.out.println("Exiting");
                System.exit(0);
                default:
                System.out.println("Unvalid choice");


            }

        }
    }
    
    public static void teachermanagement(){
        while (true) {
            System.out.println("\n\n1. Add Teacher");
            System.out.println("2. Delete Teacher");
            System.out.println("3. Assign Class/Subject");
            System.out.println("4. Display Teacher Details");
            System.out.println("5. Manage Leaves");
            System.out.println("6. Exit");
            System.out.printf("Enter your choice: ");
            int choice = scan.nextInt();
            switch (choice) 
            {
                case 1:
                Method2.addteacher();
                break;
                case 2:
                Method2.deleteteacher();
                break;
                case 3:
                Method2.assignclass();
                break;
                case 4:
                Method2.displayteacher();
                break;
                case 5:
                Method2.leavemanagement();
                break;
                case 6:
                System.out.println("Exiting");
                System.exit(0);
                default:
                System.out.println("Unvalid choice");
            }
        }
    }

    public static void classmanagement(){
        while (true) {
            System.out.printf("\n\n1.Add Class\n");
            System.out.printf("2.Delete Class\n");
            System.out.printf("3.Assign Student\n");
            System.out.printf("4.Display Class Details\n");
            System.out.printf("5.Exit\n");
            System.out.printf("Enter your choice: ");
            int choice = scan.nextInt();scan.nextLine();
            switch(choice){
                case 1:
                Method2.addClass();
                break;
                case 2:
                Method2.deleteclass();
                break;
                case 3:
                Method2.AssignStudent();
                break;
                case 4: 
                Method2.ClassDetail();
                break;
                case 5:
                System.out.println("Exiting");
                System.exit(0);
                default:
                System.out.println("Invalid Choice");
                
            }            
        }
    }

    public static void attendancemanagement(){}

    public static void examandgrademanagement(){}

    public static void generalutilities(){}
}
