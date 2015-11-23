package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class l3sum {
    public 	ArrayList<ArrayList<Integer>> threeSum(int[] num) {
    	ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
    	if(num==null||num.length<3){
    		return result;
    	}
    	int sum=0;
    	Arrays.sort(num);
        for(int i=0;i<num.length-2;i++){
        	int left=i+1;
        	int right=num.length-1;
        	while(left<right){
        		sum=num[i]+num[left]+num[right];
        		if(sum==0){
        			ArrayList<Integer> temp=new ArrayList<Integer>();
        			temp.add(num[i]);
        			temp.add(num[left]);
        			temp.add(num[right]);
        			result.add(temp);
        			left++;
        			right--;
        			while (left < right && num[left] == num[left - 1]) { // to skip duplicates
						left++;
					}
					while (left < right && num[right] == num[right + 1]) { // to skip duplicates
						right--;
					}
        		}
        		else if(sum<0){
        			left++;
        		}
        		else{
        			right--;
        		}
        	}
        }
        return result;
    }
}
