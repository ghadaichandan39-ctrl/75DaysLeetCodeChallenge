class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
      int n=temperatures.length;
      int[] result=new int[n];
      Stack<Integer> s=new Stack<>();
      for(int i=0;i<n;i++){
        while(!s.isEmpty() && temperatures[i]>temperatures[s.peek()]){
            int pidx=s.pop();
            result[pidx]=i-pidx;
        }
        s.push(i);
      }
      return result;

    }
}