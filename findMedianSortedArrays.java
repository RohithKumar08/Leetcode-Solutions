import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        int count = 0;
        for(int i : nums1)  nums[count++] = i;
        for(int i : nums2)  nums[count++] = i;
        Arrays.sort(nums);
        double result = 0.0;
        if(nums.length % 2 == 1){
            result = (double)nums[nums.length / 2];
        }
        else{
            result = (double)(nums[nums.length / 2] + nums[(nums.length - 1) / 2]) / 2.0;
        }
        return result;
    }
}