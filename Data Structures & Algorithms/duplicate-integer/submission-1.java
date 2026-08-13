class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            boolean numAdded = seen.add(nums[i]);
            if (!numAdded) {
                return true;
            }
        } 
        return false;      
    }
}