class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for (int i = 0; i < piles.length; i++) {
            max = Math.max(max, piles[i]);
        }

        int l = 1;
        int r = max;
        int eatingSpeed = max;

        while (l <= r) {
            int mid = (l + r) / 2;

            long hoursPassed = 0;
            for (int i = 0; i < piles.length; i++) {
                hoursPassed += (int) Math.ceil((double) piles[i] / mid);
            }

            if (hoursPassed <= h) {
                eatingSpeed = mid;
                r = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }

        return eatingSpeed;
    }
}
