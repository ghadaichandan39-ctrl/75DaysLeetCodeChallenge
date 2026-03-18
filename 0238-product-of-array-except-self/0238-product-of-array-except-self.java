class Solution {
    public int[] productExceptSelf(int[] nums) {
     int num=nums.length;
     int[] result=new int[num];
     result[0]=1;
     for(int i=1;i<num;i++){
      result[i]=result[i-1]*nums[i-1];
     }      
     int suffix=1;
     for(int i=num-1;i>=0;i--){
        result[i]=result[i]*suffix;
        suffix=suffix*nums[i]; 
     }
     return result;

    }
}