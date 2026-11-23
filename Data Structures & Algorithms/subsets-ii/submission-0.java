class Solution {
    List<List<Integer>> listOfSets;

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        listOfSets = new ArrayList<>();
        List<Integer> set = new ArrayList<>();

        Arrays.sort(nums);
        backtrack(nums, set, 0);

        return listOfSets;
    }

    private void backtrack(int[] nums, List<Integer> set, int index) {
        if (index >= nums.length) {
            listOfSets.add(new ArrayList<>(set));
            return;
        }

        set.add(nums[index]);
        backtrack(nums, set, index + 1);

        set.remove(set.size() - 1);
        while (index + 1 < nums.length && nums[index] == nums[index + 1]) {
            index++;
        }
        backtrack(nums, set, index + 1);
    }
}

