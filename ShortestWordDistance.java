package Leetcode;

import java.util.ArrayList;

public class ShortestWordDistance {
	public int shortestDistance(String[] words, String word1, String word2) {
		ArrayList<Integer> number1 = new ArrayList<Integer>();
		ArrayList<Integer> number2 = new ArrayList<Integer>();
		for (int i = 0; i < words.length; i++) {
			if (words[i].equals(word1)) {
				number1.add(i);
			} else if (words[i].equals(word2)) {
				number2.add(i);
			}
		}
		Integer [] numberArr1 =  number1.toArray(new Integer[number1.size()]);
		Integer [] numberArr2 =  number2.toArray(new Integer[number2.size()]);
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < numberArr1.length; i++) {
			for (int j = 0; j < numberArr2.length; j++) {
				if (Math.abs(numberArr1[i] - numberArr2[j]) < min) {
					min = Math.abs(numberArr1[i] - numberArr2[j]);
				}
			}
		}
		return min;
	}

	public static void main(String[] args) {
		ShortestWordDistance solution = new ShortestWordDistance();
		String[] words = { "practice", "makes", "perfect", "coding", "makes" };
		int min = solution.shortestDistance(words, "makes", "coding");
		System.out.println(min);
	}
}
