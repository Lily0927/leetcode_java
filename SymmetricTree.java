package Leetcode;

import java.util.Stack;

public class SymmetricTree {
public boolean isSymmetric(TreeNode root) {
	if(root==null) return true;
	return isSameTree(root.left,root.right);
    }
public boolean isSameTree(TreeNode p, TreeNode q) {
    if (p==null&&q==null)
    {
        return true;
    }
    if(p==null||q==null)
    {
        return false;
    }
    return(p.val==q.val&&isSameTree(p.left,q.right)&&isSameTree(p.right,q.left)); 
}
public boolean isSymmetric1(TreeNode root){
	Stack<TreeNode> temp1=new Stack<TreeNode>();
	Stack<TreeNode> temp2=new Stack<TreeNode>();
	if(root==null) return true;
	if(root.left==null&&root.right==null){
		return true;
	}
	if(root.left==null||root.right==null){
		return false;
	}
	temp1.push(root.left);
	temp2.push(root.right);	
	
	while(!temp1.isEmpty()){
		TreeNode temp1left=temp1.pop();
		TreeNode temp2right=temp2.pop();
		if(temp1left.val!=temp2right.val){
			return false;
		}
		if(temp1left.left!=null&&temp2right.right!=null){
			temp1.push(temp1left.left);
			temp2.push(temp2right.right);
		}
		else if(temp1left.left==null&&temp2right.right==null){
			
		}
		else return false;
		if (temp1left.right!=null && temp2right.left!=null){
			temp1.push(temp1left.right);
			temp2.push(temp2right.left);
		}else if (temp1left.right==null && temp2right.left==null){
			
		}else 
			return false;
	}
	return true;
}

}
