package Leetcode;

public class RemoveDuplicateSortedArray {
public int removeDuplicates(int[] A) {
	 if(A.length<=1){
         return A.length;
     }
     int n=1;
     for(int i=1;i<A.length;i++){
     	if(A[i]!=A[i-1]){
     		A[n]=A[i]; 
     		n++;
     	}
     }
     return n;
    }
}
