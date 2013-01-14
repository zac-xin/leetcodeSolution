
/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
import java.util.Iterator;

public class Solution {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<Interval> result = new ArrayList<Interval>();
        
        int start = newInterval.start;
        int end = newInterval.end;
        
        Iterator<Interval> iter = intervals.iterator();
        
        while(iter.hasNext()){
            Interval current = iter.next();
            if(current.start > end){
                // since we may have modified start and end,
                // so we cannot add 'newInterval'
                result.add(new Interval(start, end));
                result.add(current);
                while(iter.hasNext()){
                    result.add(iter.next());
                }
                return result;
            }else if(start > current.end){
                result.add(current);
            }else{
                start = Math.min(start, current.start);
                end = Math.max(end, current.end);
            }
            
        }
        
        result.add(new Interval(start, end));
        return result;
    }
}