package Leetcode;

public class PalindromeLinkedList {

	public boolean isPalindrome(ListNode head) {
		if(head==null || head.next==null){
			return true;
		}
		//find the middle point
		ListNode fast=head;
		ListNode slow=head;
		while(fast!=null && fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;			
		}
		//if the length is odd
		if(fast!=null){
			slow.next=reverseList(slow.next);
			slow=slow.next;
		}
		//the length is even
		else{
			slow=reverseList(slow);
		}
		//determine if it is palindrome
		while(slow!=null){
			if(head.val!=slow.val){
				return false;
			}
			head=head.next;
			slow=slow.next;
		}
		return true;
	}
	public ListNode reverseList(ListNode head) {
        if(head==null){
        	return null;
        }
        if(head.next==null){
        	return head;
        }
        ListNode temp=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return temp;
    }
}
