public class Solution {
    public int[] plusOne(int[] digits) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        int i = 0;
        while(i < digits.length && digits[i] == 9){
            i++;
        }
        
        if(i == digits.length){
            int d[] = new int[digits.length + 1];
            d[0] = 1;
            for(int k = 1; k < d.length; k++){
                d[k] = 0;
            }
            return d;
        }
        
        int carry = 1;
        
        for(i = digits.length - 1; i >= 0; i--){
            if(digits[i] + carry <= 9){
                digits[i] = digits[i] + 1;
                return digits;
            }else{
                digits[i] = 0;
            }
        }
        return null;
    }
}