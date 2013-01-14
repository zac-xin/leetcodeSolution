/*
http://tianrunhe.wordpress.com/2012/07/13/container-with-most-water/
	typo in the post: decrease j when ai >= aj 

*/
public class Solution {
    public int maxArea(int[] height) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int left = 0;
        int right = height.length - 1;
        int max = Math.min(height[left], height[right]) * (right - left);
        
        if(height[left] < height[right])
            left++;
        else
            right--;
        
        while(left < right){
            int area = Math.min(height[left], height[right]) * (right - left);
            if(area > max)
                max = area;
            
            if(height[left] < height[right])
                left++;
            else
                right--;
        }
        return max;
    }
}