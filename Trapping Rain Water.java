public class Solution {
    public int trap(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(A.length <= 2){
            return 0;
        }
        
        int sum = 0;
        
        int index = 0;
        int height = A[0];
        
        int i = 1;
        
        while (i < A.length){
            if(A[i] >= height){
                for(int j = index + 1; j < i; j++){
                    sum += height - A[j];
                }
                index = i;
                height = A[i];
            }
            i++;
        }
        
        int indexOfMax = index;
        
        i = A.length - 2;
        index = A.length -1;
        height = A[A.length - 1];
        
        while (i >= indexOfMax){
            if(A[i] >= height){
                for(int j = index - 1; j > i; j--){
                    sum += height - A[j];
                }
                index = i;
                height = A[i];
            }
            i--;
            
        }
        
        return sum;
        
    }
}