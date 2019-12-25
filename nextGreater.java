//ex: 4,6,3,2,8,1 return an array of the next greater element to that element using a stack
// output: 6 8 8 8 -1 -1 
class NextGreaterChallenge {
    public static int[] nextGreaterElement(int[] arr) {
        int[] result = new int[arr.length];
        Stack<Integer> afterMe = new Stack<>(arr.length);
        for(int i = arr.length - 1; i >= 0; i--){
            if(!afterMe.isEmpty()){
                while(!afterMe.isEmpty() && afterMe.top() <= arr[i]){
                    //pop whatever is <= to me from afterMe stack
                    afterMe.pop();
                }
            }
            if(afterMe.isEmpty()){
                result[i] = -1;
            }else{
                result[i] = afterMe.top();
            }
            afterMe.push(arr[i]);
        }
        return result;
    }
}
