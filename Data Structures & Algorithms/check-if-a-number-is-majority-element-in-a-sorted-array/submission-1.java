class Solution {
    public boolean isMajorityElement(int[] nums, int target) {
        int firstIndex = firstIndex(nums, target);
        int lastIndex = lastIndex(nums, target);
        return (lastIndex - firstIndex) > nums.length / 2;
    }


    public static int firstIndex(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int ans = nums.length;
        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(nums[mid] >= target){
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }        
        }

        return ans;
    }


    public static int lastIndex(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int ans = nums.length;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(nums[mid] > target){
                high = mid - 1;
            } else {
                low = mid + 1;
            }        
        }

        return low;
    }
}
