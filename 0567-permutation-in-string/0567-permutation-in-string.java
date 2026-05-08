class Solution {
    public boolean checkInclusion(String s1, String s2) {
     if(s1.length()>s2.length()){
        return false;
     }
       int[] s1arr=new int[26];
       int[] s2arr=new int[26];
       for(int i=0;i<s1.length();i++){
        s1arr[s1.charAt(i)-'a']++;
        s2arr[s2.charAt(i)-'a']++;
       }
       for(int i=0;i<s2.length()-s1.length();i++){
        if(Arrays.equals(s1arr,s2arr)){
            return true;
        }
         s2arr[s2.charAt(i)-'a']--;
         s2arr[s2.charAt(i+s1.length())-'a']++;
       }
       return Arrays.equals(s1arr,s2arr);
    }
}