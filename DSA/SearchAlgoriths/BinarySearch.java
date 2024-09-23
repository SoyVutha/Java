package DSA.SearchAlgoriths;
import java.lang.reflect.Array;
import java.util.*;;
    //Binary = can only be used in sorted value
    // Binary search = should only be used for searching data not string
    //Binary search = half of the value of eliminated each "step"
public class BinarySearch {
    public static void main(String[] args) {
        int[] array={2,4,7,8,9,1,3,5,6};
        Arrays.sort(array);
        int target=5;
        int result=binarySearch(array,target);
        System.out.println(result);
    }
    public static int binarySearch(int[] array,int target){
        int low=0;
        int high=array.length-1;
        while(low<=high){
        int mid=low+(high-low)/2;
        if (array[mid] == target) {
            return mid; // Target found
        } else if (array[mid] < target) {
            low = mid + 1; // Search in the right half
        } else {
            high = mid - 1; // Search in the left half
        }
    
        }
        return 1;
    }
}
//Linear search
//Binary Search
//Interpolation search
//built in serach
