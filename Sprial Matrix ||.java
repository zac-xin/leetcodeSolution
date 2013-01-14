public class Solution {
    public int[][] generateMatrix(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int[][] matrix = new int[n][n];
        helper(matrix, 0, 0, n, 1);
        return matrix;
    }
    
    public void helper(int[][] data, int m, int n, int size, int index){
        if( size <= 0){
            return;
        }
        
         for(int i = 0; i < size; i++){
            data[m][n + i] = index++;
        }
        
        for(int i = 1; i < size; i++){
            data[m + i][n + size - 1] = index++;
        }
        
        // important!!!
        // if row == 1 then m + row - 1 = m , we will have duplicated elements.
        if(size > 1){
            for(int i = size - 2; i >= 0; i--){
                data[m + size - 1][n + i] = index++;
            }
        }
        
        // important!!!
        if(size > 1){
            for(int i = size - 2; i >= 1; i--){
               data[m + i][n] = index++;
            }
            
        }
        
        helper(data, m + 1, n + 1, size - 2, index);
        
    }
}