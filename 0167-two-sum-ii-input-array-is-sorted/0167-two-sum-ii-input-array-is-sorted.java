class Solution {
    public int[] twoSum(int[] numbers, int target) {
       HashMap<Integer,Integer> map=new HashMap<>();
       int num;
       for(int i=0;i<numbers.length;i++){
         num= target-numbers[i];
        if(map.containsKey(num)){
            return new int[] {map.get(num)+1,i+1}; 
        }
        else{
            map.put(numbers[i],i);
        }
       } 
       return new int[] {};
    }
}