class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int [] arr = new int[m+n];
        int k = 0;
        int i = 0;
        int j = 0;
        while(i < m && j < n){
            if(nums1[i] <= nums2[j]){
                arr[k++] = nums1[i];
                i++;
            }
            else{
                arr[k++] = nums2[j];
                j++;
            }
        }
        while(i < m){
            arr[k++] = nums1[i];
            i++;
        }
        while(j < n){
            arr[k++] = nums2[j];
            j++;
        }
        int t = arr.length;
        double median = 0.0;
        if(t % 2 != 0){
            median = (double)(arr[t/2]);
        }
        else{
            median = (double)(arr[t/2 -1] + arr[t/2])/2;
        }
        return median;
    }
}
