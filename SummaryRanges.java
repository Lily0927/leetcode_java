package Leetcode;

import java.util.ArrayList;


public class SummaryRanges {

	public ArrayList<String> summaryRanges(int[] nums) {
		ArrayList<String> result=new ArrayList<String>();
		int start=0;
		int end=0;
		while(end<nums.length){
			if(end+1<nums.length && nums[end+1]==nums[end]+1){
				end++;
			}
			else{
				if(end==start){
					result.add(""+nums[end]);
				}
				else{
					result.add(nums[start]+"->"+nums[end]);
					
				}
				end++;
				start=end;
			}
		}
		return result;
	}
	public static void main(String[] args){
		SummaryRanges aa=new SummaryRanges();
		int[] test={0,1,2,3,7,8};
		System.out.println(aa.summaryRanges(test));
	}

}
