package Leetcode;

public class ClimbingStairs {
    public int climbStairs(int n) {
        if(n<=1){
        	return n;
        }
        int before=1;
        int beforebefore=1;
        int current=0;
        for(int i=2;i<=n;i++){
        	current=before+beforebefore;
        	beforebefore=before;
        	before=current;
        }
        return current;
    }
}
