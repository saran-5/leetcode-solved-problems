class MyQueue {
    Stack<Integer> s= new Stack<>();
    
    
    public void push(int x) {
        s.push(x);
    }
    
    public int pop() {
        return s.remove(0);
        
    }
    
    public int peek() {
       return s.get(0);
    }
    
    public boolean empty() {
       return s.isEmpty();
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