public class Solution {
    public ArrayList<Integer> spiralOrder(int[][] matrix) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(matrix.length == 0){
            return result;
        }
        int row = matrix.length;
        
        int col = matrix[0].length;
       
        helper(matrix, 0, 0, row, col, result);
        return result;
    }
    
    public void helper(int[][] data, int m, int n, int row, int col, ArrayList<Integer> result){
        if( row <= 0 || col <= 0) {
            return;
        }
        
        for(int i = 0; i < col; i++){
            result.add(data[m][n + i]);
        }
        
        for(int i = 1; i < row; i++){
            result.add(data[m + i][n + col - 1]);
        }
        
        // important!!!
        // if row == 1 then m + row - 1 = m , we will have duplicated elements.
        if(row > 1){
            for(int i = col - 2; i >= 0; i--){
                result.add(data[m + row - 1][n + i]);
            }
        }
        
        // important!!!
        if(col > 1){
            for(int i = row - 2; i >= 1; i--){
                result.add(data[m + i][n]);
            }
            
        }
        
        helper(data, m + 1, n + 1, row - 2, col - 2, result);
        
    }
}