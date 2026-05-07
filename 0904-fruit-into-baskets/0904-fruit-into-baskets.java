class Solution {
    public int totalFruit(int[] fruits) {
      HashMap<Integer,Integer> basket=new HashMap<>();
      int st=0;
      int maxlength=0;
      for(int end=0;end<fruits.length;end++){
        basket.put(fruits[end],basket.getOrDefault(fruits[end],0)+1);
            while(basket.size()>2){
              int stfruit=fruits[st];
              basket.put(stfruit,basket.get(stfruit)-1);
              if(basket.get(stfruit)==0){
                basket.remove(stfruit);
                
              }
              st++;
            }
            maxlength=Math.max(maxlength,end-st+1);
         }  
         return maxlength;
     }
 }