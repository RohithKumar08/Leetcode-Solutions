import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0, end = 0, max = 0;
        Set<Character> set = new HashSet<>();
        while(end < s.length()){
            char ch = s.charAt(end);
            while(set.contains(ch)){
                set.remove(s.charAt(start));
                start++;
            }
            set.add(ch);
            end++;
            max = Math.max(max, end - start);
        }
        return max;
    }
}