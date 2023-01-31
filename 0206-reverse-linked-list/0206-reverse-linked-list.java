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
    public ListNode reverseList(ListNode head) {
        if(head ==null || head.next==null){
            return head;
        }
        //3.pointers prev,present,forward
        ListNode prev=null;//value assigning
        ListNode present = head;
        ListNode forward = head.next;
        
        while(present!=null){
            present.next=prev;
            prev=present;
            present=forward;
            if(forward!=null){
                forward = forward.next;                
            }
        }
        return prev;
    }
}