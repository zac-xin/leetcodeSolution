public class Solution {
    public int maxSubArray(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(A.length == 1){
            return A[0];
        }
        
        int max = A[0];
        int current = 0;
        
        for(int i = 0; i < A.length; i++){
            current += A[i];
            if(current > max){
                max = current;
            }
            if(current < 0){
                current = 0;
            }
            
        }
        
        return max;
    }
}