class Solution {
    public boolean isPalindrome(String s) {
      String result=s.replaceAll("[^a-zA-Z0-9]", "");
      result=result.toLowerCase();
      int n=result.length();
      if(n==0){
        return true;
      }
      int left=0;
      int right=n-1;
      while(left<right){
        if(result.charAt(left)!=result.charAt(right)){
            return false;
        }
        left++; 
        right--;
      }
      return true;
    }
}