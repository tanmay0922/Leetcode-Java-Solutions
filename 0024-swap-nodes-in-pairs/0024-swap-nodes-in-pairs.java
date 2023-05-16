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
    public ListNode swapPairs(ListNode head) {
      ListNode curr=head; //Current node is pointed as head

     ListNode temp=new ListNode(); //temporary node used in swapping
    while(curr !=null && curr.next!=null){ //if the values are not null
       temp.val=curr.val;  //swapping same bubble sort
        curr.val=curr.next.val;
        curr.next.val=temp.val;
       
        
        curr=curr.next.next; //curr value to next 
    }
    return head; // return the value of head
}  
    }
