class Solution {
    // Function to reverse the queue.
    public Queue<Integer> reverseQueue(Queue<Integer> queue) {
        
        // code here.
        //two step add queue to stack that make reverse order then again add to queue
        Stack<Integer> st = new Stack<>();
        while(!queue.isEmpty()){
            st.push(queue.remove());//remove from Q and push to S
        }
        //again push back to Q i.e reversal order accesing top of stack 
        while(!st.isEmpty()){
            queue.add(st.pop());
        }
        return queue;
    }
}