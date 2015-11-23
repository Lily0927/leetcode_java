package Leetcode;

public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        if(grid==null||grid.length==0||grid[0].length==0){
        	return 0;
        }
        int m=grid.length;
        int n=grid[0].length;
        for(int i=1;i<n;i++){
        	grid[0][i]=grid[0][i-1]+grid[0][i];
        }
        for(int j=1;j<m;j++){
        	grid[j][0]=grid[j-1][0]+grid[j][0];
        }
        for(int i=1;i<m;i++){
        	for(int j=1;j<n;j++){
        		if(grid[i-1][j]<=grid[i][j-1]){
        			grid[i][j]=grid[i-1][j]+grid[i][j];
        		}
        		else{
        			grid[i][j]=grid[i][j-1]+grid[i][j];
        		}
        	}
        }
        return grid[grid.length-1][grid[0].length-1];
    }
}
