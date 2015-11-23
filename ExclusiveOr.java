package Leetcode;

public class ExclusiveOr {
	public int xor(int a, int b){
		a=a^b;
		b=a^b;
		a=b^a;
		return a;
	}
	public static void main(String[] args){
		ExclusiveOr instance=new ExclusiveOr();
		System.out.print(instance.xor(1,2));
	}
}
