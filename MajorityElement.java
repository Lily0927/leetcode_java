package Leetcode;

public class MajorityElement {
    public int majorityElement(int[] num) {
    	int sum=0;
    	int result=0;
    	for(int i=0;i<num.length;i++){
    		if(sum==0){
    			result=num[i];
    			sum++;
    		}
    		else if(result==num[i]){
    			sum++;
    			if(sum>num.length/2){
    				return result;
    			}
    		}
    		else sum--;
    	}
    	return result;
    }
}
