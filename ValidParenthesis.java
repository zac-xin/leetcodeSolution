public class Solution {
    public boolean isValid(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(s == null || s.length() == 0)
            return true;
        
        if(s.length() % 2 == 1)
            return false;
        
        Stack<Character> stack = new Stack<Character>();
        HashSet<Character> rightPars = new HashSet<Character>();
        rightPars.add(')');
        rightPars.add('}');
        rightPars.add(']');
        
        char arr[] = s.toCharArray();
        
        for(int i = 0; i < s.length(); i++){
            char c = arr[i];
            if(!rightPars.contains(c)){
                stack.push(c);
            }else{
                if(stack.empty())
                    return false;
                char l = stack.pop();
                if( l != getLeft(c))
                    return false;
            }
        }
        
        if(stack.empty())
            return true;
        else
            return false;
        
        
    }
    
    public char getLeft(char right){
        if(right == ')')
            return '(';
        if(right == '}')
            return '{';
        if(right == ']')
            return '[';
        
        return 'a';
    }
}