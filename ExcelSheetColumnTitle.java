package Leetcode;

public class ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
    	StringBuffer result= new StringBuffer();
        while(n!=0){
        	n--;
        	result.insert(0, (char)('A'+n%26));
        	n=n/26;
        }
        return result.toString();
    }
}
