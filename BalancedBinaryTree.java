package Leetcode;

public class BalancedBinaryTree {
public boolean isBalanced(TreeNode root) {
        if(root==null){
        	return true;
        }
        if(height(root)==-1){
        	return false;
        }
        return true;
    }
public int height(TreeNode root){
	if(root==null){
		return 0;
	}
	int left= height(root.left);
	int right=height(root.right);
	if (left == -1 || right == -1)
		return -1;
	if(right-left>1||left-right>1){
		return -1;
	}
	return Math.max(left,right)+1;
}
}
