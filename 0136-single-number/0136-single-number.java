class Solution {
    public int singleNumber(int[] nums) {
     int result=0;
     //in this for loop we use xor opration for this xor opration same double values are zero or single value is store in the result
     for( int i=0; i<nums.length;i++){
        result^=nums[i];
     }
     return result;
    }
}