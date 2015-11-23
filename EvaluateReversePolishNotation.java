package Leetcode;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> store=new Stack<Integer>();
        int sum=0;
        for(int i=0;i<tokens.length;i++){
        	if(!tokens[i].matches("-?\\d+")){
        		int a=store.pop();
        		int b=store.pop();
          		if(tokens[i].equals("+")){
        			sum=b+a;
        		}
        		else if(tokens[i].equals("-")){
        			sum=b-a;
        		}
        		else if(tokens[i].equals("*")){
        			sum=b*a;
        		}
        		else if(tokens[i].equals("/")){
        			sum=b/a;
        		}
        		store.push(sum);
        	}
        	else{
        		store.push(Integer.parseInt(tokens[i]));
        	}
        }
        return store.pop();
    }
    public static void main(String[] args){
    	String[] tokens={"3","-4","+"};
    	System.out.println(evalRPN(tokens));
    }
}
