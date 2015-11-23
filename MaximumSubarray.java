package Leetcode;
public class MaximumSubarray {
    public int maxSubArray(int[] A) {
        int max=0;
        int current=0;
        for(int i=0;i<A.length;i++){
        	current+=A[i];
        	if(current>max){
        		max=current;
        	}
        	if(current<0){
        		current=0;
        	}
        }
        return max;
    }
}
