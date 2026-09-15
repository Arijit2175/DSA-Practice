/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head == null) return null;
        flattenList(head);
        return head;
    }

    public Node flattenList(Node head) {
        Node curr = head;
        Node tail = head;
        while(curr != null) {
            if(curr.child != null) {
                Node next = curr.next;
                Node child = curr.child;
                curr.next = child;
                child.prev = curr;
                curr.child = null;
                Node childTail = flattenList(child);
                if(next != null) {
                    childTail.next = next;
                    next.prev = childTail;
                }
                tail = childTail;
                curr = childTail;
            }
            tail = curr;
            curr = curr.next;
        }
        return tail;
    }
}