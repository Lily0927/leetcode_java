package Leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class ValidWordAbbr {
	HashMap<String,Integer> dic=new HashMap<String,Integer>();
	HashSet<String> set=new HashSet<String>();
	public ValidWordAbbr(String[] dictionary) {
		
		for(String input:dictionary){
			if(dic.containsKey(getKey(input))){
				if(set.contains(input)){
					dic.put(getKey(input),1);
				}
				else{
					dic.put(getKey(input),dic.get(getKey(input))+1);
				}
			}
			else{
				dic.put(getKey(input), 1);
			}
			set.add(input);
		}
	}

	public boolean isUnique(String word) {
		if(word.length() == 0) {
            return true;
        }
		String wordKey=getKey(word);
		if(dic.containsKey(wordKey) && dic.get(wordKey)!=1&& set.contains(word)){
			return false;
		}
		else{
			return true;
		}
	}
	public String getKey(String s){
		if(s.length()<=2){
			return s;
		}
		return ""+s.charAt(0)+(s.length()-2)+s.charAt(s.length()-1);
	}
	
	public static void main(String[] args){
		ValidWordAbbr vwa =new ValidWordAbbr(new String[] {"dog"});
		System.out.println(vwa.isUnique("dig"));
		
	}
}
