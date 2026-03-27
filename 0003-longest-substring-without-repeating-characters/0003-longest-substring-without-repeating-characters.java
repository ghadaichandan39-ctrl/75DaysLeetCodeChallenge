 import java.util.*;
 class Solution {
    public int lengthOfLongestSubstring(String s) {
      int left=0, right=0, maxlength=0;
       HashSet<Character> set = new HashSet<>();
        while(right< s.length()){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                maxlength=Math.max(maxlength,right-left+1);
                right++;
            }
            else{
                // in this case when a repeted charecter is coming then we are remove thr charecter from left and 
               //  incresing the left pointer
                set.remove(s.charAt(left));
                left++;
            }
        }
      return maxlength;
    }
    
}