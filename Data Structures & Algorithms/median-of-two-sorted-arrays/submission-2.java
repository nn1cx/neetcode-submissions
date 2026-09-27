class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int L = 0;
        int R = 0;
        int i = 0;
        int[] array = new int[nums1.length + nums2.length];

        while (L < nums1.length && R < nums2.length) {
            if (nums1[L] <= nums2[R]) {
                array[i] = nums1[L];
                L++;
            }
            else {
                array[i] = nums2[R];
                R++;
            }
            i++;
        }

        while (L < nums1.length) {
            array[i] = nums1[L];
            L++;
            i++;
        }

        while (R < nums2.length) {
            array[i] = nums2[R];
            R++;
            i++;
        }
        
        if (array.length % 2 == 1) {
           return array[array.length / 2]; 
        }
        else {
            int left = 0;
            int right = array.length - 1;
            int middle1 = left + right / 2;
            int middle2 = (left + 1) + right / 2;
            return (array[middle1] + array[middle2]) / 2.0;
        }
    }
}
