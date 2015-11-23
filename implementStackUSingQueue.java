package Leetcode;

import java.util.LinkedList;

class MyStack {
    // Push element x onto stack.
	LinkedList<Integer> queue1=new LinkedList<Integer>();
	LinkedList<Integer> queue2=new LinkedList<Integer>();
    public void push(int x) {
        while(queue1.size()>0){
        	queue2.offer(queue1.poll());
        }
        queue1.offer(x);
        while(queue2.size()>0){
        	queue1.offer(queue2.poll());
        }
    }

    // Removes the element on top of the stack.
    public void pop() {
        queue1.poll();
    }

    // Get the top element.
    public int top() {
        return queue1.get(0);
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return queue1.isEmpty();
    }
}