package Leetcode;

public class PalindromeNumber {
public boolean isPalindrome(int x) {
       if(x<0){
    	   return false;
       } 
       return x==reverse(x);
    }
public int reverse(int x){
	int temp=0;
	while(x!=0){
		temp=temp*10+x%10;
		x=x/10;
	}
	return temp;
	
}
}
