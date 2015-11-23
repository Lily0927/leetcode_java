package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class Subsets {
	public static ArrayList<ArrayList<Integer>> subsets(int[] S) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if (S == null || S.length == 0) {
			return result;
		}
		Arrays.sort(S);
		result.add(new ArrayList<Integer>());

		for (int i = 0; i < S.length; i++) {
			int lengt = result.size();
			for (int j = 0; j < lengt; j++) {
				ArrayList<Integer> ad = new ArrayList<Integer>(result.get(j));
				ad.add(i);
				result.add(ad);
			}
		}
		return result;
	}
	public static void main(String[] args){
		int[] S={1,2,3};
		subsets(S);
	}
}
