package Algorithms;

public class Disccusion1 {
    public static void main(String[] args) {
        //1.Variable Local Scope:
        calculateSum();

        //2. Method for Adding Two Numbers:
        System.out.print(addNumbers(5,10));

        //3.Method Overloading:
        System.out.print(addNumbers(5,6,7));

        //4.. Pass by Value:
        System.out.print(modifyValue(5));
        
        // 5. Method Call:
        addNumbers(7, 3, 9);
        addNumbers(3, 7);
        modifyValue(8);




    }
    public  static int addNumbers(int a,int b)
    {
        return a+b;
    }

    public static void calculateSum()
    {
        int sum=20+40;
        System.out.println("Sum of two numbers:"+sum);
    }

    public static int addNumbers(int a, int b, int c)
    {
        return a+b+c;
    }

    public static int modifyValue(int x)
    {
        int modify=x*5;
        System.out.println("Original Value is: "+x);
        System.out.println("Modified Value is: "+modify);
        return modify;
    }
}
