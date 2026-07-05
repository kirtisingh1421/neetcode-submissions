class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j = i+1;
        while(j <= nums.length-1){
            if(nums[i] != nums[j]){
                i++;
                j++;
            }
            else{
                return nums[i];
            }
        }
        return nums[i];
    }
}
