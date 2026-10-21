class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ret = new int[nums.length];
        int[] L = new int[nums.length];
        int[] R = new int [nums.length];

        for (int i = 0; i < L.length; i++) {
            if (i == 0) {
                L[i] = 1;
            }
            else {
                L[i] = nums[i-1] * L[i-1];
            }
        }

        for (int i = R.length - 1; i >= 0; i--) {
            if (i == R.length - 1) {
                R[i] = 1;
            }
            else {
                R[i] = R[i+1] * nums[i+1];
            }
        }

        for (int i = 0; i < ret.length; i++) {
            ret[i] = L[i] * R[i];
        }

        return ret;
    }
}  
