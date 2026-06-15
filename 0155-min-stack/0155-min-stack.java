class MinStack {
    Stack<Integer> s;
    Stack<Integer> m;
    public MinStack() {
        s= new Stack<>();
        m=new Stack<>();
    }
    
    public void push(int v) {
        s.push(v);
        if(m.isEmpty()){
            m.push(v);
        }else{
            if(v<=m.peek())
            m.push(v);
        }
    }
    
    public void pop() {
        if(m.peek().equals(s.peek())){
            m.pop();
        }
        s.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return m.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */