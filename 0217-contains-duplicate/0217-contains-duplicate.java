class Solution {
    public boolean containsDuplicate(int[] nums) {
      HashMap<Integer,Integer> map=new HashMap<>();
      for(int i=0;i<nums.length;i++){
        int fre=1;
        if(map.containsKey(nums[i])){
            fre++;
            map.put(nums[i],fre);

        }
        map.put(nums[i],fre);

      } 
      Set<Integer> Keys=map.keySet();

      for(int i:Keys){
       if(map.get(i)==2){
        return true;
       }
      }
      return false;
    
    }
}