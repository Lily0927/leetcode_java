package Leetcode;

public class paintFence {
	public static int numWays(int n, int k) {
		if(n==0){
			return 0;
		}
		if(n==1){
			return k;
		}
		int dif=k*(k-1);
		int same=k;
		while(n!=2){
			int temp=dif;
			dif=(same+dif)*(k-1);
			same=temp;
			n--;
		}
		return same+dif;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numWays(3,3));
	}

}
