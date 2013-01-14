public class Solution {
    public int removeDuplicates(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(A.length == 0)
            return 0;
        
        if(A.length == 1)
            return 1;
        
        int i = 1;
        int position = 1;
        int last = A[0];
        
        while( i < A.length){
            if( A[i] == last){
                while( i < A.length && A[i] == last){
                    i++;
                }
            }else{
                A[position] = A[i];
                last = A[i];
                position++;
                i++;
            }
        }
        
        return position;
        
    }
}