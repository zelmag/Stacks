class QueueWithStack <V> {
    Stack<V> st;
    public QueueWithStack(int maxSize){
        // Write -- Your -- Code
        st = new Stack<>(maxSize);
    }
  
    public void enqueue(V value){
      	// Write -- Your -- Code 
        st.push(value);
    }
    public V dequeue(){
		Stack<V> aux = new Stack<V>();
        while(!st.isEmpty()){
            aux.push(st.pop());
        }
        V removed = aux.pop(); //dequeue the "bottom element" of st
        while(!aux.isEmpty()){
            st.push(aux.pop());
        }
        return removed;
    }
    public boolean isEmpty(){
        return st.isEmpty();
    }
}
