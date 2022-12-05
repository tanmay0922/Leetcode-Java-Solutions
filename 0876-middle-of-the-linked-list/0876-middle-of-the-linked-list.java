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
    public ListNode middleNode(ListNode head) {
        //used two pointer approach.
        ListNode heir,tor; 
        heir=tor=head;
        while(heir!=null && heir.next!=null)
        {
            heir=heir.next.next;
            tor=tor.next;
    }
    return tor;
    }
}