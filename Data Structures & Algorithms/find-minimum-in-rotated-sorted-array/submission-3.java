class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int l = 0;
        int h = n-1;
        int min = nums[0];
        while(l <= h){
            int mid = l+(h-l)/2;
            if(nums[l] <= nums[mid]){
                min = Math.min(min,nums[l]);
                l = mid+1;
            }
            else if(nums[mid] <= nums[h]){
                min = Math.min(min,nums[mid]);
                h = mid;
            }
        }
        return min;
    }
}
