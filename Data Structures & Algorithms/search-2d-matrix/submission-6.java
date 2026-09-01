class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0;
        int row = matrix.length;
        int col = matrix[low].length;
        int high = row * col - 1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(matrix[mid / col][mid % col] == target) {
                return true;
            } else if(matrix[mid / col][mid % col] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }
}
