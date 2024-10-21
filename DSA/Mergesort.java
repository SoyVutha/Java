package DSA;

public class Mergesort {
    public static void main(String[] args) {
        int[] array={9,7,8,5,3,2,6,5};
        Mergesort(array);
    }
    public static void Mergesort(int[] array)
    {
        int length=array.length;
        if (length<=1) {
            return;
        }
        int middle= length/2;
        int[] leftarray=new int[middle];
        int[] rightarray=new int[length-middle];
        int i=0;//for left
        int j=0;//for right
        for(;i<length;i++)
        {
             if(i<middle)
             {
                leftarray[i]=array[i];
             }
             else
             {
                rightarray[j]=array[i];
                j++;
             }
        }
        Mergesort(rightarray);
        Mergesort(leftarray);
        // merge(leftarray, rightarray, rightarray);
    }

    // public static int merge(int[] leftarray, int[] rightarray, int[] array)
    // {

    // }

}

