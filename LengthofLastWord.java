package Leetcode;

public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        char [] chars=s.toCharArray();
        int length=0;
        for(int i=chars.length-1;i>0;i--){
        	if(length==0){
        		if(chars[i]==' '){
        			continue;
        		}
        		else{
        			length++;
        		}
        	}
        	else{
        		if(chars[i]==' '){
        			break;
        		}
        		else{
        			length++;
        		}
        	}
        }
        return length;
    }
}
