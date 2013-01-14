public class Solution {
    public void nextPermutation(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int len = num.length;
        int a = len - 2;
        
        while(a >= 0 && num[a] >= num[a + 1]){
            a--;
        }
        
        if(a == -1){
            reverse(num, 0);
            return;
        }
        
        int b = len - 1;
        
        while(num[b] <= num[a]){
            b--;
        }
        
        swap(num, a, b);
        reverse(num, a + 1);
        
    }
    
    public void swap(int arr[], int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    
    public void reverse(int arr[], int start){
        for(int i = 0 ; i < (arr.length - start) / 2; i++){
            swap(arr, i + start, arr.length - i - 1);
        }
    }
}