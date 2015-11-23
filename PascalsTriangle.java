package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public ArrayList<ArrayList<Integer>> generate(int numRows) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
        //ArrayList<Integer> hang=new ArrayList<Integer>();
        
        for(int i=1;i<=numRows;i++){
        	ArrayList<Integer> hang=new ArrayList<Integer>();
        	if(i==1){
        		hang.add(1);
        	}
        	else{
        		hang.add(1);
        		for(int j=1;j<i-1;j++){
        			hang.add(result.get(i-2).get(j-1)+result.get(i-2).get(j));
        		}
        		hang.add(1);
        	}
        	result.add(hang);
        }
        return result;
    }
}
