class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr=head,prev=null,temp=head,fix;
        if(head==null || head.next==null)
            return head;
        ListNode newhead=reverseList(head.next);
        ListNode headnext=head.next;
        headnext.next=head;
        head.next=null;
        return newhead;
    }
}