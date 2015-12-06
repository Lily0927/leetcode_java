package Leetcode;

public class Searcha2DMatrixII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null||matrix.length==0||matrix[0].length==0){
        	return false;
        }
        int n=matrix.length;
        int m=matrix[0].length;
        int i=0;
        int j=m-1;
        while(i<n&&j>=0){
        	if(matrix[i][j]==target){
        		return true;
        	}else if(matrix[i][j]>target){
        		j--;
        	}else{
        		i++;
        	}
        }
        return false;
        
    }
}
