package Algorithms;

public class Pathems {
    public static void main(String[] args) {
      for(int i=1;i<=7;i++)
      {
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
      }
      System.out.print("-------------------------------\n");

      for(int i=1;i<=7;i++)
      {
        for(int j=1;j<=(7-i)+1;j++)
        {
            System.out.print("*");
        }
        System.out.println();
      }
      System.out.print("-------------------------------\n");
      for(int i=1;i<=7;i++)
      {
        for(int j=1;j<=7;j++)
        {
            System.out.print("*");
        }
        System.out.println();
      }
      System.out.print("-------------------------------\n");
      for(int i=1;i<=7;i++)
      {
        for(int j=7;j<=5;j--)
        {
            System.out.print("*");
        }
        System.out.println();
      }
      System.out.print("-------------------------------\n");
      






    }
}
