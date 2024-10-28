package Leetcode;

public class Single {
    class Solution {
        public int singleNumber(int[] nums) {
            if (nums.length == 0)
                return nums[0];
            int single_value;
            for (int i = 0; i < nums.length; i++) {
                boolean isDuplicate;
                for (j = 0; j < nums.length; j++) {
                    if (i != j && nums[i] == nums[j]) {
                        isDuplicate = true;
                        break;

                    }
                }
                if (!isDuplicate) {
                    single_value = nums[i];
                }
            }
            return single_value;

        }
    }
    
}

