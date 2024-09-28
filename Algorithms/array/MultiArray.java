package Algorithms.array;

import java.util.*;

public class MultiArray {
    public static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Exercise 1-----------------------------------------------");
        int[][] array=
        {
            {2,4,3,4,5,8,8},
            {7,3,4,3,3,4,4},
            {3,3,4,3,3,2,2},
            {9,3,4,7,3,4,1},
            {3,5,4,3,6,3,8},
            {3,4,4,6,3,4,4},
            {3,7,4,8,3,8,4},
            {6,3,5,9,2,7,9},
        };
        System.out.printf("%-15s%-5s%-5s%-5s%-5s%-5s%-5s%-5s\n"," ","Su","M","T","W","Th","F","Sa");
        for(int i=0;i<array.length;i++)
        {
            System.out.printf("%-15s"," Employee "+ i);
            for(int j=0;j<array[i].length;j++)
            {
                System.out.printf("%-5d",array[i][j]);
            }
            System.out.println();
            
            
        }
        //array.lenght=8
       calculatetotal(array);

       System.out.println("Exercise 2-----------------------------------------------------");
    //    int[][] m1=new int[3][3];
    //    int[][] m2=new int[3][3];
    //    System.out.printf("Enter list 1: ");
    //    for(int i=0;i<m1.length;i++)
    //    {
    //      for(int j=0;j<m1[i].length;j++)
    //      {
    //         m1[i][j]=scan.nextInt();
          
    //      }
    //    }

    //    System.out.printf("Enter list 2:");
    //    for(int i=0;i<m2.length;i++)
    //    {
    //     for(int j=0;j<m2[i].length;j++)
    //     {
    //         m2[i][j]=scan.nextInt();
            
            
    //     }
    //    }

    //    compare(m1, m2);
       System.out.println("Exercise 3-----------------------------------------------------");
       int[][][] array3={
        {
            
                {1000,800,1500,2000},//person 1
                {900,700,1600,1800}, //person 2 
                {1100,850,1700,1900},
                {800,650,1400,2200},
                {950,780,1350,2100},
            
        },//month 1
        {
                {1200,900,1700,2100},
                {950,750,1700,1900},
                {1200,900,1750,1950},
                {850,700,1500,2250},
                {1000,820,1450,2150},
        },//month 2
        {
                {1100,950,1600,2200},
                {1000,800,1800,2000},
                {1150,950,1800,2000},
                {900,750,1600,2300},
                {1050,860,1500,2200},
        },//month 3
       };
       System.out.printf("%-14s %-13s %-13s %-15s %-13s\n"," ", "Region1", "Region2", "Region3", "Region4");

       for(int i=0;i<array3.length;i++)
       {
            for(int j=0;j<array3[i].length;j++)
            {
                System.out.printf("%-15s","Person"+(j+1));
                for(int k=0;k<array3[i][j].length;k++)
                {
                    System.out.printf("%-15d",array3[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
       }
       System.out.println("-------------------------------------");
       Display(array3);
       
       
        
    }
    
    //calculate sum each row, and compare
    public static void calculatetotal( int[][] array)
    {
        
        int[] totals=new int[array.length];
        int[] sortedArray=new int[array.length];
        for(int i=0;i<array.length;i++)
        {
            int sum = 0;
            for(int j=0;j<array[i].length;j++)
            {
                sum+=array[i][j];
            }
            System.out.println("Employee " +i+" total: "+sum);
            totals[i]=sum;
        } 
        System.out.println("-----------------------------");
        sortedArray=Arrays.copyOf(totals, totals.length);
        Arrays.sort(sortedArray);

        for(int sorted: sortedArray)
        {
            for(int i=0;i<totals.length;i++)
            {
                if(totals[i]==sorted)
                {
                    System.out.println("Employee "+i+" Totals: "+sorted);
                    totals[i]=-1;
                    break;
                    
                }
            }
        }   
    }

    //compare two arrays
    public static void compare(int[][] array1,int[][] array2)
    {

        
        for(int i=0;i<array1.length;i++)
        {
            for(int j=0;j<array1[i].length;j++)
            {
                if(array1[i][j]==array2[i][j])
                {
                    System.out.println("The two arrays are identical");
                    return;
                }

                else
                {
                    System.out.println("The two arrays are not identical");
                    return;
                }
            }
        }
        
    }

    //display
    public static void Display(int[][][] array3)
    {
        int person=5;
        int region=4;
        int month=3;
        for(int i=0;i<person;i++)
        {
            System.out.println("\nSaleperson "+ (i+1)+"'s sales figure: ");
            int sum=0;
            for(int j=0;j<region;j++)
            {
                System.out.print("Region "+(j+1)+" : ");
                for(int k=0;k<month;k++)
                {
                    System.out.print("Month "+(k+1)+" : "+ array3[k][i][j]+" ");
                    sum+=array3[k][i][j];
                }
                System.out.println();
            }
            System.out.println("Total for saleperson "+(i+1)+"'s: "+ sum);
        }

        Total_per_region(array3);
    }

   

    public static void Total_per_region(int[][][] array)
    {
        System.out.println("-------------------------");
        int person = 5;
        int region = 4;
        int month = 3;
        double[] array_average=new double[4];
        double[] copy_array_average = new double[4];
       for(int i=0;i<region;i++)
       {
        System.out.println("\nRegion "+(i+1));
        int sum=0;
        for(int j=0;j<person;j++)
        {
            for(int k=0;k<month;k++)
            {
                sum+=array[k][j][i];
            }
        }
        double average=(double) sum/(person*month);
        System.out.println("Total sale = "+sum);
        System.out.printf("Average sale = %.2f \n",average);
        array_average[i]=average;
        copy_array_average=Arrays.copyOf(array_average,array_average.length);
        
       }
       System.out.println("---------------------------------");
       
       Arrays.sort(copy_array_average);
       double lowest_average=copy_array_average[0];
       double highest_average=copy_array_average[3];
       
       for(double sorted: copy_array_average)
       {
        for(int i=0;i<array_average.length;i++)
        {
            if(array_average[i]==sorted )
            {
                if(array_average[i]==lowest_average)
                {
                    System.out.printf("Region "+(i+1)+" has the lowest average sale of %.2f\n",lowest_average);
                }
                if(array_average[i]==highest_average)
                {
                    System.out.printf("Region "+(i+1)+" has the highest average sale of %.2f\n",highest_average);
                }
            }
        }
       }
       System.out.println("---------------------------------------");
        best_performace(array);
    }

    public static void best_performace(int[][][] array)
    {
        int person=5;
        int month=3;
        int region=4;
        int[] total_person_array=new int[5];
        for(int i=0;i<person;i++)
        {
            int sum=0;
            for(int j=0;j<month;j++)
            {
                for(int k=0;k<region;k++)
                {
                    sum+=array[j][i][k];
                }
            }
        total_person_array[i]=sum;
      
        }

      int[] copy_total_person_array=Arrays.copyOf(total_person_array, total_person_array.length);
        Arrays.sort(copy_total_person_array);
        int highest_total=copy_total_person_array[4];
        for(int sorted: copy_total_person_array)
        {
            for(int i=0;i<total_person_array.length;i++)
            {
                if(total_person_array[i]==sorted)
                {
                    if(total_person_array[i]==highest_total)
                    {
                        System.out.printf("Saleperson %d with the highest total sale of %d\n",(i+1),highest_total);
                    }
                        
                
                }
            }
        }
    
    
    
    }
}
