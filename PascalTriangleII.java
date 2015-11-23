package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {
    public List<Integer> getRow(int rowIndex) {
       List<Integer> current=new ArrayList<Integer>();
       if(rowIndex==0){
    	   current.add(1);
    	   return current;
       }
       current.add(1);
       for(int i=1;i<=rowIndex;i++){
    	   current.set(0,1);
    	   for(int j=1;j<i-1;j++){
    		   current.set(j,current.get(j)+current.get(j+1));
    	   }   	   
       }
       return current;
    }
}
