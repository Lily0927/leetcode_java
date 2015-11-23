package Leetcode;

public class IntersectionofTwoLinkedLists {
	public static void main(String[] args) {
		int a[] = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21 };
		int b[] = { 2 };
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(3);
		ListNode l2 = new ListNode(2);
		getIntersectionNode(l1, l2);
	}

	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode result = new ListNode(0);
		ListNode tempa=headA;
		ListNode tempb=headB;
		if (headA == null || headB == null) {
			return null;
		}
		int a = 1, b = 1;
		while (headA.next != null) {
			a++;
			headA = headA.next;
		}
		while (headB.next != null) {
			b++;
			headB = headB.next;
		}
		int temp = 0;
		if (a >= b) {
			temp = a - b;
			while (temp != 0) {
				tempa = tempa.next;
				temp--;
			}
		} else {
			temp = b - a;
			while (temp != 0) {
				tempb = tempb.next;
				temp--;
			}
		}
		while (tempa.next != null) {
			if (tempa == tempb) {
				result = tempa;
				break;
			} else {
				tempa = tempa.next;
				tempb = tempb.next;
			}
		}
		return result;
	}
}
