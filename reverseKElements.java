/*use a stack to reverse k first elements in a queue */ 
public static <V> void reverseK(Queue<V> queue, int k) {
        Stack<V> helpS = new Stack<>(k);
        while(!helpS.isFull()){
            helpS.push(queue.dequeue());
        }
        while(!helpS.isEmpty()){
            queue.enqueue(helpS.pop());
        }
        int sizeOfQ = queue.getCurrentSize();
        for(int i = 0; i < sizeOfQ - k; i++){
            queue.enqueue(queue.dequeue());
        }
}
   
