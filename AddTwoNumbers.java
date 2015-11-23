package Leetcode;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	if(l1==null&&l2==null){
    		return null;
    	}
    	ListNode head=new ListNode(0);
    	ListNode result=head;
        int c=0;
        while(l1!=null&&l2!=null){
        	int sum=c+l1.val+l2.val;
        	c=sum/10;
        	sum%=10;
        	head.next=new ListNode(sum);
        	l1=l1.next;
        	l2=l2.next;
        	head=head.next;
        }
        if (l1==null)
        	l1=l2;
        while(l1!=null){
        	int sum=c+l1.val;
        	c=sum/10;
        	head.next=new ListNode(sum%10);
        	l1=l1.next;
        	head=head.next;
        }
  
        if(c!=0){
        	head.next=new ListNode(c);
        }
        return result.next;
        
        
    }
}
