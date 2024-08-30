class MinStack {
   private ArrayList<Integer> List;
   private ArrayList<Integer> getMinList;
   private int size;

    public MinStack() {
        List= new ArrayList<>();
        getMinList= new ArrayList<>();
        size=0;
    }
    
    public void push(int val) {
        List.add(val);
        if(size==0){
            
            getMinList.add(val);
        }
        else {
            
            getMinList.add(Math.min(val, getMinList.get(size-1 )));
        }
        size++;
    }
    
    public void pop() {
        if(size>0){
            getMinList.remove(size-1);
            List.remove(size-1);
            size--;
        }
        
        

    }
    
    public int top() {
        if(size>0){
            return List.get(size-1);
        }
        return -1;
    }
    
    public int getMin() {
        if(size>0){
            return getMinList.get(size-1);
        }
        return -1;
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