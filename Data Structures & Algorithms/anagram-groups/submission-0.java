class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> table = new HashMap<>();

        for (String s: strs) {
            int[] count = new int[26];
            for (char c: s.toCharArray()) {
                count[c - 'a'] ++;
            }
            String key = Arrays.toString(count);
            table.putIfAbsent(key, new ArrayList<>());
            table.get(key).add(s);
        }

        return new ArrayList<>(table.values());
    } 
}
