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
    public ListNode reverseKGroup(ListNode head, int k) {
       //base case
        if(head == null) {
            return null;
        }
        
        int count = 0;
        ListNode temp = head;
        
        while(temp!=null) {
            temp = temp.next;
            count++;
        }
        
        if(count<k)
            return head;
        
        ListNode prev = null;
        ListNode next = null;
        ListNode curr = head;
        int n = 0;
        
        while(curr!=null && n<k) {
           next = curr.next;
           curr.next = prev;
           prev = curr;
           curr = next; 
           n++; 
        }
        
        if(next!=null) {
        head.next = reverseKGroup(next,k);
        }
        
        return prev;
    }
 
    }
