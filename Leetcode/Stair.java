package Leetcode;

public class Stair {
    public static void main(String[] args) {
        
    }
    
    public int climbStairs(int n) {
        if (n <= 2)
            return n;
        int[] step = new int[n + 1];
        step[1] = 1;
        step[2] = 2;
        for (int i = 3; i <= n; i++) {
            step[i] = step[n - 1] + step[n - 2];
        }
        return step[n];
    }

}


