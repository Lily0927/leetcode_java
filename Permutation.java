package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
	public static int DEP;
	public static int mark[];
	public static ArrayList<Integer> b;
	public static ArrayList<ArrayList<Integer>> arr;
	public static int[] NUM;
	public ArrayList<ArrayList<Integer>> permute(int[] nums) {
		DEP = nums.length;
		mark = new int[DEP];
		b = new ArrayList<Integer>(DEP);
		for (int i = 0; i < DEP; i++)
			b.add(0);
		arr = new ArrayList<ArrayList<Integer>>();
		NUM = nums;
		dfs(0);
		return arr;

	}

	public static void dfs(int dep) {
		if (dep == DEP) {
			arr.add(new ArrayList<Integer>(b));
			return;
		}
		for (int i = 0; i < DEP; i++) {
			if (mark[i] == 0) {
				mark[i] = 1;
				b.set(dep, NUM[i]);
				dfs(dep + 1);
				mark[i] = 0;
			}
		}
	}
}
