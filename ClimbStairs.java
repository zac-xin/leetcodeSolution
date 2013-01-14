public class Solution {
    public int climbStairs(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        if( n == 0 || n == 1 || n == 2)
            return n;
            
        int array[] = new int[n + 1];
        
        array[0] = 0;
        array[1] = 1;
        array[2] = 2;
        
        if( n == 0 || n == 1 || n == 2)
            return array[n];
            
        for(int i = 3; i < n + 1; i++){
            array[i] = array[i - 1] + array[i - 2];
        }
        
        return array[n];
    }
}