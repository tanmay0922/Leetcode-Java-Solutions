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
//Equi-directional Two Pointer Approach.
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null) 
            return null;
        ListNode fast=head.next.next; //pointed as the fast one
        ListNode slow=head;  //slow runner
        while(fast!=null &&fast.next!=null){ // if both are not equal to null
            fast=fast.next.next; //fast runner pointed to one place ahead slow runner
            slow=slow.next; //slow one pointed one behind the fast runner
        } 
        slow.next=slow.next.next; //slow one pointed to fast(ending)
        return head;
    }
}