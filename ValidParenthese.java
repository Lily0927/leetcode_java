package Leetcode;

import java.util.Stack;

public class ValidParenthese {
    public static boolean isValid(String s) {
        if(s.length()==0||s.length()==1){
        	return false;
        }
        Stack<Character> store=new Stack<Character>();
        for(int i=0;i<s.length();i++){
        	if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
        		store.push(s.charAt(i));
        	}
        	else{
        		if(store.size()==0){
        			return false;
        		}
        		if(s.charAt(i)==')'){
        			if(store.pop()!='('){
        				return false;
        			}
        		}
        		if(s.charAt(i)==']'){
        			if(store.pop()!=']'){
        				return false;
        			}
        		}
        		if(s.charAt(i)=='}'){
        			if(store.pop()!='}'){
        				return false;
        			}
        		}
        	}
        }
        return store.size()==0;
    }
    public static void main(String[] args){
    	System.out.print(isValid("()[]{}"));
    }
}
