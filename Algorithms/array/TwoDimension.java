package Algorithms.array;

public class TwoDimension {
    public static void main(String[] args) {
        char[][] answers = {
                { 'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
                { 'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D' },
                { 'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D' },
                { 'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D' },
                { 'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
                { 'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
                { 'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
                { 'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' }
        };
    
        char[] keys = { 'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D' };
      
        System.out.println("--------------------------------");
         System.out.printf("%-20s", " ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-6d", i); 
        }
        for(int i=0;i<answers.length;i++)
        {
            System.out.println("student "+i);
            for(int j=0;j<answers[i].length;j++)
            {
                System.out.printf("%-6d",answers[i][j]);
            }

        }


     }
}
