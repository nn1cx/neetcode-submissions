class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> valToIndex = new HashMap<>();
        int[] correctNums = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (valToIndex.containsKey(nums[i])) {
                continue;
            }
            valToIndex.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int neededNum = target - nums[i];
            if (valToIndex.containsKey(neededNum)) {
                int[] correctNum = {valToIndex.get(neededNum), i};
                correctNums = correctNum;
            }
        }
        return correctNums;
    }
}
