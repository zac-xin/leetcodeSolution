public class Solution {
    public ArrayList<String> restoreIpAddresses(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        String arr[] = new String[4];
        ArrayList<String> result = new ArrayList<String>();
        helper(s, arr, 0, result);
        return result;
    }
    
    public void helper(String s, String arr[], int i, ArrayList<String> result){
        int minLength = 4 - i;
        int maxLength = (4 - i) * 3;
        
        if(s.length() < minLength || s.length() > maxLength){
            return;
        }
        
        for(int k = 1; k <= 3 && k <= s.length(); k++){
            String current = s.substring(0, k);
            if(current.length() >= 2 && current.charAt(0) == '0'){
                continue;
            }
            int m = Integer.parseInt(current);
            if(m >= 0 && m <= 255){
                arr[i] = current;
                // if we reach the 4th part, we must exhaust all the remaining string
                if(i == 3 && current.length() == s.length()){
                    StringBuilder sb = new StringBuilder();
                    for(int j = 0; j < arr.length; j++){
                        sb.append(arr[j]);
                        sb.append('.');
                    }
                    String r = sb.toString();
                    result.add(r.substring(0, r.length() - 1));
                }else if(i < 3){
                    helper(s.substring(k), arr, i + 1, result);
                }
            }
        }
    }
}