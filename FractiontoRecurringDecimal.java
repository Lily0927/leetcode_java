package Leetcode;

import java.util.HashMap;

public class FractiontoRecurringDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fractionToDecimal(1,Integer.MAX_VALUE));
	}

	public static String fractionToDecimal(int numerator, int denominator) {
		
		if(numerator==0){
			return "0";
		}
		StringBuilder result=new StringBuilder();
		result.append(((numerator>0)^(denominator>0))?"-":"");
		
		long num=Math.abs((long)numerator);
		long deno=Math.abs((long)denominator);
		
		result.append(num/deno);
		num=num%deno;
		if(num==0){
			return result.toString();
		}
		result.append(".");
		HashMap<Long,Integer> store=new HashMap<Long,Integer>();
		store.put(num, result.length());
		while(num!=0){
			num*=10;
			result.append(num/deno);
			num%=deno;
			if(store.containsKey(num)){
				int index=store.get(num);
				result.insert(index, "(");
				result.append(")");
				break;
			}
			else{
				store.put(num, result.length());
			}			
		}
		return result.toString();		
	}
}
