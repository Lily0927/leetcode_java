package Leetcode;

import java.util.ArrayList;

public class PalindromePartitioning {
    public ArrayList<ArrayList<String>> partition(String s) {
        ArrayList<ArrayList<String>> result =new ArrayList<ArrayList<String>>();
        if(s==null||s.length()==0){
        	return result;
        }
        return result;
      
    }
    public boolean isPalindrome(String a){
    	int start=0;
    	int end=a.length()-1;
    	while(start<end){
    		if(a.charAt(start)!=a.charAt(end)){
    			return false;
    		}
    		start++;
    		end--;
    	}
    	return true;
    }
}
