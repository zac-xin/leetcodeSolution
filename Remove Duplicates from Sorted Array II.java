public class Solution {
    public int removeDuplicates(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(A.length <= 2){
            return A.length;
        }
        
        int last = A[0];
        int count = 1;
        int position = 1;
        int i = 1;

        while(i < A.length){
            if(A[i] == last){
                if(count == 1){
                    count++;
                    A[position] = A[i];
                    position++;
                    i++;
                }else if(count == 2){
                    while(i < A.length && A[i] == last){
                        i++;
                    }
                }
            }else{
                count = 1;
                last = A[i];
                A[position] = A[i];
                position++;
                i++;
            }
        }
        return position;
    }
}