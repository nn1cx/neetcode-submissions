class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        int[] bestNumber = new int[nums.length];

        for (int i = 0; i < bestNumber.length; i++) {
            if (i == 0) {
                bestNumber[i] = nums[i];
            }
            else if (i == 1) {
                bestNumber[i] = Math.max(nums[i], bestNumber[i - 1]);
            }
            else {
               bestNumber[i] = Math.max(bestNumber[i - 1], nums[i] + bestNumber[i - 2]); 
            }
            System.out.print(bestNumber[i] + " ");     
        }

        return bestNumber[bestNumber.length - 1];
    }
}
