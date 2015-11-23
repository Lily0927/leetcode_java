package Leetcode;

public class RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode record=new ListNode(0);
        record.next=head;
        ListNode node=record;
        for(int i=0;i<n;i++){
        	if(head==null){
        		return null;
        	}
            head=head.next;
        }
        while(head!=null){
        	head=head.next;
        	node=node.next;
        	
        }
        node.next=node.next.next;
        return record.next;
    }
}
