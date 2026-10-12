class Solution {
    public int trap(int[] height) {
    int leftmax=0;
    int rightmax=0;
    int l=0;
    int r=height.length-1;
    int ans=0;

    while(l<r){
        leftmax=Math.max(height[l],leftmax);
        rightmax=Math.max(height[r],rightmax);
        if(leftmax<rightmax){
          ans+=leftmax-height[l];
          l++;
        }else{
            ans+=rightmax-height[r];
            r--;
        }
    }
    return ans;
    }
}