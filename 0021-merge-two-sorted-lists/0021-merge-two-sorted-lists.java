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
       ListNode curr=new ListNode(0);
       ListNode curr1= curr;
       while(list1!=null && list2!=null){
        if(list1.val <= list2.val){
          curr1.next =list1;
         list1 =list1.next;
        }
        else{
          curr1.next = list2;
         list2 = list2.next;
        }
        curr1=curr1.next;
        
       } 
       curr1.next= (list1!=null) ? list1 : list2;
       return curr.next;
    }
}