public class Solution {
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        return permuteHelper(num, 0);
    }
    
    public ArrayList<ArrayList<Integer>> permuteHelper(int num[], int index){
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(index == num.length - 1){
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(num[index]);
            result.add(list);
            return result;
        }else{
            ArrayList<ArrayList<Integer>> partial = permuteHelper(num, index + 1);
            for(ArrayList<Integer> list: partial){
                for(int i = 0; i <= list.size(); i++){
                    ArrayList<Integer> tmp = new ArrayList<Integer>(list);
                    tmp.add(i, num[index]);
                    result.add(tmp);
                }
            }
            return result;
        }
    }
}