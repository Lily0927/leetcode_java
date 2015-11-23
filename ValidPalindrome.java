package Leetcode;

public class ValidPalindrome {
	public static boolean isPalindrome(String s) {

		String temp = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		String s2=new StringBuffer(temp).reverse().toString();
		return s2.equals(temp);
	}

	public static void main(String[] args) {
		String a = "1a2";
		isPalindrome(a);
	}
}
