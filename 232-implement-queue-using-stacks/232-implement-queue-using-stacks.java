class MyQueue {
    Stack<Integer> s = new Stack<>();
    
    public void push(int x) {
       pushAtBottom(s,x);
    }    
    public int pop() {
       return s.pop();
    }    
    public int peek() {
        return s.peek();
    }    
    public boolean empty() {
        return s.isEmpty();
    }
    
    // User Defined Function 
    public void pushAtBottom(Stack<Integer>s,int x){
        if(!s.isEmpty()){
            int ans = (int)s.pop();
            pushAtBottom(s,x);
            s.push(ans);
        }
        else{
            s.push(x);
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */