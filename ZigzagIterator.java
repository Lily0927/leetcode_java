package Leetcode;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ZigzagIterator {
	LinkedList<Iterator> list;
	public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
		list=new LinkedList<Iterator>();
		if(v1.size()>0){
			list.add(v1.iterator());
		}
		if(v2.size()>0){
			list.add(v2.iterator());
		}
	}

	public int next() {
		Iterator<Integer> iter=list.remove();
		int value=iter.next();
		if(iter.hasNext()){
			list.add(iter);
			
		}
		return value;

	}

	public boolean hasNext() {
		return !list.isEmpty();
	}
}
