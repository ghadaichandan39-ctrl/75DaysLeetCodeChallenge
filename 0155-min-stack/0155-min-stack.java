class MinStack {
    private Stack<Integer> s;
    private Stack<Integer> mins;
    public MinStack() {
       s=new Stack<>();
       mins=new Stack<>();
    }
    
    public void push(int val) {
      s.push(val);
      if(mins.isEmpty() || val<=mins.peek()){
        mins.push(val);
      }  
      else{
        mins.push(mins.peek());
      }
    }
    
    public void pop() {
        s.pop();
        mins.pop();
    }
    
    public int top() {
      return s.peek(); 
    }
    
    public int getMin() {
        return mins.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */