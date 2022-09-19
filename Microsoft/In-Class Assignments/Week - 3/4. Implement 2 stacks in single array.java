class MyQueue {
    private Stack<Integer> x;
    private Stack<Integer> y;
    public MyQueue() {
        x=new Stack<>();
        y=new Stack<>();
    }
    
    public void push(int a) {
        x.push(a);
    }
    
    public int pop() {
        if(y.isEmpty())
        {
            while(!x.isEmpty())
            {
                y.push(x.pop());
            }
        }
        return y.pop();
    }
    
    public int peek() {
        if(y.isEmpty())
        {
            while(!x.isEmpty())
            {
                y.push(x.pop());
            }
        }
        return y.peek();
    }
    
    public boolean empty() {
        return x.isEmpty() && y.isEmpty();
    }
}
