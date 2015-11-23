package Leetcode;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
    	String temp="";
        if(strs.length==0){
    		return null;
    	}
    	
        for(int index=0;;index++){
        	for(int i=0;i<strs.length;i++){
        	    if(strs[i].length()<=index){
        	        return temp;
        	    }
        		if(strs[i].charAt(index)==strs[0].charAt(index)){}
        		else{
        			return temp;
        		}
        	} 
        	temp+=strs[0].charAt(index);
        }
    }
}
