class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> counts = new HashMap<>();
        for (char c: s.toCharArray()) {
            int currNum = counts.getOrDefault(c, 0);
            counts.put(c, currNum + 1);
        }

        Map<Character, Integer> counts1 = new HashMap<>();
        for (char c: t.toCharArray()) {
            int currNum = counts1.getOrDefault(c, 0);
            counts1.put(c, currNum + 1);
        }

        return counts.equals(counts1);
    }
}
