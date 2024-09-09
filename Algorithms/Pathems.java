package Algorithms;

public class Pathems {
    public static void main(String[] args) {
     
      //square
      for(int i=1;i<=7;i++)
      {
        for(int j=1;j<=7;j++)
        {
          System.err.print("* ");
        }
        System.err.println();
      }
      System.out.print("------INcrement-------------------------\n");
      //increment
      for(int i=1;i<=7;i++)
      {
          for(int j=1;j<=i;j++)
          {
            System.out.print("* ");
          }
         System.out.println();
      }
      
      System.out.print("------Decrement-------------------------\n");
    //decrement
      for(int i=1;i<=7;i++)
      {
        for(int j=i;j<=7;j++)
        {
          System.out.print("* ");
        }
        System.out.println();
      }
      
      System.out.print("-----pyramid--------------------------\n");
      //pyramid
       for(int i=1;i<=7;i++)
      {
          for(int j=i;j<=7;j++)
          {
           System.out.print(" ");
          } 
          for(int j=1;j<=i;j++)
          {
           System.out.printf("*");
          }

          for (int j = 1; j < i; j++) {
            System.out.printf("*");
          }
       System.out.println();
      }
      System.out.print("-----upside down pyramid--------------------------\n");
      for(int i=1;i<=7;i++)
      {
        for(int j=1;j<=i;j++)
          {
            System.out.print(" ");
          }
        for(int j=i;j<=7;j++)
        {
          System.out.print("*");
        }
        for (int j = i; j < 7; j++) {
          System.out.print("*");
        }
       
          System.out.println();
      }
      






    }
}
