package Leetcode;

public class ConvertSortedArraytoBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] num) {
        if(num==null){
        	return null;
        }
        return buildTree(num,0,num.length-1);
    }
    public TreeNode buildTree(int[] num,int start, int end){
    	if(start>end){
    		return null;
    	}
    	TreeNode result=new TreeNode(num[(start+end)/2]);
    	result.left=buildTree(num,start,(start+end)/2-1);
    	result.right=buildTree(num,(start+end)/2+1,end);
    	return result;
    }
}
