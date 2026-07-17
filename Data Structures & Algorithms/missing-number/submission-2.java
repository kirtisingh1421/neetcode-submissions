class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int xor =0;
        int count = 1;
        for(int i=0;i<n;i++){
            xor ^= nums[i];
            xor ^= count;
            count++;
        }
        return xor;
    }
}


// class Solution {
//     public int missingNumber(int[] nums) {
//         int n = nums.length;;
//         int totalsum = n*(n+1)/2;
//         int sum = 0;
//         for(int i=0;i<nums.length;i++){
//             sum += nums[i];
//         }
//         int missing = totalsum - sum;
//         return missing;
//     }
// }
