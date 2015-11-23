package Leetcode;

public class stringtoint {
	public int atoi(String str) {
		final int max = Integer.MAX_VALUE;
		final int min = Integer.MIN_VALUE;
		if (str == null) {
			return 0;
		}
		str = str.trim();
		if (str.length() == 0) {
			return 0;
		}
		int sign = 1;
		int i = 0;
		if (str.charAt(0) == '+') {
			sign = 1;
			i++;
		}
		if (str.charAt(0) == '-') {
			sign = -1;
			i++;
		}
		long temp = 0;
		for (; i < str.length(); i++) {
			if (str.charAt(i) < '0' || str.charAt(i) > '9') {
				break;
			}
			temp = temp * 10 + str.charAt(i) - '0';
			if (temp > max && sign == 1) {
				return max;
			}
		}
		if (temp * sign > max) {
			return max;
		}
		if (temp * sign < min) {
			return min;
		}
		return (int) temp * sign;
	}
}
