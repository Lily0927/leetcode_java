package Leetcode;

import java.util.Stack;


public class BinarySearchTreeIterator {
	private Stack<TreeNode> stack;
	public BinarySearchTreeIterator(TreeNode root) {
		stack=new Stack<TreeNode>();
		TreeNode curr=root;
		while(curr!=null){
			stack.push(curr);
			if(curr.left!=null){
				curr=curr.left;
			}
			else{
				break;
			}
		}
	}

	/** @return whether we have a next smallest number */
	public boolean hasNext() {
		return !stack.isEmpty();
	}

	/** @return the next smallest number */
	public int next() {
		TreeNode node=stack.pop();
		TreeNode curr=node;
		curr=curr.right;
		while(curr!=null){
			stack.push(curr);
			if(curr.left!=null){
				curr=curr.left;
			}
			else{
				break;
			}
		}
		return node.val;
	}
}
