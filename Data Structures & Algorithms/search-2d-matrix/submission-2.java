class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean isFound = false;
        
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(target == matrix[i][j]) {
                    isFound = true;
                    break;
                }
            }
        }

        return isFound;
    }
}
