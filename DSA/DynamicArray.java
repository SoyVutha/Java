package DSA;
import java.util.*;

public class DynamicArray {
    //The size of this array is depend on the value inside
    public static void main(String[] args) {
        ArrayList<Object> dynamic=new ArrayList<>();
        dynamic.add(10);
        dynamic.add(20);
        dynamic.add(30);
        dynamic.add(50);
        dynamic.add("Duck");
        System.out.println(dynamic);
        if(dynamic.size()<5)
        {
            System.out.println("The size is under 5");
        }
    }
}
// the Arraylist took more time to delete and input, but faster to search for vlaue inside it
// the linklsit took more time to search for a vlaue inside it
