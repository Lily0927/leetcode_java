package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class FlipGame {
    public List<String> generatePossibleNextMoves(String s) {
    	List<String> result=new ArrayList<String>();
        if(s==null || s.length()==1){
        	return result;
        }
        char [] input=s.toCharArray();
        for(int i=1;i<s.length();i++){
        	if(input[i]=='+'&&input[i-1]=='+'){
        		String temp=new String(input,0,i-1);
        		String temp2=new String(input,i+1,input.length-i-1);
        		String tempResult=temp+"--"+temp2;
        		result.add(tempResult);
        	}
        }
        return result;
    }
    public static void main(String [] args){
    	FlipGame flip=new FlipGame();
    	System.out.println(flip.generatePossibleNextMoves("++++"));
    }
}
