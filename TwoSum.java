package Leetcode;

public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
    	int[] result=new int[1000];
        for(int i=0;i<numbers.length;i++){
        	if(numbers[i]>target){
        		break;
        	}
        	if(numbers[i]==target){
        		result[0]=i;
        		return result;
        	}
        	for(int j=0;j<numbers.length;j++){
        		if(numbers[i]+numbers[j]==target&&numbers[j]>numbers[i]){
        			result[0]=i;
        			result[1]=j;
        			return result;
        		}
        	}
        	
        }
        return result;
    }

}
