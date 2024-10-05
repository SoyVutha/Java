import java.util.*;
public class Test {
    public static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        int[][] array = {
                { 2, 4, 3, 4, 5, 8, 8 },
                { 7, 3, 4, 3, 3, 4, 4 },
                { 3, 3, 4, 3, 3, 2, 2 },
                { 9, 3, 4, 7, 3, 4, 1 },
                { 3, 5, 4, 3, 6, 3, 8 },
                { 3, 4, 4, 6, 3, 4, 4 },
                { 3, 7, 4, 8, 3, 8, 4 },
                { 6, 3, 5, 9, 2, 7, 9 },
        };
        System.out.printf("%-15s %-5s %-5s %-5s %-5s %-5s %-5s %-5s\n"," ","Su","M","T","W","Th","F","Sa");
        int row=8;int column=7;
        for(int i=0;i<row;i++)
        {
            System.out.printf("%-15s ","Student :"+(i+1));
            for(int j=0;j<column;j++)
            {
                System.out.printf("%-5d ",array[i][j]);
            }
            System.out.println();
        }
        Total_sum_of_each_student(array);

        System.out.printf("Enter list 1(10 number): ");
        int[][] list1=new int[2][5];
        for(int i=0;i<list1.length;i++)
        {
            for(int j=0;j<list1[i].length;j++)
            {
                list1[i][j]=scan.nextInt();
            }
        }
        System.out.printf("Enter list 2(10 number): ");
        int[][] list2 = new int[2][5];
        for (int i = 0; i < list2.length; i++) {
            for (int j = 0; j < list2[i].length; j++) {
                list2[i][j] = scan.nextInt();
            }
        }
        compare(list1,list2);

        
    }
    public static void Total_sum_of_each_student(int[][] array)
    {
        int row = 8;
        int column = 7;
        int[] total_score = new int[array.length];
        for(int i=0;i<row;i++)
        {
            int sum=0;
            for(int j=0;j<column;j++)
            {
                sum+=array[i][j];
            }
            total_score[i]=sum;
            System.out.println("Total marks of student "+(i+1)+" is "+sum);
        }
        System.out.println("------------------------------------");
        int[] copy_total_scor=Arrays.copyOf(total_score, total_score.length);
        Arrays.sort(copy_total_scor);
        for(int sorted: copy_total_scor)
        {
            for(int i=0;i<total_score.length;i++)
            {
                if(total_score[i]==sorted)
                {
                    System.out.println("Student "+(i+1)+" has scored "+sorted+" marks");
                    total_score[i]=-1;
                    break;
                }
            }
        }
    }

    public static void compare(int[][] list1,int[][] list2)
    {
       if(Arrays.deepEquals(list1, list2))
       {
        System.out.println("The arrays are indicated");
       }
       else
       {
           System.out.println("The arrays are not indicated");
       }
    }
}
