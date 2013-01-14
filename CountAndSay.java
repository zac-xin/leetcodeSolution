public class Solution {
    public String countAndSay(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        String number = "1";
        if(n == 1)
            return number;
        StringBuilder sb;
        
        for(int i = 2 ; i <= n; i++){
            sb = new StringBuilder();
            int j = 0;
            while(j < number.length()){
                char c = number.charAt(j);
                int count = 1;
                
                j++;
                
                while(j < number.length() && number.charAt(j) == c){
                    j++;
                    count++;
                }
                
                sb.append(count);
                sb.append(c);
            }
            number = sb.toString();
        }
        return number;
    }
}