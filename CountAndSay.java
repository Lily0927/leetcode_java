package Leetcode;

public class CountAndSay {
	 public static String countAndSay(int n) {
	        String temp="1";
	        n--;
	        while(n!=0){
	        	StringBuffer say=new StringBuffer();
	        	char[] arr=temp.toCharArray();
	        	
	        	for(int i=0;i<arr.length;i++){
	        		int count=1;
	        		while((i+1)<arr.length && arr[i]==arr[i+1]){
	        			count++;
	        			i++;
	        		}
	        		say.append(count);
	        		say.append(arr[i]);
	        	}
	        	temp=say.toString();
	        	n--;
	        }
	        return temp;
	    }
	 public static void main(String[] args){
		 int a=6;
		 String b=countAndSay(a);
		 System.out.println(b);
	 }
}
