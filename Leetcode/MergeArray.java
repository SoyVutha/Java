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
}
