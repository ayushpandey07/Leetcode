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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) return null;
        PriorityQueue<ListNode> p = new PriorityQueue<>(lists.length, (a,b)->a.val - b.val);
        
        for(ListNode l : lists){
            if(l!=null)p.add(l);
        }
        ListNode n1 = new ListNode(0);
        ListNode n = n1;
        while(!p.isEmpty()){
            ListNode temp = p.poll();
            n.next = temp;;
            n = temp;
            if(temp.next != null)p.add(temp.next);
        }
        return n1.next;
    }
}