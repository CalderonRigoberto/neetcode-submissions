class Solution {
    public boolean isMajorityElement(int[] nums, int target) {
        int n = nums.length;
        int first = firstIndex(nums, target);

        // Si no existe, o si no hay suficiente espacio para que aparezca > n/2 veces
        if (first == -1 || first + n / 2 >= n) {
            return false;
        }

        // Basta verificar si el elemento a una distancia n/2 sigue siendo target
        return nums[first + n / 2] == target;
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
