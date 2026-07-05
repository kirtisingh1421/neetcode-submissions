class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int l = 0;
        int h = row*col-1;
        while(l <= h){
            int mid = l+(h-l)/2;
            int midrow = mid / col;
            int midcol = mid % col;
            if(matrix[midrow][midcol] > target) h = mid-1;
            else if(matrix[midrow][midcol] < target) l = mid+1;
            else if(matrix[midrow][midcol] == target) return true;
        }
        return false;
    }
}
