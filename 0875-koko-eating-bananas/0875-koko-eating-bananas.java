class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int st=1;
       int end=0;
       for(int pile:piles){
        end=Math.max(end,pile);
       } 
       int result=end;
       while(st<=end){
        int k=st+(end-st)/2;
        if(canDo(piles,h,k)){
            result=k;
            end=k-1;
        }else{
            st=k+1;
        }
       }
       return result;
    }
    public boolean canDo(int[] piles,int h,int k){
        long hour=0;
        for(int pile:piles){
            hour+=(pile+k-1)/k;

        }
        return hour<=h;
    }
}