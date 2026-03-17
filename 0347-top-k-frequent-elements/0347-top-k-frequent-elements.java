class Solution {
    public int[] topKFrequent(int[] nums, int k) {
     HashMap<Integer,Integer> map= new HashMap<>();
     for(int i=0;i<nums.length;i++){
        int num=nums[i];
        if(map.containsKey(num)){
            map.put(num,map.get(num)+1);
        }
        else{
            map.put(num,1);
        }
     }
    PriorityQueue<Integer> arr1=new PriorityQueue<>((n1,n2)->map.get(n1)-map.get(n2));
    for(int i:map.keySet()){
        arr1.add(i);
        if(arr1.size()>k){
            arr1.poll();
        }
    }
    int[] arr=new int[k];
    for(int i=0;i<k;i++){
        arr[i]=arr1.poll();
    }
     return arr;
    }
}