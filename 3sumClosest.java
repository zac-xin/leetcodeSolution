public class Solution {
    public int threeSumClosest(int[] num, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        Arrays.sort(num);
        int diff = Integer.MAX_VALUE;
        int closest = Integer.MAX_VALUE;
        
        for(int i =  0; i < num.length - 2; i++){
            int k = i + 1;
            int t = num.length - 1;
            
            while( k < t){
                if(num[i] + num[k] + num[t] == target){
                    return target;            
                }else if(num[i] + num[k] + num[t] < target){
                    int curDiff = target - num[i] - num[k] - num[t];
                    if(curDiff < diff){
                        closest = num[i] + num[k] + num[t];
                        diff = curDiff;
                    }
                    k++;
                }else{
                    int curDiff = num[i] + num[k] + num[t] - target;
                    if(curDiff < diff){
                        closest = num[i] + num[k] + num[t];
                        diff = curDiff;
                    }
                    t--;
                }
            }
        }
        return closest;   
    }
}