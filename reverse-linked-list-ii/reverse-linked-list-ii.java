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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode pre = null;
        ListNode curr = head;
        ListNode next = null;
        while( left > 1){
            pre = curr;
            curr = curr.next;
            left--;
            right--;
        }
        ListNode con = pre;
        ListNode tail = curr;
        for(int i = left ; i <= right ; i++){
            next  = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        tail.next = curr;
        if(con != null)con.next = pre;
        else head = pre;
        
    
    return head;
    }
}