class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int [] arr = new int[n-k+1];
        int j = 0;
        for(int start=0;start<=n-k;start++){
            int maximum = nums[start];
            for(int t = start;t<start+k;t++){
                maximum = Math.max(maximum,nums[t]);
            }
            arr[j++] = maximum;
        }
        return arr;
    }
}
