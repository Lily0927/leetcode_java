package Leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostorder {
public List<Integer> postorderTraversal(TreeNode root) {
        Stack temp1=new Stack();
        ArrayList<Integer> a = new ArrayList<Integer>();
        if(root==null) return a;
        temp1.push(root);
        while(!temp1.isEmpty()){
        	Object temp2=temp1.pop();
        	if(temp2==null){
        		continue;
        	}
        	if(temp2 instanceof Integer){
        		a.add((Integer) temp2);
        	}
        	else{
        		TreeNode temp3=(TreeNode) temp2;
        	   temp1.push(temp3.left);
        	   temp1.push(temp3.right);
        	   temp1.push(temp3.val);
        	}
        	
        }
        return a;        
    }
}
