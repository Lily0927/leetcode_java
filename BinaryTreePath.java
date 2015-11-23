package Leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreePath {
	ArrayList<String> path=new ArrayList<String>();
	public List<String> binaryTreePaths(TreeNode root) {
		if(root==null){
			return path;
		}
		//DFS(root,""+root.val);
		BFS(root,""+root.val);
		return path;
		
	}
	public void DFS(TreeNode root,String singlePath){
		if(root.left==null &&root.right==null){
			path.add(singlePath);
		}
		if(root.left!=null){
			DFS(root.left,singlePath+"->"+root.left.val);
		}
		if(root.right!=null){
			DFS(root.right,singlePath+"->"+root.right.val);
		}
	}
	public void BFS(TreeNode root, String singlePath){
		Queue que=new LinkedList();
		que.add(root);
		while(que.size()!=0){
			TreeNode temp=(TreeNode) que.poll();
			if(temp.left==null && temp.right==null){
				path.add(singlePath);
			}
			if(temp.left!=null){
				que.add(temp.left);
				singlePath+="->"+temp.left.val;
			}
			if(temp.right!=null){
				que.add(temp.right);
				singlePath+="->"+temp.right.val;
			}
		}
		
	}
	public static void main(String[] args){
		TreeNode root=new TreeNode(1);
		BinaryTreePath btp=new BinaryTreePath();
		btp.binaryTreePaths(root);
	}
}
