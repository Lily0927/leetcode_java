package Leetcode;

public class MergeSortedArray {
	public static void merge(int A[], int m, int B[], int n) {
		int i = m + n - 1;
		int j = m - 1;
		int k = n - 1;
		if (n != 0 && m != 0) {
			for (; i >= 0 && j >= 0 && k >= 0; i--) {
				if (A[j] > B[k]) {
					A[i] = A[j];
					j--;
				} else {
					A[i] = B[k];
					k--;
				}
			}
			if (j < 0) {
				for (; k >= 0; k--)
					A[k] = B[k];
			}

		}
		if (m == 0) {
			for (; i >= 0; i--) {
				A[i] = B[k];
				k--;
			}
		}
	}

}
