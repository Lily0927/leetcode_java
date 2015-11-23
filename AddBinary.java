package Leetcode;

public class AddBinary {
	public String addBinary(String a, String b) {
		StringBuffer a1 = new StringBuffer(a);
		StringBuffer b1 = new StringBuffer(b);
		StringBuffer result = new StringBuffer();
		a1 = a1.reverse();
		b1 = b1.reverse();
		int c = 0;
		int sum = 0;
		if (a1.length() >= b1.length()) {
			for (int i = 0; i < b1.length(); i++) {
				sum = (a1.charAt(i) - '0' + b1.charAt(i) - '0' + c);
				c = sum / 2;
				sum = sum % 2;
				result.append(sum);
			}
			for (int j = b1.length(); j < a1.length(); j++) {
				if (a1.charAt(j) - '0' + c > 1) {
					sum = (a1.charAt(j) - '0' + c) % 2;
					c = (a1.charAt(j) - '0' + c) / 2;
					result.append(sum);
				} else {
					result.append(a1.charAt(j) -'0'+ c);
					c = 0;
				}

			}
			if (c != 0) {
				result.append(c);
			}
		} else {
			for (int i = 0; i < a1.length(); i++) {
				if (a1.charAt(i) - '0' + b1.charAt(i) - '0' + c > 1) {
					sum = (a1.charAt(i) - '0' + b1.charAt(i) - '0' + c) % 2;
					c = (a1.charAt(i) - '0' + b1.charAt(i) - '0' + c) / 2;
				} else {
					sum = (a1.charAt(i) - '0' + b1.charAt(i) - '0' + c);
					c = 0;
				}
				result.append(sum);
			}
			for (int j = a1.length(); j < b1.length(); j++) {
				if (b1.charAt(j) - '0' + c > 1) {
					sum = (b1.charAt(j) - '0' + c) % 2;
					c = (b1.charAt(j) - '0' + c) / 2;
					result.append(sum);
				} else {
					result.append(b1.charAt(j)-'0' + c);
					c = 0;
				}
			}
			if (c != 0) {
				result.append(c);
			}
		}

		return result.reverse().toString();
	}
}
