public class Solution {
    public double pow(double x, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (n == 0)
            return 1;
            
        if ( n == 1){
            return x;
        }
        
        boolean negative = false;
        
        if( n < 0){
            negative = true;
            n = -n;
        }
        
        double tmp = pow(x, n/ 2);
        
        double result = tmp * tmp;
        
        if(n % 2 == 1){
            result = result * x;
        }
        
        if(negative){
            return 1/ result;
        }else{
            return result;
        }
        
    }
}