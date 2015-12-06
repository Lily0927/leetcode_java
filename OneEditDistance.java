package Leetcode;

public class OneEditDistance {
	public static void main(String[] args) {
		String s = "teacher";
		String t = "attacher";
		System.out.println(isOneEditDistance(s, t));

	}

	public static boolean isOneEditDistance(String s, String t) {
		if(Math.abs(s.length()-t.length())>1){
			return false;
		}else if(s.length()>t.length()){
			return IsInsert(t,s);
		}else if(s.length()<t.length()){
			return IsInsert(s,t);
		}else{
			return IsReplace(s,t);
		}
	}

	public static boolean IsInsert(String s, String t) {
		String tempS = "";
		String tempT = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != t.charAt(i)) {
				tempS = s.substring(i, s.length());
				tempT = t.substring(i + 1, t.length());
				break;
			}
		}
		if (tempS.equals(tempT)) {
			return true;
		} else {
			return false;
		}
	}
	public static boolean IsReplace(String s, String t){
		int flag=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!=t.charAt(i)){
				flag++;
			}
		}
		if(flag==1){
			return true;
		}else{
			return false;
		}
	}

}
