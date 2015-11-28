package Leetcode;

public class NumberofIslands {
	private static int m;
	private static  int n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] grid={{'1','1'}};
		System.out.println(numIslands(grid));
	}

	public static int numIslands(char[][] grid) {
		if(grid.length==0){
			return 0;
		}
		int island=0;
		m=grid.length;
		n=grid[0].length;
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(grid[i][j]=='1'){
					dfs(grid,i,j);
					island++;
				}
			}
		}
		return island;
	}
	public static void dfs(char[][] grid, int i,int j){
		if(i<0||j<0||i>=m||j>=n||grid[i][j]!='1'){
			return;
		}
		grid[i][j]='x';
		dfs(grid,i+1,j);
		dfs(grid,i,j+1);
		dfs(grid,i-1,j);
		dfs(grid,i,j-1);
		
	}
}
