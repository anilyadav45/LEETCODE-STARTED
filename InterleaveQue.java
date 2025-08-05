import java.util.*;
class Solution {
    public Queue<Integer> rearrangeQueue(Queue<Integer> q) {
        // code here
        Queue<Integer> firsthalf = new LinkedList<>();//to add one half here
        int size = q.size()/2;
        //adding 1st half from q to firsthalf
        for(int i=0; i<size; i++){
            firsthalf.add(q.remove());//remove from q add to fh
        }
        
        while(!firsthalf.isEmpty()){
            q.add(firsthalf.remove());//remove from firsthalf and add to orig que
            q.add(q.remove()); //remove from orig rem que add to itself in rem space  
        }
        return q;
    }
}
public class InterleaveQue  {
    public static void main(String[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
    Solution res = new Solution();
    res.rearrangeQueue(q);
    }
}