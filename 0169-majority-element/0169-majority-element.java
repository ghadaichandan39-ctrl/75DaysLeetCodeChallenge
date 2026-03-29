class Solution {
    public int majorityElement(int[] nums) {
        HashMap< Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        int k=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            map.put(num,map.getOrDefault(num,0)+1);
        }
            for(int key:map.keySet()){
                if(map.get(key)>n/2){
                    k=key;
                }
            }
      return k;
    }
}