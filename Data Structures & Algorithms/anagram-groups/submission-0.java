class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //Approach 1 - Iterate each string sort and group
        Map<String,List<String>> map = new HashMap<>();
        
        for(String str:strs){
            char[] chr = str.toCharArray();
            Arrays.sort(chr);
            if(map.containsKey(new String(chr))){
                map.put(new String(chr),map.get(new String(chr))).add(str);
            } else{
                map.put(new String(chr),new ArrayList<>(Arrays.asList(str)));
            }
        }
        return new ArrayList<>(map.values());
    }
}
