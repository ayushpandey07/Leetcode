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
    public boolean isPalindrome(ListNode head) {
        if(head == null) return true;
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        // 1 -> 2 -> 3
        //      s    f
        if (fast != null) { // odd nodes
            slow = slow.next;
        }
        ListNode end = reverseWithNew(slow);
        slow = head;
        while(end != null){
            if(end.val != slow.val) return false;
            slow = slow.next;
            end = end.next;
        }
        
        return true;
    }
    
    private ListNode reverseWithNew(ListNode head){
        ListNode pre = null;
        while(head != null){
            ListNode curr = new ListNode(head.val);
            curr.next = pre;
            pre = curr;
            head = head.next;
        }
        return pre;
    }
}