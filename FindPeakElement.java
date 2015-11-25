package Leetcode;

public class FindPeakElement {
	public static int findPeakElement(int[] nums) {
		for(int i=0;i<nums.length;i++){
			if(i==0 && nums[i]>nums[i+1]){
					return i;
			}
			if(i==nums.length-1 && nums[nums.length-1]>nums[nums.length-2]){
				return nums.length-1;
			}
			if(nums[i]>nums[i+1]){
				return i;
			}
			else{
				continue;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums={3,2,1,3};
		System.out.println(findPeakElement(nums));
	}

}
