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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode SortedLL = new ListNode(-1);
        ListNode temp = SortedLL;
        //merge both half
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                temp.next = list1;
                list1 = list1.next;
                temp = temp.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
                temp = temp.next;
            }
        }
        //for some rem unsorted 
        //for list1
        while (list1 != null) {
            temp.next = list1;
            list1 = list1.next;
            temp = temp.next;
        }
        //for list2
        while (list2 != null) {
            temp.next = list2;
            list2 = list2.next;
            temp = temp.next;
        }
        return SortedLL.next;
    }
}