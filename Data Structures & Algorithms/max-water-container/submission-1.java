class Solution {
    public int maxArea(int[] heights) {
        int max= 0;
        int i =0;
        int j = heights.length-1;
        while(i<j){
            int l = Math.min(heights[i],heights[j]);
            int b = j-i;
            int area = l * b;
            max = Math.max(area,max);
            if(heights[i] < heights[j]) i++;
            else j--;
        }
        return max;
    }
}
