class Solution {
    public int characterReplacement(String s, int k) {
       HashMap<Character,Integer> map=new HashMap<>();
       int left=0;
       int maxcount=0;
       int maxlength=0;
       for(int right=0;right<s.length();right++){
        char rightchar=s.charAt(right);
        map.put(rightchar,map.getOrDefault(rightchar,0)+1);
        maxcount=Math.max(maxcount,map.get(rightchar));
        while((right-left+1)-maxcount>k){
            char leftchar=s.charAt(left);
            map.put(leftchar,map.get(leftchar)-1);
            left++;
        }
        maxlength=Math.max(maxlength,right-left+1);
       } 
       return maxlength;
    }
}