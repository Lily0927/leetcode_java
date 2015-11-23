package Leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> result=new  ArrayList<ArrayList<Integer>>();
        if(root==null){
        	return result;
        }
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
        	ArrayList<Integer> level=new ArrayList<Integer>();
        	int size=queue.size();
        	for(int i=0;i<size;i++){
        		TreeNode head=queue.poll();
        		level.add(head.val);
        		if(head.left!=null){
        			queue.add(head.left);
        		}
        		if(head.right!=null){
        			queue.add(head.right);
        		}
        	}
        	result.add(level);
        }
        return result;

    }
}
