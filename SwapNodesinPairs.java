package Leetcode;

public class SwapNodesinPairs {
    public ListNode swapPairs(ListNode head) {
    	
        if(head==null||head.next==null){
        	return head;
        }
        ListNode temp=new ListNode(0);
        temp.next=head;
        head=temp;
        while(temp.next!=null&&temp.next.next!=null){
        	ListNode sign=temp.next.next.next;
        	temp.next.next.next=temp.next.next;
        	temp.next=temp.next.next;
        	temp.next.next.next=sign;
        	temp=temp.next.next;        	
        }
        return head.next;
    }
}
