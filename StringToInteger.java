public class Solution {
    public int atoi(String str) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(str == null)
            return 0;
        
        char arr[] = str.toCharArray();
        
        int i = 0;
        
        while(i < str.length() && arr[i] == ' '){
            i++;
        }
        
        if(i == str.length()){
            return 0;
        }
        
        boolean positive = true;
        
        if(arr[i] == '-'){
            positive = false;
        }
        
        if(arr[i] == '-' || arr[i] == '+'){
            i++;
        }
        
        long num = 0;
        
        if(arr[i] < '0' || arr[i] > '9')
            return 0;
            
        for( ; i < str.length(); i++){
            if(arr[i] >= '0' && arr[i] <= '9'){
                num = num * 10 + arr[i] - '0';
                if(positive){
                    if(num > Integer.MAX_VALUE)
                        return Integer.MAX_VALUE;
                }
                else{
                    if(-num < Integer.MIN_VALUE){
                        return Integer.MIN_VALUE;
                    }
                }
                        
            }else{
                break;
            }
        }
        
        if(positive)
            return (int)num;
        else
            return -(int)num;
    }
}