/* return person that everyone knows but knows nobody. */ 
class FindCelebChallenge {
    public static int findCelebrity(int[][] party, int numPeople) {
        int celebrity = -1;
        Stack<Integer> stack = new Stack<Integer>(numPeople);
        //1. eliminate anyone who knows anyone. 
        //2. make sure that everyone knows whoever is left and they know no one
        //push everyone into stack
        int count = 0;
        while(count < numPeople){
            stack.push(count);
            count++;
        }
        //pop two. eliminate whoever knows the other.
        //push the other one back. stop when have < 2 left
        while(!stack.isEmpty()){
            int x = stack.pop();
            if(stack.isEmpty()){
                celebrity = x;
                break; //possible celeb 
            }
            int y = stack.pop();
            if(!knows(y,x,party)){
                stack.push(y); //y doesnt know x so put it back
            }
            if(!knows(x,y,party)){
                stack.push(x); //x doesn't know y. so put it back
            }
        }
        if(celebrity == -1){
            return celebrity;
        }
        for(int i = 0; i < numPeople; i++){
            if(i != celebrity){
                //if celebrity knows i or i doesn't know celeb. Then doesnt meet criteria
                if(knows(celebrity,i, party) || !knows(i,celebrity,party)){
                    return -1;
                }
            }
        }
        return celebrity;

    }
    private static boolean knows(int a, int b, int[][] party){
        return party[a][b] == 1;
    }
}
