package Algorithms;
import java.util.*;
public class Test2 {
    public static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.printf("Enter the number of students: ");
        int n=scan.nextInt();
        int[] array=new int[n];
        System.out.print("Enter "+n+" score: ");

        int bestscore=0;
        for(int i=0;i<n;i++)
        {
            array[i]=scan.nextInt();
            if(array[i]>bestscore)
            {
                bestscore=array[i];
            }
        }
        Display(array,bestscore,n);

        System.out.printf("Enter total number of score");
        int nummber_of_scores=scan.nextInt();
        int[] array2=new int[nummber_of_scores];
        System.out.print("Enter "+nummber_of_scores+" score: ");
        for(int i=0;i<nummber_of_scores;i++)
        {
            array2[i]=scan.nextInt();
            if(array2[i]<=0)
            {
                System.out.println("Invalid input");
            }
        }
        Calculate(nummber_of_scores,array2);

        System.out.printf("Enter numbers lenght: ");
        int nummber_of_scores2=scan.nextInt();
        int[] array3=new int[nummber_of_scores2];
        System.out.print("Enter "+nummber_of_scores2+" of scores: ");
        for(int i=0;i<nummber_of_scores2;i++)
        {
            array3[i]=scan.nextInt();
            if(array3[i]<0)
            {
                System.out.println("Invalid input");
            }
        }
        Determine(nummber_of_scores2,array3);

    }
    //Methods
    public static void Display(int[] array,int bestscore,int number_of_student){
        char grade;
        for(int i=0;i<number_of_student;i++)
        {
            if(array[i]>bestscore-5)
            {
                grade='A';
            }
            else if(array[i]>bestscore-10)
            {
                grade='B';
            }
            else if(array[i]>bestscore-15)
            {
                grade='C';
            }
            else if(array[i]>bestscore-20)
            {
                grade='D';
            }
            else
            {
                grade='F';
            }
                System.out.println("Stundet "+(i)+" score is "+array[i]+" and grade is "+grade);
            
            
        }
    }

    public static void  Calculate(int number_of_scores,int[] array2)
    {
        int above=0;int below=0;
        int sum=0;
        double average;
        ArrayList<Integer> abovearray=new ArrayList<>();
        ArrayList<Integer> belowarray=new ArrayList<>();
        for(int i=0;i<number_of_scores;i++)
        {
            sum += array2[i];
        }
        average = sum / number_of_scores;
        for(int i=0;i<number_of_scores;i++)
        {
            if(array2[i]>average)   
            {
                above++;
                abovearray.add(array2[i]);

            }
            else
            {
                below++;
                belowarray.add(array2[i]);
            }
        }

            System.out.println("Total above average scores: "+above+": "+abovearray );
            System.out.println("Total below average scores: " + below+": "+belowarray);   
    }

    public static void Determine(int number_of_scores,int[] array)
    {
        int temp=0;
        int largest=0;int smallest=0;
        for(int i=0;i<number_of_scores;i++)
        {
            if(array[i]>largest)
            {
                largest=array[i];
            }
            else
            {
                smallest=array[i];
            }
        }
        System.out.println("The largest value is: "+largest);
        System.out.println("The smallest value is: "+smallest);
    
    }

}