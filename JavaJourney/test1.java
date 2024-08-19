 
import java.util.Date;  
//print and scan
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
int age;
String name;
int id;
char sex;
String department;
char YON;
Date now=new Date();
System.out.println(now);

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Your Name:");
        name =scanner.nextLine();

        System.out.print("Enter your ID:");
        id=scanner.nextInt();

        scanner.nextLine();
        System.out.print("Enter your sex:");
        sex = scanner.nextLine().charAt(0);
        
        System.out.print("Enter your department:");
        department=scanner.nextLine();

        System.out.print("Enter Your age:");
        age=scanner.nextInt();
        ;
        scanner.nextLine();

        System.out.print("Y or N");
        YON=scanner.nextLine().charAt(0);
    scanner.close();
    System.out.println();

    }
}