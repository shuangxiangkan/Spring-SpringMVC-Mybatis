package tiger;

import java.util.*;

class ListNode {
    int val;
    ListNode next = null;
    public ListNode(int val){
        this.val=val;
    }
}


public class Solution {
    public static void main(String[] args) {
        //{12,13,14,15,16,17,18}
        Solution s=new Solution();
        ListNode node12=new ListNode(12);
        ListNode node13=new ListNode(13);
        ListNode node14=new ListNode(14);
        ListNode node15=new ListNode(15);
        ListNode node16=new ListNode(16);
        ListNode node17=new ListNode(17);
        ListNode node18=new ListNode(18);
        node12.next=node13;
        node13.next=node14;
        node14.next=node15;
        node15.next=node16;
        node16.next=node17;
        node17.next=node18;
        s.lineUp(node12);

    }
    /**
     * 排队
     * @param head ListNode类 头结点
     * @return ListNode类
     */
    public ListNode lineUp (ListNode head) {
        if(head==null)
            return null;
        if(head.next==null)
            return head;
        // write code here
        ListNode odd=head;
        ListNode even=head.next;
        ListNode h1=odd;
        ListNode h2=even;
        head=head.next.next;
        int i=3;
        while (head!=null){
            ListNode temp;
            temp=head.next;
            if(i%2==0){
                h2.next=head;
                h2=h2.next;
                h2.next=null;
                head=temp;
            }else{
                h1.next=head;
                h1=h1.next;
                h1.next=null;
                head=temp;
            }
            i++;
        }
        h1.next=even;
        return odd;
    }
}