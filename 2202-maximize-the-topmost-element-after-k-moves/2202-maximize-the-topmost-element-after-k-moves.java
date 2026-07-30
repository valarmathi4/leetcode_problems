class Solution {
    public int maximumTop(int[] nums, int k) {
        int n = nums.length;

        // No moves
        if (k == 0) {
            return nums[0];
        }

        // Only one element
        if (n == 1) {
            if (k % 2 == 1)
                return -1;
            else
                return nums[0];
        }

        int max = -1;

        // Maximum among first k-1 elements
        for (int i = 0; i < Math.min(n, k - 1); i++) {
            max = Math.max(max, nums[i]);
        }

        // If k < n, nums[k] can also be the answer
        if (k < n) {
            max = Math.max(max, nums[k]);
        }

        return max;
    }
}