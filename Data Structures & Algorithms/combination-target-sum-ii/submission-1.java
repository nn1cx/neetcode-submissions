class Solution {
    List<List<Integer>> listOfSums = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> sum = new ArrayList<>();

        Arrays.sort(candidates);
        backtrack(sum, candidates, 0, target, 0);

        return listOfSums;
    }

    private void backtrack(List<Integer> sum, int[] candidates, int total, int target, int i) {
        if (total == target) {
            listOfSums.add(new ArrayList<>(sum));
            return;
        }

        if (total > target || i >= candidates.length) {
            return;
        }

        sum.add(candidates[i]);
        backtrack(sum, candidates, total + candidates[i], target, i + 1);

        sum.remove(sum.size() - 1);
        while (i + 1 < candidates.length && candidates[i] == candidates[i + 1]) {
            i++;
        }
        backtrack(sum, candidates, total, target, i + 1);
    }
}
