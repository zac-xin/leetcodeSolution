public class Solution {
    public int sqrt(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        long low = 0;
        long high = x;
        while(low <= high){
            long mid = low + (high - low) / 2;
            long result = mid * mid;
            if(result == x){
                return (int)mid;
            } else if(result > x){
                high = mid - 1;
            } else{
                
                low = mid + 1;
            }
        }
        return (int)high;    
    }
}