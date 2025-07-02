public class Solution {
    public boolean hasCycle(ListNode head) {
       //we use slow-fast approach 
       ListNode slow = head;
       ListNode fast = head;
       //main point when we find both meet at same node it mean cycle is there 
       while(fast != null && fast.next != null){
        slow = slow.next; //+1
        fast = fast.next.next; //+2
        if(slow == fast){
            return true; // in betn traversing we get both same when there's is cycle
        }
       } 
        return false;
    }
}