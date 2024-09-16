package Algorithms;
import java.util.Scanner;
public class Financial {
    public static Scanner scan=new Scanner(System.in);
    public static void main(String[] args)
     {
        System.out.printf("Enter your investment amount:");
        int invest = scan.nextInt();
        scan.nextLine();

        System.out.printf("Enter the interest rate:");
        double rate = scan.nextFloat();
        scan.nextLine();
        method(invest, rate);

        
    }
       
    public static void method(int invest, double rate) {
        double Future_Investment_value = 0;
        double interest_rate=(rate/12)/100;
            System.out.println("\nYear\tFuture Value");
            for(int j=1;j<=30;j++)
            {
                Future_Investment_value = invest*Math.pow((1 + interest_rate), (j* 12));
            
                System.out.printf(j+"\t%.3f\n",Future_Investment_value);
            }
            System.out.println();  
    }

}
