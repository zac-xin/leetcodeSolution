public class Solution {
    public String strStr(String haystack, String needle) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int len1 = haystack.length();
        int len2 = needle.length();
        
        if(len2 == 0){
            return haystack;
        }
        
        if(len1 < len2){
            return null;
        }
        
        int diff = len1 - len2;
        
        for(int i = 0; i < diff + 1; i++){
            int begin = i;
            int cursor = i;
            int j = 0;
            while( j < len2 && haystack.charAt(cursor) == needle.charAt(j)){
                j++;
                cursor++;
            }
            
            if( j == len2){
                return haystack.substring(begin);
            }
        }
        
        return null;
    }
}