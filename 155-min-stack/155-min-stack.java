class MinStack {
    private int min = Integer.MAX_VALUE;
    private Stack<Pair<Integer, Integer>> stack;
    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        int preMin = min;
        if (val < min) {
            min = val;
        }
        // record each element and previous minimum.
        stack.push(new Pair<Integer, Integer>(val, preMin));
    }
    
    public void pop() {
        Pair<Integer, Integer> pair = stack.pop();
        min = pair.getValue();
    }
    
    public int top() {
        return stack.peek().getKey();
    }
    
    public int getMin() {
        return min;
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