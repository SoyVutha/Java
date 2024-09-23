package Algorithms;
//array can store same type of variables
//list store different type
public class Array {
    public static void main(String[] args) {
        //Declare array
        int array[]=new int[5];
    
        //index
        int index=0;
    
        //price and total
        int price1=5;int quantity1=4;
        int price2=8;int quantity2=2;
    
        //total
        int total1=price1*quantity1;
        int total2=price2*quantity2;

        //store
        array[index++] = total1;// Store total1 at index 0, then increment index
        array[index++] = total2;// Store total2 at index 1, then increment index

        //copy array
        int[] copiedarray=new int[array.length];

        for(int i=0;i<index;i++)
        {
            copiedarray[i]=array[i];

            System.out.println(copiedarray[i]);
        }

        System.out.println("-----------");
        for (int i = 0; i < index; i++) {
            System.out.println(array[i]);
        }
    }
    

    
}
