package Leetcode;

import java.util.*;;
public class MergeArray {
    public static void main(String[] args) {
        
    }
    public static void Mege(){
        List<Double> l1=new ArrayList<>();
        List<Double> l2=new ArrayList<>();
        List<Double> Duck=new ArrayList<>();
        
       
        if(!l1.isEmpty())
        {
            for (int i = 0; i < l1.size(); i++) {
                Duck.add(l1.get(i));

            }
        }
            
        if(!l2.isEmpty())
        {
            for (int i = 0; i < l2.size(); i++) {

                Duck.add(l2.get(i));

            }
        }
       
        Collections.sort(Duck);

    }

    public static void MergeList(ListNode list1, ListNode list2){
        LinkedList<Integer> list=new LinkedList<>();
        for(int i=0;list1!=null;i++)
        {
            list.push(list1.val);
            list1=list1.next;
        }
        for(int i=0;list2!=null;i++)
        {
            list.push(list2.val);
            list2=list2.next;
        }
        Collections.sort(list);

    }
}
