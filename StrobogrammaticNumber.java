package Leetcode;

import java.util.HashMap;

public class StrobogrammaticNumber {
	public boolean isStrobogrammatic(String num) {
		HashMap<Character,Character> hash=new HashMap<Character,Character>();
		hash.put('0','0');
		hash.put('1','1');
		hash.put('8','8');
		hash.put('6','9');
		hash.put('9','6');
		String result="";
		for(int i=num.length()-1;i>=0;i--){
			if(hash.containsKey(num.charAt(i))){
				result=result+hash.get(num.charAt(i));
			}
			else{
				return false;
			}
		}
		if(num.equals(result)){
			return true;
		}
		else{
			return false;
		}
		
	}
	public static void main(String[] args){
		StrobogrammaticNumber stro=new StrobogrammaticNumber();
		System.out.println(stro.isStrobogrammatic("10698186901"));
	}
}
