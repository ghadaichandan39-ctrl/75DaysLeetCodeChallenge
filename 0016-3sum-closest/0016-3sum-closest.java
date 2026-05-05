class Solution {
    public int threeSumClosest(int[] nums, int target) {
     Arrays.sort(nums);
     int minsum=nums[0]+nums[1]+nums[2];
     for(int i=0;i<nums.length-2;i++){
     int st=i+1;
     int end=nums.length-1;
     while(st<end){
        int currsum=nums[i]+nums[st]+nums[end];
        if(Math.abs(target-currsum)<Math.abs(target-minsum)){
            minsum=currsum;
        }
        if(currsum<target){
            st++;
        }else if(currsum>target){
            end--;
        }else{
            return currsum;
        }

     }
     }
     return minsum;
    }
}