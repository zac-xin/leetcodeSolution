public class Solution {
    
    static int count = 0;
    public int totalNQueens(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        count = 0;
        int arr[] = new int[n];
        helper(arr, 0);
        return count;
    }
    
    public void helper(int arr[], int level){
        if(level == arr.length){
            count++;
        }else{
            for(int i = 0; i < arr.length; i++){
                if(check(arr, level, i)){
                    arr[level] = i;
                    helper(arr, level + 1);
                }
            }
        }
    }
    
    public boolean check(int arr[], int level, int n){
        for(int i = 0; i < level; i++){
            if(arr[i] == n)
                return false;
            int diff = Math.abs(n - arr[i]);
            if(diff == level - i)
                return false;
        }
        return true;
    }
}