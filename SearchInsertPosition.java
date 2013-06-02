public class Solution {
    public int searchInsert(int[] A, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(A == null || A.length == 0){
            return -1;
        }
        
        int low = 0;
        int high = A.length - 1;
        
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(A[mid] == target){
                return mid;
            }else if(target > A[mid]){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return low;
    }
}