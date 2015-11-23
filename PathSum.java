package Leetcode;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {

        if(root==null){
        	return false;
        }
    	int differ=sum-root.val;
    	if(root.left==null&&root.right==null&&differ==0){
    		return true;
    	}
    	return hasPathSum(root.left,differ)||hasPathSum(root.right,differ);
    }
}
