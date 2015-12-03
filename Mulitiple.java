package Leetcode;

import java.util.Arrays;

public class Mulitiple {
	//

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="99";
		String b="99";
		System.out.println(Multiple(a,b));
		

	}
	public static String Multiple(String a, String b){
		int[] arrayA=new int[a.length()];
		int[] arrayB=new int[b.length()];
		for(int i=0;i<a.length();i++){
			arrayA[i]=Integer.parseInt(""+a.charAt(i));
		}
		for(int i=0;i<b.length();i++){
			arrayB[i]=Integer.parseInt(""+b.charAt(i));
		}
		int[] result=new int[a.length()+b.length()];
		int current=0;
		for(int i=a.length()-1;i>=0;i--){
			
			int index=current;	
			for(int j=b.length()-1;j>=0;j--){
				result[index]+=arrayA[i]*arrayB[j];
				index++;			
			}
			current++;
		}
		int add=0;
		for(int i=0;i<result.length;i++){
			if((result[i]+add)/10>=1){
				int temp=result[i];
				result[i]=(result[i]+add)%10;
				add=(temp+add)/10;	
			}
			else{
				result[i]=result[i]+add;
			}
		}
		return Arrays.toString(result);
 	}

}
