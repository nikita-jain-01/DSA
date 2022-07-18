public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA,temp2=headB,res=null;
        int k=0,m=0,n=0;
        while(temp1!=null){
            m++;
            temp1=temp1.next;
        }
        while(temp2!=null){
            n++;
            temp2=temp2.next;
        }
        temp1=headA;temp2=headB;
        if(m<n){
            while(m!=n){
                temp2=temp2.next;
                n--;
            }
        }
        else if(n<m){
            while(m!=n){
                temp1=temp1.next;
                m--;
            }
        }
        while(temp1!=temp2){
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1;
    }
}