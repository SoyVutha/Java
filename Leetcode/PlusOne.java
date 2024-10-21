package Leetcode;

public class PlusOne {
    public static void main(String[] args) {
        
    }
    
    public int[] plusOne(int[] digits) {
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += digits[i];
        }
        sum = sum + 1;
        String int_toString = Integer.toString(sum);
        int[] array = new int[int_toString.length()];
        for (int i = 0; i < int_toString.length(); i++) {
            array[i] = Character.getNumericValue(int_toString.charAt(i));

        }

        for (int i = 0; i < array.length; i++) {
            array[i] = digits[i];
        }
        return digits;

    }
    
}

