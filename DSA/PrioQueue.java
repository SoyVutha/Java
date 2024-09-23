package DSA;
import java.util.*;

public class PrioQueue {
    public static void main(String[] args) {
        Queue<Float> GPA=new PriorityQueue<>(Collections.reverseOrder());
        GPA.offer(1.0f);
        GPA.offer(1.5f);
        GPA.offer(2.0f); 
        GPA.offer(2.5f);
        GPA.offer(3.0f);
        GPA.offer(3.5f);
        GPA.offer(4.0f);
        System.out.println(GPA);
        
        List<Float> sortArray=new ArrayList<>(GPA);
        sortArray.remove(2.5f);
        sortArray.add(0,2.5f);

    }
}
