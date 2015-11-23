package Leetcode;

public class rotateArray {
	void rotate(int nums[], int n, int k) {
		if(k>nums.length){
			k=k%nums.length;
		}

		int[] result = new int[nums.length];
		int j = 0;
		for (int i = nums.length - k; i < nums.length; i++) {
			result[j] = nums[i];
			j++;
		}
		for (int i = 0; i < nums.length - k; i++) {
			result[j] = nums[i];
			j++;
		}
		for (int i = 0; i < nums.length; i++) {
			nums[i] = result[i];
		}
	}
	void rotate2(int nums[], int k) {
		if(k>nums.length){
			k=k%nums.length;
		}
		int n=nums.length;

		int[] result = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			result[(i+k)%n] = nums[i];
		}
		for (int i = 0; i < nums.length; i++) {
			nums[i] = result[i];
		}
	}
	void rotate3(int nums[], int k) {
		int temp=0;
		for(int i=0;i<k;i++){
			temp=nums[nums.length-1];
			for(int j=nums.length-1;j>0;j--){
				nums[j]=nums[j-1];
			}
			nums[0]=temp;
		}
	}
	

}
