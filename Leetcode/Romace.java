package Leetcode;
import java.util.*;
public class Romace {
     public int romanToInt(String s) {
        HashMap<Character, Integer> array = new HashMap<>();
        array.put('I', 1);
        array.put('V', 5);
        array.put('X', 10);
        array.put('L', 50);
        array.put('C', 100);
        array.put('D', 500);
        array.put('M', 1000);
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = s.charAt(i);
            if (i + 1 < s.length() && current < s.charAt(i + 1)) {
                result -= current;
            } else {
                result += current;
            }

        }
        return result;
    }
    public static int TurnToNumber(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total=0;
        for(int i=0;i<s.length();i++){
            int current = (int)map.get(s.charAt(i));
            if(current<(int)map.get(s.charAt(i+1)) && i+1<s.length())
            {
                total-=current;
            }
            else{
                total+=current;
            }
        }
        return total;
        
    }
    
}
// get can only be used with array
// charat used for string


