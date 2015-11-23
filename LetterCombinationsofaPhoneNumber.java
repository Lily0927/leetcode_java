package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationsofaPhoneNumber {
	String[][] refer = { {}, {}, { "a", "c", "b" }, { "d", "e", "f" },
			{ "g", "h", "i" }, { "j", "k", "l" }, { "m", "n", "o" },
			{ "p", "q", "r", "s" }, { "t", "u", "v" },
			{ "w", "x", "y", "z" } };
	public List<String> letterCombinations(String digits) {
		List<String> result = new ArrayList<String>();
		if(!digits.equals("")){
			helper(result,digits,"");
		}
		return result;

	}
	public void helper(List<String> result,String digits, String s){
		if(digits.length()==0){
			result.add(s);
			return;
		}
		int number=Integer.parseInt(digits.substring(0,1));
		for(String temp:refer[number]){
			helper(result,digits.substring(1,digits.length()),s+temp);
		}
		
	}
}
