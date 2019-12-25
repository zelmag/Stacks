class SortValuesChallenge {
    public static void sortStack(Stack<Integer> stack) {
       //need 1 other aux
       //if tempValue <= push to aux, else, keep popping until find right place to put in
       Stack<Integer> aux = new Stack<Integer>(stack.getMaxSize());
       while(!stack.isEmpty()){
           aux.push(stack.pop());
       }
       while(!aux.isEmpty()){
           Integer temp = aux.pop();
           while(!(stack.isEmpty() || stack.top() >= temp)){
               aux.push(stack.pop());
           }
           stack.push(temp);
       }
    }
}
