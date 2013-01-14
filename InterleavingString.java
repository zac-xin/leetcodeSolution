public class Solution {
     public boolean isInterleave(String s1, String s2, String s3) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(s1.length() + s2.length() != s3.length()){
            return false;
        }
        
        int l1 = s1.length();
        int l2 = s2.length();
        
        boolean dp[][] = new boolean[l1 + 1][l2 + 1];
        dp[0][0] = true;
        
        for(int i = 1; i <= l2; i++){
            if(dp[0][i - 1] == true && s2.charAt(i - 1) == s3.charAt(i - 1)){
                dp[0][i] = true;
            }
        }
        
        for(int i = 1; i <= l1; i++){
            if(dp[i - 1][0] == true && s1.charAt(i - 1) == s3.charAt(i - 1)){
                dp[i][0] = true;
            }
        }
        
        //printArray(dp);
        
        for(int i = 1; i <= l1; i++){
            for(int j = 1; j <= l2; j++){
                if(dp[i-1][j] == true && s1.charAt(i - 1) == s3.charAt(i + j - 1)){
                    dp[i][j] = true;
                }
                
                if(dp[i][j-1] == true && s2.charAt(j - 1) == s3.charAt(i + j -1)){
                    dp[i][j] =true;
                }
               // System.out.println("i = " + i + ", j=" + j);
            }
        }
        
        return dp[l1][l2];
    }
}