class Solution {
    public int search(int[] nums, int target) {
       int si=0;
       int ei=nums.length;
       int mid=si+(ei-si)/2;
       while(si<ei){
        if(nums[mid]==target){
            return mid;
        }else if(nums[mid]>target){
            ei=mid;
            mid=si+(ei-si)/2;
        }
        else{
           si=mid+1;
            mid=si+(ei-si)/2; 
        }
       }
       return -1;
    }
}