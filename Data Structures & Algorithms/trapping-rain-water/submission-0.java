class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int sum = 0;
        int[] leftmax = new int[n];
        int[] rightmax = new int[n];
        int[] water = new int[n];
        leftmax[0] = height[0];
        for(int i=1;i<=height.length-1;i++){
            leftmax[i] = Math.max(height[i],leftmax[i-1]);
        }
        rightmax[n-1] = height[n-1];
        for(int i =n-2;i>=0;i--){
            rightmax[i] = Math.max(height[i],rightmax[i+1]);
        }
        for(int i=0;i<height.length;i++){
            water[i] = Math.min(leftmax[i],rightmax[i]) - height[i]; 
            sum += water[i];
        }
        return sum;
    }
}
