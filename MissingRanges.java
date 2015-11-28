package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingRanges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={0,1,3,50,75};
		System.out.println(findMissingRanges(nums,0,99));
	}

	public static List<String> findMissingRanges(int[] nums, int lower, int upper) {
		List<String> result=new ArrayList<String>();
		int next=lower;
		for(int i=0;i<nums.length;i++){
			if(nums[i]<next){
				continue;
			}
			if(nums[i]==next){
				next++;
			}
			if(nums[i]>next){
				result.add(getRange(next,nums[i]-1));
				next=nums[i]+1;
			}
		}
		if(next<=upper){
			result.add(getRange(next,upper));
		}
		return result;
	}
	public static String getRange(int n1, int n2){
		if(n1==n2){
			return ""+n1;
		}else{
			return n1+"->"+n2;
		}
	}

}
