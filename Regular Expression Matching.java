public class Solution {
    public boolean isMatch(String s, String p) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(s.length() == 0 && p.length() == 0){
            return true;
        }
        
        if(s.length() == 0){
            return checkEmpty(p);
        }
        
        if(p.length() == 0){
            return false;
        }
        
        char a = s.charAt(0);
        char b = p.charAt(0);
        char c = '1';
        
        if(p.length() > 1){
            c = p.charAt(1);
        }
        
        if ( c == '*') {
            if (a == b || b == '.'){
                return isMatch(s.substring(1), p) || isMatch(s, p.substring(2));
            }else{
                return isMatch(s, p.substring(2));
            }
        } else{
            if(b == '.' || a== b){
                return isMatch(s.substring(1), p.substring(1));
            }else {
                return false;
            }
            
        }
    }
    
    public boolean checkEmpty(String s){
        if(s.length() % 2 != 0){
            return false;
        }
        
        for(int i = 1; i < s.length(); i += 2){
            if(s.charAt(i) != '*'){
                return false;
            }
        }
        
        return true;
        
    }
}
