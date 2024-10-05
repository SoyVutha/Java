package Algorithms;
import java.util.*;
//the hashtable stored value as stack

public class Hash {
    public static void main(String[] args) {
        Hashtable<Integer, String> table=new Hashtable<>(10);
        table.put(1,"one");
        table.put(2,"two");
        table.put(3,"three");
        table.put(4,"four");
        table.put(5,"five");

        for(int key:table.keySet())
        {
            System.out.println(key+" "+table.get(key));
        }
    }
}
