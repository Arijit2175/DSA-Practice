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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int total = 0;
        ListNode temp = head;
        while(temp != null) {
            total++;
            temp = temp.next;
        }
        int partSize = total / k;
        int extra = total % k;
        ListNode[] res = new ListNode[k];
        ListNode curr = head;
        for(int i = 0; i < k; i++) {
            int size = partSize;
            if(extra > 0) {
                size++;
                extra--;
            }
            if(size == 0) {
                res[i] = null;
                continue;
            }
            res[i] = curr;
        for(int j = 1; j < size; j++) curr = curr.next;
        ListNode next = curr.next;
        curr.next = null;
        curr = next; 
        }
        return res;
    }
}