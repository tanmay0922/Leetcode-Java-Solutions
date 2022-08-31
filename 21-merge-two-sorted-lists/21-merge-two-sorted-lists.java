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
public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
if(list1==null)
return list2;
else if(list2==null)
return list1;
ListNode headl1,headl2,res,temp;
temp=res=null;
//int flag=0;
if(list1!=null && list2!=null)
{

         if(list1.val<=list2.val)
         {
             res=temp=list1;
             list1=list1.next;
             res.next=null;
         }
         else
         {
             res=temp=list2;
             list2=list2.next;
             res.next=null;
         }
 }
 while(list1!=null && list2!=null)
 {
     //System.out.println(list1.val+"---"+list2.val);
         if(list1.val<=list2.val)
         {
            temp.next=list1;
             temp=temp.next;
             list1=list1.next;
             temp.next=null;
         }
         else
         {
             temp.next=list2;
             temp=temp.next;
             list2=list2.next;
             temp.next=null;
         }
 }
 if(list1!=null)
     temp.next=list1;
 else if(list2!=null)
     temp.next=list2;
 return res;
}
}