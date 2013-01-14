public class Solution {
    public int numDistinct(String S, String T) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(S.length() < T.length()){
            return 0;
        }
        
        int lens = S.length();
        int lent = T.length();
        
        int[][] dp = new int[lent + 1][lens + 1];
        
        dp[0][0] = 1;
        
        for(int i = 1; i <= lent; i++){
            dp[i][0] = 0;
        }
        
        for(int i = 1; i <= lens; i++){
            dp[0][i] = 0;
        }
        
        for(int i = 1; i <= lent; i++){
            for(int j = 1; j <= lens; j++){
                if(T.charAt(i - 1) == S.charAt(j - 1)){
                    for(int k = 0; k < j; k++){
                        dp[i][j] += dp[i - 1][k];
                    }
                }else{
                    dp[i][j] = 0;
                }
            }
        }
        
        int sum = 0;
        for(int i = 0; i <= lens; i++){
            sum += dp[lent][i];
        }
        
        return sum;
    }
}