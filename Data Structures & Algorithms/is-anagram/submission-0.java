class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
    

        char chr1[] = s.toCharArray();
        char chr2[] = t.toCharArray();

        Map<Character,Integer> map1 = countCharacter(chr1);
        Map<Character,Integer> map2 = countCharacter(chr2);
        return map1.equals(map2);
    }

    public Map<Character,Integer> countCharacter(char chr[]){
        Map<Character,Integer> map = new HashMap<>();
        for(Character s:chr){
            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            } else{
                map.put(s,1);
            }
        }
        return map;
    }
}
