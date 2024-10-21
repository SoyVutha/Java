package Leetcode;

public class SearchInsert {
    public static void main(String[] args) {
        
    }
    
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0 || target == 0)
            return 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            } else {
                if (nums[i] < target && (i == nums.length - 1 || nums[i + 1] > target)) {
                    return i + 1;
                }
            }
        }
        return nums.length;
    }

    public int Search_Insert(int[] nums, int target){
        if(nums.length==0 || target==0) return 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                return i;
            }
            else{
                if(nums[i]<target && (nums[i+1]>target))
                {
                    return i+1;
                }
            }
        }
        return nums.length;

    }
}
