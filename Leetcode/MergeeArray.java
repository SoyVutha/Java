package Leetcode;

import java.util.Arrays;

public class MergeeArray {
    public static void main(String[] args) {
        int[] nums1={7,8,5,0,0};
        int[] nums2={1};
        System.out.println(Arrays.toString(merge(nums1, nums2,3,1)));
    }
    public static int[] merge(int[] nums1, int[] nums2, int m, int n) {
        int[] final_array = new int[m + n];
        int k=0;

        for(int i=0;i< nums1.length;i++)
        {
            if(nums1[i]!=0)
            {
                final_array[k++]=nums1[i];
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            if (nums2[i] != 0) {
                final_array[k++] = nums2[i];
            }
        }
        Arrays.sort(final_array);
        return final_array;
        
    }
}
