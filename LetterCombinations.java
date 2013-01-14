public class Solution {
    public ArrayList<String> letterCombinations(String digits) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        ArrayList<String> result = new ArrayList<String>();
        char str[] = new char[digits.length()];
        
        helper(0, str, result, digits);
        return result;
    }
    
    public void helper(int level, char[] str, ArrayList<String> result, String digits){
        if(level == digits.length()){
            result.add(new String(str));
            return;
        }
        
        int current = digits.charAt(level) - '0';
        char[] record = getX(current).toCharArray();
        
        for(int i = 0 ; i < record.length; i++){
            str[level] = record[i];
            helper(level + 1, str, result, digits);
        }
    }
    
    public String getX(int i){
        String[] arr = {" ", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        return arr[i];
    }
}