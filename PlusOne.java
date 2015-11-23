package Leetcode;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int add=1;
        for(int i=digits.length-1;i>=0&&add>0;i--){
        	int temp=digits[i]+add;
        	digits[i]=temp%10;
        	add=temp/10;
        }
        if(add==0){
        	return digits;
        }
        int[] result=new int[digits.length+1];
        result[0]=1;
        for(int j=1;j<result.length;j++){
        	result[j]=digits[j-1];
        }
        return result;
    }
    
    
    public static void main(String[] args){
    	int[] result=plusOne(new int[]{8,9,9});
    	for(int i:result){
    	System.out.println(i);
    	}
    }

}
