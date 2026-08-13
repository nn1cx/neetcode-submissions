class Solution {
    public boolean hasDuplicate(int[] nums) {
        int[] foundNums = new int[nums.length];
        int indexesChecked = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                foundNums[i] = nums[i];
                indexesChecked++;
            }
            else {
                for (int j = 0; j < indexesChecked; j++) {
                      if (foundNums[j] == nums[i]) {
                        return true;
                    }
                }
                foundNums[i] = nums[i];
                indexesChecked++;
            }
        }

        return false;
    }
}