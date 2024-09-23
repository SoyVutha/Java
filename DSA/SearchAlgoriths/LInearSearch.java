package DSA.SearchAlgoriths;
//Linear search = loop through the array , if the input matched , return something
//advantage = doesnt have to use sort
//disadvantage = slow for large array, but fast for small and medium array
//time complexity = O(n)

import java.util.*;

public class LInearSearch {
    //find value
    public static void main(String[] args) {
        ArrayList<Object> array = new ArrayList<>();
        array.add("Duck");
        array.add("Quack");
        array.add("Dog");
        array.add("Bark");
        array.add(20);
        array.add(50);
        Object value = LinearSearch(array, 4);
        System.out.println(value);

    }

    public static Object LinearSearch(ArrayList<Object> array, int index) {
        for (int i = 0; i < array.size(); i++) {
            if (index == i) {
                return array.get(index);
            }
        }
        return null;

    }
}

    // find the index
    // public static void main(String[] args) {
        // ArrayList<Object> array = new ArrayList<>();
        // array.add("Duck");
        // array.add("Quack");
        // array.add("Dog");
        // array.add("Bark");
        // array.add(20);
        // array.add(50);
        // int index = LinearSearch(array, "Duck");
    // }
// 
    // public static int  LinearSearch(ArrayList<Object> array,Object value)
    // {
        // for(int i=0;i<array.size();i++)
        // {
            // if(value==array.get(i))
            // {
                // return i;
            // }
        // }
        // return -1;
    // }