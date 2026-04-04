class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
      int n=grid.length;
      int nfreq=n*n;
      int[] count=new int[nfreq+1];
      int[] ans=new int[2];
      for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            int val=grid[i][j];
            count[val]++;
        }
      }
      for(int i=1;i<=nfreq;i++){
        if(count[i]==2){
          ans[0]=i;
        }else if(count[i]==0){
            ans[1]=i;
        }
      }
      return ans;
    }
}