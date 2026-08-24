class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length;

        while (l < r) {
            int middle = (r + l) / 2;
            if (nums[middle] == target) {
                return middle;
            }
            else {
                if (nums[middle] < target) {
                    l = middle + 1;
                }
                else {
                    r  = middle;
                }
            }
        }

        return -1;
    }
}
