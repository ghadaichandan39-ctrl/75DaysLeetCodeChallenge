class Solution {
    public void nextPermutation(int[] nums) {
     int n=nums.length;
     int pivot= -1;

     for(int i=n-2;i>=0;i--){
        if(nums[i]<nums[i+1]){
            pivot= i;
            break;
        }
     }   
     if(pivot==-1){
        reverse(nums);
        return;
     }

     for(int i=n-1; i>pivot; i-- ){
        if(nums[pivot]<nums[i]){
            int temp=nums[pivot];
            nums[pivot]=nums[i];
            nums[i]=temp;
            break;
        }
     }
     int i=pivot+1;
     int j=n-1;
     while(i<j){
         int temp=nums[j];
            nums[j]=nums[i];
            nums[i]=temp;
            i++;
            j--;
        }
     return;
    }
    void reverse(int[] arr){
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<j){
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            j--;
            i++;
        }
    }
}