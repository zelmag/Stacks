class CheckBalancedChallenge {
    public static boolean isBalanced(String exp) {
        Stack<Character> stack = new Stack<>(exp.length());
        for(int i = 0; i < exp.length(); i++){
            char curr = exp.charAt(i);
            if(curr == '(' || curr == '{'|| curr == '['){
                stack.push(curr);
            }else{
                if(curr == ')' && stack.top() == '('){
                    stack.pop();
                }else if(curr == '}' && stack.top() == '{'){
                    stack.pop();
                }else if(curr == ']' && stack.top() == '['){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
