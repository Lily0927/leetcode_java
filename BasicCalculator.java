package Leetcode;

import java.util.Stack;

public class BasicCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calculate("1+(4+2)-3"));
		
	}

	public static int calculate(String s) {
		Stack<Integer> resultStack=new Stack<Integer>();
		Stack<Integer> signStack=new Stack<Integer>();
		int number=0;
		int result=0;
		int sign=1;
		for(char c:s.toCharArray()){
			if(c>='0'&&c<='9'){
				number=number*10+(c-'0');
			}else if(c=='+'){
				result+=sign*number;
				sign=1;
				number=0;
			}else if(c=='-'){
				result+=sign*number;
				sign=-1;
				number=0;
			}else if(c=='('){
				signStack.push(sign);
				resultStack.push(result);
				sign=1;
				result=0;
			}else if(c==')'){
				result+=sign*number;
				result*=signStack.pop();
				result+=resultStack.pop();
				number=0;
				sign=1;
				
			}
		}
		if(number!=0){
			result+=sign*number;
		}
		return result;
		
	}
	

}
