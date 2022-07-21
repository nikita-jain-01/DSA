class Solution {
    public ListNode middleNode(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode temp=head,prev=head.next;
        int count=0,i=1;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        temp=head;
        count=count/2;
        while(i<=count){
            temp=temp.next;
            i++;
        }
        head=temp;
        return head;
    }
}