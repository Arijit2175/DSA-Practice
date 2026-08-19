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
    public ListNode partition(ListNode head, int x) {
        ListNode lessDummy = new ListNode(0);
        ListNode greatDummy = new ListNode(0);
        ListNode less = lessDummy;
        ListNode greater = greatDummy;
        ListNode curr = head;
        while(curr != null) {
            if(curr.val < x) {
                less.next = curr;
                less = less.next;
            } 
            else {
                greater.next = curr;
                greater = greater.next;
            }
            curr = curr.next;
        }
        less.next = greatDummy.next;
        greater.next = null;
        return lessDummy.next;
    }
}