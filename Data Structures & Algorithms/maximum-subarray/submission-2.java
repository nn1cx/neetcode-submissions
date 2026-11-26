class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int[] runningSum = new int[nums.length];
        runningSum[0] = nums[0];
        int maxSum = runningSum[0];

        for (int i = 1; i < runningSum.length; i++) {
            if (runningSum[i - 1] < 0) {
                runningSum[i] = nums[i];
            }
            else {
                runningSum[i] = nums[i] + runningSum[i - 1];
            }
            
            if (maxSum < runningSum[i]) {
                maxSum = runningSum[i];
            }
        }

        return maxSum;
    }
}
