class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> valToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            valToIndex.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int neededNum = target - nums[i];
            if (valToIndex.containsKey(neededNum) && valToIndex.get(neededNum) != i) {
                return new int[]{i, valToIndex.get(neededNum)};
            }
        }

        return new int[0];
    }
}
