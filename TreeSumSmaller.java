package Leetcode;

import java.util.Arrays;

public class TreeSumSmaller {
	public static int threeSumSmaller(int[] nums, int target) {
		Arrays.sort(nums);
		int low;
		int high;
		int count=0;
		for(int i=0;i<nums.length-2;i++){
			low=i+1;
			high=nums.length-1;
			while(low<high){
				if(nums[i]+nums[low]+nums[high]<target){
					count+=high-low;
					low++;
				}
				else{
					high--;
				}
			}			
		}
		return count;
	}
	public static void main(String[] args){
		int[] nums={-2,1,0,3};
		System.out.println(threeSumSmaller(nums,3));
	}
}
