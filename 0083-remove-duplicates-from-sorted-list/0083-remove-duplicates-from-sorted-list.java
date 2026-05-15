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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode New=head;
        
        while(New.next!=null){
            if(New.val==New.next.val){
                New.next=New.next.next;
            }else{
                New=New.next;
            }
        }
        return head;
    }
}