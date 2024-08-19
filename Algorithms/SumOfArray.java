package Algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfArray {
    static Scanner scanner = new Scanner(System.in);
    static List<Number> Numbes=new ArrayList<>();//declare array

    public static void main(String[] args) {
        while (true) {
            
            System.out.printf("Enter a list of number(0 to stop): ");
            String input = scanner.nextLine();

            if(input.equals("0"))
            {
                break;
            }

            String[] inputs = input.split("\\s+");//split input by space

            for (String number : inputs){

                try
                {
                    if (input.contains(".")) {
                        float floatValue=0;
                        floatValue=Float.parseFloat(input);
                        Numbes.add(floatValue);// push the flaot to the array

                        
                    }
                    else if (input.matches("\\d+")) {
                      
                        int intValue = Integer.parseInt(input);
                        Numbes.add(intValue); 
                    } 
                    else {
                        System.out.println("Invalid input. Please enter a number.");
                        
                    }
                
                }
                catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number.");
                }
            }
            
            float result=SumOfArray_Function();
            System.out.printf("The Sum result of the array is:%.2f",result);
        }  
    }  
    public static float SumOfArray_Function()
    {
        float sum=0;
        for(int i=0;i<Numbes.size();i++)
        {
        sum+=Numbes.get(i).floatValue();
        }
        return sum;
    }  
}

//void is not a return type variable
//void cannot convert to non return
//void cannot have return property
