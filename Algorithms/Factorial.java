package Algorithms;

import java.util.Scanner;

public class Factorial
{
    
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) 
    {
        while (true) 
        {
            System.out.printf("Please enter a number for calculating factorial( 0 to stop):");
            int number = scanner.nextInt();
            scanner.nextLine();
            if (number == 0) 
            {
                
                    System.out.println("Goodbye!");
                    break;
                               
            }
            int result=factorial(number);
            System.out.printf("The result of %d is:%d\n",number,result);
        }
    }
    public static int factorial(int n)
    {
        
        if (n == 0) {
            return 1; // Base case: factorial of 0 is 1
        }
        return n * factorial(n - 1); // Recursive case
    }
      
}
