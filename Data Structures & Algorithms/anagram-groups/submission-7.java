class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            int[] arrCount = new int[26];
            for(char c : chars) {
                arrCount[c - 'a']++; 
            }
            String key = Arrays.toString(arrCount);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
           
        }

        return new ArrayList<>(map.values());
    }
}
