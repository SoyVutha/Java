package Leetcode;

public class BestTime {
    

class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int smallest = prices[0];
        if (prices.length == 0)
            return 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < smallest) {
                smallest = prices[i];
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - smallest);
            }
        }
        return maxProfit;

    }
}

}
