package Leetcode;

public class ImplementstrStr {
	public int strStr(String haystack, String needle) {
		if(needle.length()==0){
			return 0;
		}
		if(haystack.length()==0||needle.length()>haystack.length()){
			return -1;
		}
		
		int lenN = needle.length();
		for (int j = 0; j < haystack.length(); j++) {
			if (needle.charAt(0) == haystack.charAt(j)) {
				if(haystack.length()<j+lenN){
					continue;
				}
				if (needle.equals(haystack.substring(j, j + lenN))) {
					return j;
				}
				else{
					continue;
				}
			}
		}
		return -1;

	}
	public int strStr1(String haystack, String needle){
		if(needle.length()==0){
			return 0;
		}
		if(haystack.length()==0||needle.length()>haystack.length()){
			return -1;
		}
		
		int lenN = needle.length();
		for (int j = 0; j < haystack.length(); j++) {
			if (needle.charAt(0) == haystack.charAt(j)) {
				if(haystack.length()<j+lenN){
					continue;
				}
				for(int i=0;i<needle.length();i++){
					if(haystack.charAt(j+i)!=needle.charAt(i)){
						break;
					}
					if(i==needle.length()-1){
						return j;
					}
				}
				
			}
		}
		return -1;
	}
	public static void main(String[] args){
		ImplementstrStr solution=new ImplementstrStr();
		System.out.println(solution.strStr1("abcdef", "cd"));
	}
}
