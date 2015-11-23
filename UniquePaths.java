package Leetcode;

public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] grid=new int[100][100];
        for(int i=0;i<m;i++){
        	grid[i][0]=1;
        }
        for(int j=0;j<n;j++){
        	grid[0][j]=1;
        }
        for(int i=1;i<m;i++){
        	for(int j=1;j<n;j++){
        		grid[j][i]=grid[j-1][i]+grid[j][i-1];
        	}
        }
        
        return grid[m-1][n-1];
    }
}
