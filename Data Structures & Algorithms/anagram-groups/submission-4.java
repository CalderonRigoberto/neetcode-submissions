class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            var result = map.getOrDefault(sorted, new ArrayList<>());
            result.add(str);
            map.put(sorted, result);
        }

        return new ArrayList<>(map.values());
    }
}
