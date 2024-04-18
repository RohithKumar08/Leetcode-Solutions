import java.util.*;
class Solution {
    HashMap<Integer, Integer> hm;
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int arr[] = new int[2];
        int count = 0;
        for(int i : nums){
            if(hm.containsKey(target - i)){
                arr[0] = hm.get(target - i);
                arr[1] = count;
            }
            hm.put(i, count);
            count++;
        }
        return arr;
    }
}