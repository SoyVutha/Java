package DSA.DataStruture;

import java.util.*;

public class Queues {
    //Queue = data stucture, first in first out
    // Queue = store value in a single line
    //offer  = add value from the start
    //poll = remove value from the start
    public static void main(String[] args) {
        Queue<String> customer=new LinkedList<String>();
        customer.offer("Duck Ther Hero");
        customer.offer("Quack The Viliian");
        customer.offer("Dog The citizen");

        System.out.println(customer.peek());
        System.out.println(customer.size());
        System.out.println(customer);
        customer.poll();
        
            
    }
}
