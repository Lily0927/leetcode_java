package Leetcode;

public class SearchInsertPosition {
	public static int searchInsert(int[] A, int target) {
		int index;
		for (index = 0; index < A.length; index++) {
			if (A[index] >= target) {
				return index;
			}
		}
		return A.length;

	}
	public static void main(String[] args){
		int[] A={0,1,2,3,4};
		System.out.print(searchInsert(A,5));
		
	}

}
