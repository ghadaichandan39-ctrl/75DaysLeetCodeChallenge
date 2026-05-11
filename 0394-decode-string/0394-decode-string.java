class Solution {
    public String decodeString(String s) {
       Stack<Integer> count=new Stack<>();
       Stack<StringBuilder> stack=new Stack<>();
       StringBuilder currstring=new StringBuilder();
       int k=0;
       for(char ch:s.toCharArray()){
         if(Character.isDigit(ch)){
            k=k*10+(ch-'0');
         }
         else if(ch=='['){
            count.push(k);
            stack.push(currstring);
            k=0;
            currstring=new StringBuilder();
         }else if(ch==']'){
            int repetcount=count.pop();
            StringBuilder decode=currstring;
            currstring=stack.pop();
            while(repetcount>0){
                currstring.append(decode);
                repetcount--;
            }
         }
         else{
                currstring.append(ch);
            }
       }
       return currstring.toString(); 
    }
}