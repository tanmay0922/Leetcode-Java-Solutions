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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode res=new ListNode(0);
        ListNode prev=res;
        ListNode curr=head;
        prev.next=curr;
        
        while(curr!=null){
            while(curr.next != null  && curr.val==curr.next.val){
                curr=curr.next;
            }
            if(prev.next!=curr){
                prev.next=curr.next;
                curr=prev.next;
            }
            else{
                curr=curr.next;
                prev=prev.next;
            }
            
        }
        return res.next;
    }
}