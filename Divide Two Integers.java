public class Solution {
    public int divide(int dividend, int divisor) {
        // Start typing your Java solution below
        // DO NOT write main() function
        boolean neg = false;
        
        long a = Math.abs((long)dividend);
        long b = Math.abs((long)divisor);
        
        if(dividend < 0){
            neg = !neg;
        }
        
        if(divisor < 0){
            neg = !neg;
        }
        
        long c;
        long result = 0;
        while(a >= b){
            c = b;
            for(int i = 0; a >= c; i++, c <<= 1){
                a -= c;
                result += 1 << i;
            }
        }
        
        if(neg){
            result = -result;
        }
        
        return (int)result;
    }
}