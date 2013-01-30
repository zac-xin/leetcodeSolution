public class Solution {
    public void sortColors(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int index1 = 0;
        int index2 = A.length - 1;
        
        int i = 0;
        // from index2 + 1 to the right end are 2s
        while(i <= index2){
            if(A[i] == 0){
                swap(A, i, index1);
                // we are guaranteed that before i, the
                // pattern is 0*1*
                // so after swap, A[i] must be 1, we can proceed
                i++;
                index1++;  
            }else if(A[i] == 2){
                swap(A, i, index2);
                index2--;
                // after swap, we may have 0, 1 or 2 on A[i]
                // we still need to test A[i]
            }else{
                i++;
            }
            
        }
        
    }
    
    public void swap(int arr[], int a, int b){
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}