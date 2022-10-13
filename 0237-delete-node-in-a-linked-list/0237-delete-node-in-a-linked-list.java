/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
//copy the contents to the next node and delete the node
class Solution {
    public void deleteNode(ListNode node) {
         ListNode next=node.next; //next node
         node.val=next.val; //val copied to next node
        node.next=next.next;  //Pointed to next to next node(null one)
    }
}