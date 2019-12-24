/*implement 2 stacks using only one array.
I used 2 pointers. 1 pointer for the top element in the first stack and another for the top element in the second stack. */

   public TwoStacks(int max_size) {
        this.maxSize = max_size;
        array = (V[]) new Object[max_size];//type casting Object[] to V[]
        this.top1Idx = -1;
        this.top2Idx = maxSize;
    }

    //insert at top of first stack
    public void push1(V value) {
        array[++top1Idx] = value;
    }

    //insert at top of second stack
    public void push2(V value) {
        array[--top2Idx] = value;
    }

    //remove and return value from top of first stack
    public V pop1() {
        return array[top1Idx--];
    }

    //remove and return value from top of second stack
    public V pop2() {
        return array[top2Idx++];
    }
