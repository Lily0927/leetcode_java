package Leetcode;

import java.util.HashMap;
import java.util.Objects;

public class WordPattern {
	public boolean wordPattern(String pattern, String str) {
		
		HashMap patte=new HashMap();
		String[] strArray=str.split(" "); 
		if(pattern.length()!=strArray.length){
			return false;
		}
		for(int i=0;i<pattern.length();i++){
			if(!Objects.equals(patte.put(pattern.charAt(i), i), patte.put(strArray[i], i))){
				return false;
			}
		}
		return true;
	}
}
