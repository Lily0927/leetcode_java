package Leetcode;

public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        int result=0;
        char[] temp=s.toCharArray();
        for(int i =0;i<s.length();i++){
        	result=result*26+temp[i]-'A'+1;
        }
        return result;
    }
}
