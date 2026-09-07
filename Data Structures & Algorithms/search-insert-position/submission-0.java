class Solution {
    public int searchInsert(int[] nums, int target) {
        /**
            check() => target > nums[mid], low = mid + 1
            high = mid -  1

            return low
        **/

        int low = 0;
        int high = nums.length - 1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(target > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }
}