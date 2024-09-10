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
      System.out.print("-----left right pyramid--------------------------\n");
      for(int i=1;i<=7;i++)
      {
        for(int j=i;j<=7;j++)
        {
          System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
          System.out.print("*");
        }
        
        for (int j = 1; j < i; j++) {
          System.out.print("*");
        }
        System.out.println();
      }
      System.out.println(sum(1,10));


      int i1=10;
      int i2=30;
      int[] swap=swap(i1,i2);
      System.out.println(swap[0]);
      System.out.println(swap[1]);
    }
    public static int[] swap(int a,int b)
    {
      return new int[]{b,a};
    }
    public static int sum(int x , int y)
    {
      int answer=0;
      for(int i=x;i<=y;i++)
      {
        answer+=i;
      }
      return answer;
    }

    



}
