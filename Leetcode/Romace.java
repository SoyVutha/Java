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
    
}
// get can only be used with array
// charat used for string


