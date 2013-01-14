public class Solution {
    public int lengthOfLastWord(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        if(s.length() == 0)
            return 0;
            
        int i = s.length() - 1;
        
        while(i >= 0){
            if(s.charAt(i) == ' '){
                i--;
            }
            else{
                break;
            }
        }
        
        int count = 0;
        
        while(i >= 0){
            if(s.charAt(i) != ' '){
                i--;
                count++;
            }else{
                break;
            }
        }
     
        return count;
    }
}