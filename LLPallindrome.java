
// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public boolean isPalindrome(ListNode head) {
        // 3 - steps
        // find mid node
        // reverse right half i.e from mid node to null
        // check left half - right half equal or not with traverse

        // step:1 to find mid
        ListNode mid = findMid(head);
        // step:2 to reverse this is same reverse we know only starting from mid i mean
        // we're reversing only right side thats why
        ListNode prev = null;
        ListNode curr = mid; // this chnage only
        ListNode next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next; // these four line totally ratta it for reverse

        }
        // step:3 to take both half see if traverse finish it mean it is pali
        ListNode right = prev; // right half head
        ListNode left = head;
        while (right != null) {
            if (left.val != right.val) {
                return false;
            }
            // else
            right = right.next;
            left = left.next;
        }
        // if without mismatch traverse finish mean it is palli
        return true;

    }

    // helper function to find mid node --- using slow-faster
    // approach(kachuwa-khrayo)
    public ListNode findMid(ListNode head) {
        ListNode slow = head; // +1
        ListNode fast = head; // +2
        // two case to find mid : even and odd - do copy rough to know take even and odd
        // lists
        while (fast != null && fast.next != null) { // for odd and even
            slow = slow.next;// +1
            fast = fast.next.next; // +2
        }
        // after traverse slow is mid see rough copy how
        return slow;

    }
}