import java.util.Stack;

public class Solution {
    public int largestRectangleArea(int[] height) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int i = 0;
        int max = 0;
        Stack<Pair> stack = new Stack<Pair>();
        
        while(i < height.length){
            
            if(stack.empty() || stack.peek().height < height[i]){
                stack.push(new Pair(height[i], i));
            }else if(stack.peek().height > height[i]){
                int pre = 0;
                
                while(!stack.empty() && stack.peek().height > height[i]){
                    Pair e = stack.pop();
                    pre = e.index;
                    //对递增的的部分进行计算
                    //保持递增有利于计算
                    // e.height * (i - e.index) 就能算出所有的rectangle
                    max = Math.max(max, e.height * (i - e.index));
                }
                //从pre到i, height设置为height[i]
                stack.push(new Pair(height[i], pre));
            }
            
            i++;
        }
        
        // calculate the remaining ascending elements.
        while(!stack.empty()){
            Pair e = stack.pop();
            max = Math.max(max, e.height * (i - e.index));
        }
        
        return max;
    }
}

class Pair{
    int height;
    int index;
    public Pair(int h, int i){
        height = h;
        index = i;
    }
}