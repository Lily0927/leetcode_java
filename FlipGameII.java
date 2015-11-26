package Leetcode;

public class FlipGameII {
	public boolean canWin(String s) {	
		return canwinHelper(s);
	}
	boolean canwinHelper(String ss){
		if(ss==null || ss.length()<2){
			return false;
		}
		for(int i=0;i<ss.length()-1;i++){
			if(ss.charAt(i)=='+'&&ss.charAt(i+1)=='+'){
				String t = ss.substring(0, i) + "--" + ss.substring(i + 2);	
				if(!canwinHelper(t)){
					return true;
				}
			}
			
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlipGameII solution=new FlipGameII();
		System.out.println(solution.canWin("++++"));
	}

}
