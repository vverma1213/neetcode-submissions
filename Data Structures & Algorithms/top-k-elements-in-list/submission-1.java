class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int num:nums){ //O(n)
            map.put(num,map.getOrDefault(num,0)+1);
        }

        List<Integer> list = map.entrySet()
                                .stream()
                                .sorted(Comparator.comparing(Map.Entry::getValue,Comparator.reverseOrder())) //KLogK
                                .limit(k)
                                .map(Map.Entry::getKey)
                                .collect(Collectors.toList());
         return list.stream().mapToInt(Integer::intValue).toArray();                       
    }
}

//Time Complexity O(NLogK)
//Space Complexity O(n)