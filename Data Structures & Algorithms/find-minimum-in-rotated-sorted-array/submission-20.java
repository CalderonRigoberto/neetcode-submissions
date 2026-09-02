class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        int ans = high;
        while(low < high) {
            int mid = low + (high - low) / 2;

            if(nums[mid] < nums[high]) {
                ans = mid;
                high = mid;
            } else if(nums[mid] > nums[high]) {
                low = mid + 1;
            }
        }

        return nums[ans];
    }
}
