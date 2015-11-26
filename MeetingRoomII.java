package Leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MeetingRoomII {
	public class Interval {
		int start;
		int end;

		Interval() {
			start = 0;
			end = 0;
		}

		Interval(int s, int e) {
			start = s;
			end = e;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int minMeetingRooms(Interval[] intervals) {
		if(intervals==null || intervals.length==0){
			return 0;
		}
		int result=1;
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		Arrays.sort(intervals, new Comparator<Interval>(){

			@Override
			public int compare(Interval o1, Interval o2) {
				// TODO Auto-generated method stub
				return o1.start-o2.start;
			}});
		pq.add(intervals[0].end);
		for(int i=1;i<intervals.length;i++){
			if(intervals[i].start<pq.peek()){
				result++;			
			}
			else{
				pq.poll();				
			}
			pq.add(intervals[i].end);
		}
		return result;
	}

}
