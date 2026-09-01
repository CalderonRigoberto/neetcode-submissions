class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Arrays.stream(piles).max().getAsInt();

        int ans = high;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(canEat(piles, mid, h)) {
                ans = mid;
                high = mid - 1;        
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    private static boolean canEat(int[] piles, int k, int h) {
        long sum = 0;
        for(int pile : piles) {
            sum += Math.ceil((double) pile / k);
        }

        return sum <= h;
    }
}
