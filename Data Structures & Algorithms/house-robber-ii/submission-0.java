class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        int leftMax = robSubset(Arrays.copyOfRange(nums, 0, nums.length - 1));
        int rightMax = robSubset(Arrays.copyOfRange(nums, 1, nums.length));

        return Math.max(leftMax, rightMax);
    }

    private int robSubset(int[] nums) {
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        int[] bestMoves = new int[nums.length];

        for (int i = 0; i < bestMoves.length; i++) {
            if (i == 0) {
                bestMoves[i] = nums[i];
            }
            else if (i == 1) {
                bestMoves[i] = Math.max(bestMoves[i - 1], nums[i]);
            }
            else {
                bestMoves[i] = Math.max(bestMoves[i - 1], nums[i] + bestMoves[i - 2]);
            }
        }

        return bestMoves[bestMoves.length - 1];
    }
}
