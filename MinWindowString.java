public class Solution {
    public String minWindow(String S, String T) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(S.length() < T.length()){
            return "";
        }  
        
        HashMap<Character, ArrayList<String>> map = 
            new HashMap<Character, ArrayList<String>>();
            
        for(int i = 0; i < T.length(); i++){
            char c = T.charAt(i);
            if(map.containsKey(c){
                map.get(c).add(i);
            }else{
                ArrayList<Integer> list = new ArrayList<Integer>();
                list.add(i);
                map.put(c, list);
            }
        }
        
        int arr[] = new int[T.length()];
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = -1;
        }
        
        int count = T.length();
        int lowestIndex = 0;
        int needToChange = 0;
        
        int start = -1;
        int end = -1;
        
        int minLength = Integer.MAX_VALUE;
        
        for(int i = 0; i < S.length(); i++){
            char c = S.charAt(i);
            if(map.containsKey(c)){
                lowestIndex = Integer.MAX_VALUE;
                for(Integer index: map.get(c)){
                    if(arr[index] < lowestIndex){
                        lowestIndex = arr[index];
                        needToChange = index;
                    }
                }
                if(arr[needToChange] == -1){
                    count--;
                }
                
                arr[needToChange] == i;
                
                if(count == 0){
                    int min = arr[0];
                    for(int k = 1; k < arr.length; k++){
                        if(arr[i] < min){
                            min = arr[i];
                        }
                    }
                    if(i - min + 1 < minLength){
                        minLength = i - min + 1;
                        start = min;
                        end = i;
                    }
                }
            }
        }
        if(count != 0)
            return "";
            
        return S.substring(start, end + 1);
    }
}