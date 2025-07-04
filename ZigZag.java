/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    private ListNode getMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next; //+1
            fast = fast.next.next;//+2
        }
        return slow;
    }

    public void reorderList(ListNode head) {
        //Approaches - Three steps 
        //1- find mid (slow faster approach) i.e first half last node
        //2 - reverse right half (same as pallindrome way)
        //3 - Alternate merge - 1stnode->lastnode->2ndnode->2ndlastnode......

        //1 -- mid
        ListNode mid = getMid(head);
        //2   -- reverse
        ListNode curr = mid.next;//right half starting 
        mid.next = null; //to break connection of half
        ListNode prev = null;
        ListNode next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        //3 -- alternaete merge
        ListNode leftHead = head;
        ListNode rightHead = prev;
        ListNode nextL, nextR;
        while (leftHead != null && rightHead != null) {
            //
            nextL = leftHead.next;
            nextR = rightHead.next;

            leftHead.next = rightHead;
            rightHead.next = nextL;
         // updation
            leftHead = nextL;
            rightHead = nextR;
        }

    }
}