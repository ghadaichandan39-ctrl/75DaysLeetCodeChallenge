class Solution {
    public int longestConsecutive(int[] nums) {
       if(nums==null || nums.length==0){
        return 0;
       }
       HashSet<Integer> set=new HashSet<>();
       for(int num:nums){
          set.add(num);
       }
       int maxlength=0;
       for(int num:set){
        if(!set.contains(num-1)){
            int currnum=num;
            int currcount=1;

            while(set.contains(currnum+1)){
                currnum+=1;
                currcount+=1;
            }
            maxlength=Math.max(maxlength,currcount);

        }
       }
       return maxlength;
    }
}