package Leetcode;

public class SortList {
	public static void main(String[] args){
		ListNode test=new ListNode(2);
		test.next=new ListNode(1);
		sortList(test);
		
	}
    public static ListNode sortList(ListNode head) {
    	if(head==null||head.next==null){
        	return head;
        }
        ListNode mid=findMiddle(head);
        
        ListNode right=sortList(mid.next);
        mid.next=null;
        ListNode left=sortList(head);
        return merge(left,right);
    }
    private static ListNode findMiddle(ListNode head){
    	ListNode slow=head;
    	ListNode fast=head.next;
    	while(fast!=null&&fast.next!=null){
    		fast=fast.next.next;
    		slow=slow.next;
    	}
    	return slow;
    }
    private static ListNode merge(ListNode head1,ListNode head2){
    	ListNode result=new ListNode(0);
    	ListNode temp=result;
    	while(head1!=null&&head2!=null){
    		if(head1.val<=head2.val){
    			temp.next=head1;
    			head1=head1.next;
    		}
    		else{
    			temp.next=head2;
    			head2=head2.next;
    		}
    		temp=temp.next;
    	}
    	if(head1!=null){
    		temp.next=head1;
    	}
    	else{
    		temp.next=head2;
    	}
    	return result.next;
    }
    

}
