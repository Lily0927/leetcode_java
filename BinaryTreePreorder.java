package Leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorder {

	List<Integer> temp;

	public List<Integer> preorderTraversal2(TreeNode root) {

		temp = new ArrayList<Integer>();
		preorder(root);
		return temp;
	}

	public void preorder(TreeNode root) {
		if (root == null) {
			return;
		}
		temp.add(root.val);
		preorder(root.left);
		preorder(root.right);

	}

}
