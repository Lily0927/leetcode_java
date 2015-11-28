package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class EncodeandDecodeStrings {
	// Encodes a list of strings to a single string.
    public static String encode(List<String> strs) {
        StringBuilder result=new StringBuilder();
        for(String i:strs){
        	result.append(i.length()+"*");
        	result.append(i);
        }
        return result.toString();
    }

    // Decodes a single string to a list of strings.
    public static List<String> decode(String s) {
        List<String> result=new ArrayList<String>();
        char [] input=s.toCharArray();
        for(int i=0;i<s.length();i++){
        	for(int j=i+1;j<s.length();j++){
        		if(input[j]=='*'){
        			String temp=s.substring(i,j);
        			int len=Integer.parseInt(temp);
        			result.add(s.substring(j+1,j+len+1));
        			i=j+len;
        			break;
        		}
        	}
        }
        return result;
    }
    public static void main(String [] args){
    	List<String> strs=Arrays.asList(new String[] {"aa","bb","cc"});
    	//System.out.print(encode(strs));
    	System.out.println(decode("2*aa2*bb2*cc"));
    }
}
