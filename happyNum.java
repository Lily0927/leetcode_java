package Leetcode;

import java.util.HashSet;

public class happyNum {
	public boolean isHappy(int n) {
		HashSet<Integer> store = new HashSet<Integer>();
		while (true) {
			int sum = square(n);
			if (sum == 1) {
				return true;
			}
			if (store.contains(sum)) {
				return false;
			}
			store.add(sum);
			n=sum;
		}
	}

	public int square(int n) {
		int sum = 0;
		while (n > 0) {
			sum = (n % 10) * (n % 10);
			n = n / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		happyNum temp=new happyNum();
		System.out.print(temp.isHappy(2));
	}

}
