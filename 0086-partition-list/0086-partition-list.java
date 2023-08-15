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
    public ListNode partition(ListNode head, int x) {
        //Base case
       /* if(head==null||head.next==null)
            return head;
        ListNode start=null,fresh,prev=null;
        for(ListNode ptr=head;ptr!=null;ptr=ptr.next)
        {
            if(ptr.val<x)
            {
                fresh=new ListNode(ptr.val);
                if(start==null)
                    start=fresh;
                else
                    prev.next=fresh;
                prev=fresh;
            }
        }
        for(ListNode ptr=head;ptr!=null;ptr=ptr.next)
        {
            if(ptr.val>=x)
            {
                fresh=new ListNode(ptr.val);
                if(start==null)
                    start=fresh;
                else
                    prev.next=fresh;
                prev=fresh;
            }
        }
        return start;
    }
}*/
        ListNode small=new ListNode(0);
        ListNode higher=new ListNode(0);
        ListNode smallHead=small;
        ListNode higherHead=higher;
        while(head!=null){
            if(head.val<x){
                //small List
                smallHead.next=head;
                smallHead=smallHead.next;   
        }
        else
           {
                 //higher List
                higherHead.next=head;
                higherHead=higherHead.next;
            }
        head=head.next;
    }
    higherHead.next=null;
    smallHead.next=higher.next;
    return small.next;
}
}

    
        
        