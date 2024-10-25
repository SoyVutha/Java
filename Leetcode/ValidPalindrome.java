package Leetcode;

public class ValidPalindrome {
    
    class Solution {
        public boolean isPalindrome(String s) {
            if (s.length() == 0)
                return false;
            String removeSpace = s.replace(" ", "");
            String reverse = new StringBuilder(removeSpace).reverse().toString();
            if (removeSpace.matches(reverse))
                return true;
            else
                return false;
        }
    }

}
