public class Solution {
    public ArrayList<String> anagrams(String[] strs) {
        // Start typing your Java solution below
        // DO NOT write main() function
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        
        ArrayList<String> result = new ArrayList<String>();
        
        if(strs.length < 2)
            return result;
        
        for(int i = 0 ; i < strs.length; i++){
            String s = strs[i];
            char arr[] = s.toCharArray();
            Arrays.sort(arr);
            String t = new String(arr);
            if(!map.containsKey(t)){
                ArrayList<String> list = new ArrayList<String>();
                list.add(s);
                map.put(t, list);
            }else{
                map.get(t).add(s);
            }
        }
        
        for(String str : map.keySet()){
            if(map.get(str).size() > 1){
                for(String v : map.get(str)){
                    result.add(v);
                }
            }
        }
        return result;
        
    }
}