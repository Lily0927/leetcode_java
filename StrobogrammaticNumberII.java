package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StrobogrammaticNumberII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findStrobogrammatic(2));
	}

	public static List<String> findStrobogrammatic(int n) {
		List<String> list=new ArrayList<String>();
		
		if(n%2==1){
			list.addAll(Arrays.asList(new String[]{"0","1","8"}));
		}else{
			list.add("");
		}
		int count=n/2;
		while(count!=0){
			List<String> list2=new ArrayList<String>();
			for(String s:list){
				list2.add("6"+s+"9");
				list2.add("9"+s+"6");
				list2.add("8"+s+"8");
				list2.add("1"+s+"1");
				if(count!=0){
					list2.add("0"+s+"0");
				}
				
				list=list2;
			}
			count--;
		}
		return list;
	}
	

}
