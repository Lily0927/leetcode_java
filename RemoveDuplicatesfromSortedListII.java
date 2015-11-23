package Leetcode;

public class RemoveDuplicatesfromSortedListII {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null&&head.next==null){
        	return null;
        }
        ListNode temp=new ListNode(0);
        temp.next=head;
        head=temp;
        while(head.next!=null&&head.next.next!=null){
        	if(head.next.val==head.next.next.val){
        		int val=head.next.val;
        	    while(head.next!=null&&val==head.next.val){
        	    	head.next=head.next.next;
        	    }
        	
        	}
        	else{
        		head=head.next;
        	}
        }
        return temp.next;
    }
}
