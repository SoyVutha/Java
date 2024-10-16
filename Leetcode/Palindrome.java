package Leetcode;

import java.util.*;

public class Palindrome {
     public boolean isPalindrome(int x) {
        if (x < 0) return false;
        String string_number=Integer.toString(x);
        ArrayList<String> array1=new ArrayList<>();
        for(int i=0;i<string_number.length();i++)
        {
            array1.add(String.valueOf(string_number.charAt(i))); // Convert char to String
        }
        String reverse=new StringBuilder(string_number).reverse().toString();
        ArrayList<String> array2=new ArrayList<>();
        for(int i=0;i<reverse.length();i++)
        {
            array2.add(String.valueOf(reverse.charAt(i))); // Convert char to String
        }
        for(int i=0;i<array1.size();i++)
        {
           if(!array1.get(i).equals(array2.get(i)))
           {
            return false;
           }
          
        }
        return true;
    }   
    
    public static boolean isitPalindrome(int x) {
        if (x < 0)
            return false;
        String toString = Integer.toString(x);
        String Reverse = new StringBuilder(toString).reverse().toString();
        if (Reverse.equals(toString) ) {
            return true;
        }
        else{
            return false;
        }
    }
}
// the arraylist cannot use the array1[i][j]=array2[i][j] style




