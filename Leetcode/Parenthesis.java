package Leetcode;
import java.util.*;
public class Parenthesis {
    public static void main(String[] args) {
        
    }

    public static boolean Parenthesis(String s)
    {
        Stack<Character> stack=new Stack<Character>();
        if(s.length()%2!=0)
        {
            return false;
        }
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                stack.push(')');
            }
            else if(s.charAt(i)=='{')
            {
                stack.push('}');
            }
            else if(s.charAt(i)=='[')
            {
                stack.push(']');
            }
            else{
                if(stack.isEmpty()||s.charAt(i)!=stack.pop())
                {
                    return false;
                }
            }
        }
        return stack.isEmpty();   
    }
    
    public static boolean isvalid(String s){
        if(s.length()<2) return false;
        Stack<Character> list=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='('){
                list.push(')');
            }
            else if(s.charAt(i)=='{'){
                list.push('}');
                }
            else if(s.charAt(i)=='['){
                list.push(']');
            }
            else{
                if(s.charAt(i)!=list.pop()||list.isEmpty()) 
                {
                    return false;
                }
            }
        }
        return list.isEmpty();


    }    
}

//the s[i] is use to get the index
// the s.charAt[i] is use to get the value at the index i
//the pop will pop that peak value, it target the peek value
