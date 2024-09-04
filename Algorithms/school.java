package Algorithms;

import java.util.Scanner;

public class school {
    public static Scanner scan=new Scanner(System.in);
    public static  double mile;
    public static double kilo;

    public static int number;

    public static int minute;
    public static void main(String[] args) {
        //mile to kilometer converter
        System.out.printf("Enter mile: ");
        mile = scan.nextDouble();
        scan.nextLine();

        kilo=mile*1.6;
        System.out.printf("%.0f is %.2f kilometers\n",mile,kilo);



        //Multiply the digits 
        System.out.printf("\nEnter a number between 0 to 1000: ");
        number = scan.nextInt();
        scan.nextLine();

        int answer=1;

            while (number>0) {
                
                int digit=number%10;//sperate each digit 
                answer=answer*digit;
                number/=10;//extract out the last digit
            }
            

            System.out.println("ANswer:"+answer);
            System.out.printf("The multification of all digit in %d is %d\n",number,answer);

        //Find the number of year
        System.out.printf("\nEnter the number of minutes: ");
        minute = scan.nextInt();
        scan.nextLine();
        
        int minute_in_year=60*24*365;
        int minute_in_day=60*24;

        int year =minute/minute_in_year;
        int remaining = minute%minute_in_year;
        int day = remaining/minute_in_day;
        System.out.printf("%d minutes is approximately %d and %d days \n",minute,year,day);

    }  
}
