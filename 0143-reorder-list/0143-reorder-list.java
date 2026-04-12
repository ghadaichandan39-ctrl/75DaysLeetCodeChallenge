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
      if(head==null || head.next==null){
        return;
      }
      ListNode slow=head;
      ListNode fast=head;
      while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
      }
      ListNode pre=null;
      ListNode curr=slow.next;
      slow.next=null;
      while(curr!=null){
        ListNode next=curr.next;
        curr.next=pre;
        pre=curr;
        curr=next;
      }
      ListNode first=head;
      ListNode second=pre;
      while(second!=null){
        ListNode firsttemp=first.next;
        ListNode secondtemp=second.next;

        first.next=second;
        second.next=firsttemp;

        first=firsttemp;
        second=secondtemp;
      }
    }
}