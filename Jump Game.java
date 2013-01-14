public class Solution {
    public boolean canJump(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int count = 1;
        boolean flag = false;
        
        if(A.length == 1)
            return true;
            
        for(int i = A.length - 2; i >= 0; i--){
            if(A[i] >= count){
                flag = true;
                count = 1;
            }else{
                flag = false;
                count++;
            }    
        }
        
        return flag;
    }
}