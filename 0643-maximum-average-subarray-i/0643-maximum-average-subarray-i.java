class Solution {
    public double findMaxAverage(int[] nums, int k) {
      double currentsum=0;
      for(int i=0;i<k;i++){
    currentsum+=nums[i];
      } 
      double maxsum=currentsum;
      for(int i=k;i<nums.length;i++){
        currentsum+=nums[i]-nums[i-k];
        maxsum=Math.max(maxsum,currentsum);
      }
      return maxsum/k;
    }
}