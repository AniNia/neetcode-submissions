class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ans = new HashMap<>();

        for(String s: strs){
            int[] count = new int[26];

            for(char c: s.toCharArray()) count[c - 'a']++;

            String mapKey = Arrays.toString(count); // "e.g. [1, 0, 3, 3]"
            ans.putIfAbsent(mapKey, new ArrayList<>());
            ans.get(mapKey).add(s);
        }

        return new ArrayList<>(ans.values());
    }
}
