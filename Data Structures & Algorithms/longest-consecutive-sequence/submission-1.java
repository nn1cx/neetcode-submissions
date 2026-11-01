class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();
        for (int num: nums) {
            numbers.add(num);
        }

        int longest = 0;
        for (int num: numbers) {
            if (!numbers.contains(num - 1)) {
                int length = 1;
                while (numbers.contains(num + length)) {
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}
