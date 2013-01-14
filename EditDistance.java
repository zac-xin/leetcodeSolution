public class Solution {
    public int minDistance(String word1, String word2) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int len1 = word1.length();
        int len2 = word2.length();
        
        int dp[][] = new int[len1 + 1][len2 + 1];
        
        dp[0][0] = 0;
        
        for(int i = 1; i <= len2; i++){
            dp[0][i] = i;
        }
        
        for(int i = 1; i <=len1; i++){
            dp[i][0] = i;
        }
        
        for(int i = 1; i <= len1; i++){
            for(int j = 1; j <= len2; j++){
                if(word1.charAt(i - 1) == word2.charAt(j - 1)){
                    dp[i][j] = dp[i - 1][j - 1];
                }else{
                    int min = min(dp[i - 1][j -1], dp[i - 1][j], dp[i][j - 1]);
                    dp[i][j] = min + 1;
                }
            }
        }
        
        return dp[len1][len2];
    }
    
    public int min(int a, int b, int c){
        int d = Math.min(a, b);
        return (int)Math.min(c, d);
    }
}
