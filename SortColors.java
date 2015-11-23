package Leetcode;

public class SortColors {
    public void sortColors(int[] A) {
        int[] B=new int[A.length];
        int a=-1;
        int b=A.length;
        for(int i=0;i<A.length;i++){
        	if(A[i]==0){
        		a++;
        		B[a]=0;       		
        	}
        	else if(A[i]==2){
        		b--;
        		B[b]=2;      		
        	}
        }
        if(a<b){
        	for(int i=a+1;i<b;i++){
        		B[i]=1;
        	}
        }
        for(int i=0;i<A.length;i++){
        	A[i]=B[i];
        }
    }
}
