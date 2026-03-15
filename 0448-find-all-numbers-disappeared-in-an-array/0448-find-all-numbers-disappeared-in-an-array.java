class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
      HashMap<Integer,Integer> map=new HashMap<>();
      for(int i=0;i<nums.length;i++){
        int num=nums[i];
        if(map.containsKey(num)){
          map.put(num,map.get(num)+1);

        }else{
            map.put(num,1);
        }
      }
       ArrayList<Integer> arr=new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if(!map.containsKey(i)){
                arr.add(i);
                
            }
        }
            return arr; 
    }
}