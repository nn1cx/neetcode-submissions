class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
    int maxCount = 0;
    int tempCount = 0;

    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 1) {
            tempCount++;
        }
        else {
            tempCount = 0;
        }

        if (tempCount > maxCount) {
            maxCount = tempCount;
        }
    }

    return maxCount;
    }
}