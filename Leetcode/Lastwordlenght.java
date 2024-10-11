package Leetcode;

public class Lastwordlenght {
    public static void main(String[] args) {
        
    }
    
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String[] words = s.split(" ");
        int lenght = 0;
        if (words.length > 0) {
            lenght = words[s.length() - 1].length();
        }
        return lenght;
    }
    
}

// split() => split the word base on something
