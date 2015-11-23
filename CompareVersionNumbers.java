package Leetcode;

public class CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {
    	String[] ver1=version1.split("\\.");
    	String[] ver2=version2.split("\\.");
    	int maxlength;
		if(ver1.length>=ver2.length){
    	    maxlength=ver1.length;
    	}
    	else{
    	   maxlength=ver2.length;
    	}
    	int[] ints1 = new int[maxlength];
    	
        for (int i=0; i < maxlength; i++) {
            ints1[i] = Integer.parseInt(ver1[i]);
        }
        int[] ints2 = new int[maxlength];
        for (int i=0; i < maxlength; i++) {
            ints2[i] = Integer.parseInt(ver2[i]);
        }
        for(int i=0;i<maxlength;i++){
        	if(ints1[i]>ints2[i]){
        		return 1;
        	}
        	else if(ints1[i]<ints2[i]){
        		return -1;
        	}
        }
        return 0;
    }
}
