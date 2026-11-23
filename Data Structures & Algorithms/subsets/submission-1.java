class Solution {
    List<List<Integer>> listOfSets = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> set = new ArrayList<>();

        backtrack(set, nums, 0);
        return listOfSets;
    }

    private void backtrack(List<Integer> set, int[] nums, int index) {
        if (index >= nums.length) {
            listOfSets.add(new ArrayList<>(set));
            return;
        }

        set.add(nums[index]);
        backtrack(set, nums, index + 1);
        set.remove(set.size() - 1);
        backtrack(set, nums, index + 1);
    }
}
