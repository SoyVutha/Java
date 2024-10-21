package Leetcode;

import java.util.*;
public class Addbinary {
    public static void main(String[] args) {
        
    }
    public int addBinary(String a, String b) {
        int num1 = Integer.parseInt(a, 2);
        int num2 = Integer.parseInt(b, 2);
        int answer = num1 + num2;
        
        Integer.toBinaryString(answer);
        return answer; 
    }    

    public int ToBinary(String a, String b){
        int number1=Integer.parseInt(a, 2);
        int number2=Integer.parseInt(b, 2);
        int result=number1+number2;
        Integer.toBinaryString(result);
        return result;
    }
}



