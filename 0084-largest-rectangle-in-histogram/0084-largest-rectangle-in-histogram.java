class Solution {
    public int largestRectangleArea(int[] heights) {
       int n=heights.length;
       Stack<Integer> stack=new Stack<>();
       int area=0;
       for(int i=0;i<=n;i++){
        int currheight=(i==n)?0:heights[i];
        while(!stack.isEmpty() && currheight<heights[stack.peek()]){
            int height=heights[stack.pop()];
            int width=(stack.isEmpty())?i:i-stack.peek()-1;
            area=Math.max(area,height*width);

        }
        stack.push(i);
       }
       return area;
    }
}