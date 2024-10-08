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
}

