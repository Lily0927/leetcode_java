package Leetcode;

public class RemoveDuplicateSortedList {
	public ListNode deleteDuplicates(ListNode head) {

		if (head == null) {
			return null;
		}
		ListNode temp;
		temp = new ListNode(head.val);
		ListNode head2=temp;
		while (head.next != null) {
			if (temp.val == head.next.val) {
				head = head.next;
			} else {
				temp.next=new ListNode(head.next.val);
				temp=temp.next;
			}
		}
		return head2;
	}
	public ListNode deleteDuplicates2(ListNode head) {

		if (head == null) {
			return null;
		}
		ListNode temp=head;
		while(temp.next!=null){
			if(temp.val==temp.next.val){
				temp.next=temp.next.next;
			}
			else{
				temp=temp.next;
			}
		}
		return head;
	}
}
		
