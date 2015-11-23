package Leetcode;

import java.util.Stack;

public class minStack {
	Stack<Integer> sta=new Stack<Integer>();
	Stack<Integer> minsta=new Stack<Integer>();
    public void push(int x) {
       sta.push(x);
       if(minsta.isEmpty()||x<=minsta.peek()){
    	   minsta.push(x);
       }
    }
    public void pop() {       
        if(sta.peek().equals(minsta.peek())){
        	minsta.pop();
        }
        sta.pop();
    }

    public int top() {
        return sta.peek();
    }

    public int getMin() {
        return minsta.peek();
    }
}
//易错地方， 1 push x<=minsta.peek() 注意有等于的情况
// 2， 因为是object， 所以要用equals
