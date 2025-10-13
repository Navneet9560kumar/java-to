package Stack.Queqe.QuestiononQue;

import java.util.Queue;

public class implementStackusingQueues_03 {

      Queue<Integer> q = new LinkedList<>();
        public MyStack() {
        
    }
    
    public void push(int x) {
        if(q.size()==0) q.add(x);
        else{
            q.add(x);
            for(int i=1;i<=q.size()-1;i++){
                q.add(q.remove());
            }
        }
    }

    public int pop() {
        return q.remove();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }

}

