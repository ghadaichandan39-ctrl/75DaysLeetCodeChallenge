class Solution {
    public int maxArea(int[] height) {
        int width;
        int left=0;
        int right=height.length-1;
       int maxheight=0;
        int maxwater=0;
        while(left<right){
          width=right-left;
         maxheight=Math.min(height[left],height[right]);
         maxwater=Math.max(maxwater,maxheight*width);
         //in this step which hight is small water level accourding to that 
         if(height[left]<height[right]){
            left++;
         }else{
            right--;
         }

        }
        return maxwater;
    }
}