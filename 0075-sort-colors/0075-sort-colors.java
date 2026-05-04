class Solution {
    public void sortColors(int[] nums) {
     int first=0;
     int mid=0;
     int end=nums.length-1;
     while(mid<=end){
        switch(nums[mid]){
            case 0:
              int temp=nums[mid];
              nums[mid]=nums[first];
              nums[first]=temp;
              mid++;
              first++;
              break;
            case 1:
              mid++;
              break;
            case 2:
                temp=nums[mid];
                nums[mid]=nums[end];
                nums[end]=temp;
                end--;
                break; 
        }
     }
    }
}