

import java.util.*;
public class Main {
    public static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        while(true){
            System.out.println("1. Student Management");
            System.out.println("2. Teacher Management");
            System.out.println("3. Class Management"); 
            System.out.println("4. Attendance Management");
            System.out.println("5. Exam and Grade Mangement");
            System.out.println("6. General Utilities");
            System.out.println("7. Exit");   
            System.out.printf("Enter your choice : ");
            int choice =scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1:
                Method.studentmanagement();
                break;
                case 2:
                Method.teachermanagement();
                break;
                case 3:
                Method.classmanagement();
                break;
                case 4: 
                Method.attendancemanagement();
                break;
                case 5:
                Method.examandgrademanagement();
                break;
                case 6:
                Method.generalutilities();
                break;
                case 7:
                System.out.println("Exiting...");
                System.exit(0);
                default:
                System.out.println("Invalid choice");
                

            }         
        }
    }   
}
