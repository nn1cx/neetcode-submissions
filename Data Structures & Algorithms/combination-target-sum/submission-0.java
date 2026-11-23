class Solution {
    List<List<Integer>> listOfSums;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        listOfSums = new ArrayList<>();
        List<Integer> currentSum = new ArrayList<>();

        backtrack(nums, target, currentSum, 0);
        return listOfSums;
    }

    private void backtrack(int[] nums, int target, List<Integer> currentSum, int i) {
        if (target == 0) {
            listOfSums.add(new ArrayList(currentSum));
            return;
        }

        if (target < 0 || i >= nums.length) {
            return;
        }

        currentSum.add(nums[i]);
        backtrack(nums, target - nums[i], currentSum, i);
        currentSum.remove(currentSum.size() - 1);
        backtrack(nums, target, currentSum, i + 1);
    }

}
