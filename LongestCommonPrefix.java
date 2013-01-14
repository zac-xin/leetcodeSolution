public class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        if(strs.length == 0)
            return "";
            
        if(strs.length == 1){
            return strs[0];
        }
        
        String minString = strs[0];
        
        for(int i = 1; i < strs.length; i++){
            if(strs[i].length() < minString.length()){
                minString = strs[i];
            }
        }
        
        for(int i = 0; i < strs.length; i++){
            int j = 0;
            while(j < minString.length()){
                if(strs[i].charAt(j) != minString.charAt(j)){
                    break;
                }
                j++;
            }
            minString = minString.substring(0, j);
        }
        
        return minString;
    }
}