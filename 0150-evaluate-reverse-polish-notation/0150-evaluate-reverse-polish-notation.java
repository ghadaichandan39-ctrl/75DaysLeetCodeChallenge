class Solution {
    public int evalRPN(String[] tokens) {
       Stack<Integer> s=new Stack<>();
       int a;
       int b;
       for(String t:tokens){
        if(!s.isEmpty() && t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/")){
          a=s.pop();
          b=s.pop();
          if(t.equals("+")){
          s.push(a+b);
        }else if(t.equals("-")){
           
           s.push(b-a);
        }else if(t.equals("*")){
           
            s.push(a*b);
        }
        else{
           
            s.push(b/a);
        }
       }
       else{
        s.push(Integer.parseInt(t));
       }
       }
       return s.pop();
    }
}