class EvaluatePostfixChallenge {
    public static int evaluatePostFix(String expression) {
        Stack<Integer> st = new Stack<Integer>(expression.length());
        for(int i = 0; i < expression.length(); i++){
            char curr = expression.charAt(i);
            if(!Character.isDigit(curr)){
                Integer sec = st.pop();
                Integer first = st.pop();
                if(curr == '*'){
                    st.push(first*sec);
                }else if(curr == '+'){
                    st.push(first+sec);
                }else if(curr == '-'){
                    st.push(first-sec);
                }else if(curr == '/'){
                    st.push(first/sec);
                }
            }else{
                st.push(Character.getNumericValue(curr));
            }
        }
        return st.pop();
    }
}
