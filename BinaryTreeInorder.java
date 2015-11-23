package Leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorder {
	List<Integer> temp;

	public List<Integer> inorderTraversal(TreeNode root) {
		temp = new ArrayList<Integer>();
		inorder(root);
		return temp;
	}

	public void inorder(TreeNode root) {
		if (root == null) {
			return;
		}
		if (root.left != null) {
			inorder(root.left);
		}
		temp.add(root.val);
		if (root.right != null) {
			inorder(root.right);
		}
	}

	public static List<Integer> inorderTraversal1(TreeNode root) {

		Stack temp1 = new Stack();
		ArrayList<Integer> a = new ArrayList<Integer>();
		if (root == null) {
			return a;
		}
		temp1.push(root);
		while (!temp1.isEmpty()) {
			Object temp2 = temp1.pop();
		
			if(temp2==null){
				continue;
			}
			if (temp2 instanceof Integer) {
				a.add((Integer) temp2);
			} else {
				TreeNode temp3 = (TreeNode) temp2;
				temp1.push(temp3.right);
				temp1.push(new Integer(temp3.val));
				temp1.push(temp3.left);
			}
		}
		return a;
	}

	public static void main(String[] args) {
		TreeNode tree = new TreeNode(1);
		inorderTraversal1(tree);
	}
}
