//get min in constant time using a minStack 

public class MinStack {
    int maxSize;
    Stack<Integer> stack;
    Stack<Integer> minS;
    //constructor
    public MinStack(int maxSize) {
        // Write -- Your -- Code
        this.maxSize = maxSize;
        stack = new Stack<Integer>(maxSize);
        minS = new Stack<Integer>(maxSize);
    }
    //removes and returns value from stack
    public Integer pop(){
        // Write -- Your -- Code
        if(stack.top() == minS.top()){
            minS.pop();
        }
        return stack.pop();

    }
    //pushes value into the stack
    public void push(Integer value){
        stack.push(value);
        if(minS.isEmpty()){
            minS.push(value);
        }else{
           if(value < minS.top()){
               minS.push(value); //keep track of current min
           }
        }
    }
    //returns minimum value in O(1)
    public int min(){
        return minS.top();
    }
}
