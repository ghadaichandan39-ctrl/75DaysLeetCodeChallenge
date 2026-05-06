class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int min=Integer.MAX_VALUE;
        int st=0;
      for(int end=0;end<nums.length;end++){
         sum+=nums[end];
         while(sum>=target){
            min=Math.min(min,end-st+1);
            sum-=nums[st];
            st++;
         }
      }
      return (min==Integer.MAX_VALUE)?0:min;
    }
}