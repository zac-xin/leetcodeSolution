public class Solution {
    public ArrayList<ArrayList<Integer>> combine(int n, int k) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if( n  < k)
            return null;
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        
        if( k == 1){
            for(int i = 1; i <= n; i++){
                ArrayList<Integer> list = new ArrayList<Integer>();
                list.add(i);
                result.add(list);
            }
            return result;
        }
        
        for(int i = n; i >= k ; i--){
            for(ArrayList<Integer> list: combine(i - 1, k - 1)){
                list.add(i);
                result.add(list);
            }
        }
        
        return result;
    }
}