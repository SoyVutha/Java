package DSA;
import java.util.*;

public class MyLinkList {
    //Linklist > stack, Linklist > Queue
    //Listlist = more dynamic , more powerful , more services

    //offer, poll
    //addFirst , addLast
    //removeFirst, removeLast
    //getFirst, getLast
    //isEmpty
    //PeakFirst, Peaklast

    public static void main(String[] args) {
        LinkedList<String> linklist=new LinkedList<>();

        linklist.offer("Duck");
        linklist.offer("Quack");
        linklist.addFirst("Dog");
        linklist.addFirst("Cat");

        linklist.add(1,"HERO");// this insert Duck to the index 1

        System.out.println(linklist);

    }
}
