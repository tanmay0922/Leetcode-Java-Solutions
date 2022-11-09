class StockSpanner {
    
    Stack<int[]> st;
    
    public StockSpanner() {
        st = new Stack<>(); //creation of new stack
    }
    
    public int next(int price) {
        
        int span = 1; //span initialized to 1
        
        while(st.size() > 0 && price >= st.peek()[0]){
            span += st.pop()[1];
        }
        
        st.push(new int[]{price, span});
        
        return span;
    }
}
