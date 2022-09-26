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
    public void reorderList(ListNode head) {
       List<ListNode> list = new ArrayList<>();
    list.add(head);
	
    ListNode ln = head;
    while((ln = ln.next) != null) list.add(ln); //fill the list with the nodes
    
    int pL=0, pR = list.size()-1; //declare left and right pointer
    ListNode lastR = null;  //(lastRightNode) to also connect n-0 with 1; n-1 with 2...
    
    while(pL <= pR){ //
        if(lastR != null) lastR.next = list.get(pL); // if it`s not the first left node, then connect f.e. n-0 with 1
        list.get(pL++).next = lastR = list.get(pR--);// connect 0 and n-0; 1 and n-1...   also update lastR
    }
    lastR.next = null; // to avoid an infinity loop
} 
}