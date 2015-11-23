package Leetcode;

import java.util.Stack;

public class SimplifyPath {
    public String simplifyPath(String path) {
        Stack<String> store= new Stack<String>();
        StringBuffer result=new StringBuffer();
        String[] temp=path.split("/");
        for(int i=0;i<temp.length;i++){
        	if(temp[i].equals(".")){
        		continue;
        	}
        	else if(temp[i].equals("..")){
        		if(!store.isEmpty()){
        			store.pop();
        		}
        	}
        	else if(!temp[i].isEmpty()){
        		store.push(temp[i]);
        	}
        }
        while(!store.isEmpty()){
        	result.insert(0,"/"+store.pop());        
        }
        if(result.length()==0){
             result.append("/");
        }
        return result.toString();
    }
}
