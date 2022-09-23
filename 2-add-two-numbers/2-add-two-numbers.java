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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      int count = 1; //counter variable
        int carry = 0; //carry is stored
        ListNode resultNode = new ListNode(); //A node is being created
        ListNode nextNode = resultNode; //result node to store the sum
        while(l1 != null || l2 != null || carry != 0) { //if the l1,l2,carry all are zero then sum is equal to carry (carry=1)
            int sum = carry;
            if(l1 != null){ //if only l1 is null then value of l1 is added to the sum
               sum += l1.val;
                l1 = l1.next; //next value is pointed
            } 
                
            if(l2 != null) { //if only l2 is null  then same as l1 procedure as followed above
                sum += l2.val;
                l2 = l2.next;
            } 
            
            if(sum >9) { //like we have any number between 0-9 digits we always have one digit number but sum beyond 9 requires 2 digit
                carry = 1;
                nextNode.val = sum - 10; //mathematics being applied here(19-10=9) so 9 will be written down and 1 being carried
            } else {
                carry = 0; //carry is 0 then no need of subtracting with 10
                nextNode.val = sum;
            }
            if(l1 != null || l2 != null || carry != 0) {
                nextNode.next = new ListNode();
                nextNode = nextNode.next;
            }
        }
        return resultNode;
    }
}    
    
