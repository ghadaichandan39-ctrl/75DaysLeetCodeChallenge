class Solution {
    public int removeDuplicates(int[] nums) {
       int left=0;
       int right=1;
       int n=nums.length;
       while(right<=n-1){
        if(nums[left]==nums[right]){
          right++;  
        }
        else{
            nums[left+1]=nums[right];
            left++;
        }
       }
       return left+1; 
    }
}