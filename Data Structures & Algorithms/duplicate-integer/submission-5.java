class Solution {
    public boolean hasDuplicate(int[] nums) {
        // for(int j = 0;j<nums.length;j++){
        //     for(int i=1;i<nums.length-1;i++){
        //     if(nums[i] > nums[i+1]){
        //         int temp = nums[i];
        //         nums[i] = nums[i+1];
        //         nums[i+1] = temp; 
        //     }
        // }
        // }
        // int i = 0;
        // int j = i+1;
        // while(j < nums.length){
        //     if(nums[i] == nums[j]) return true;
        //     else{
        //         i++;
        //         j++;
        //     }
        // }
        // return false;

        HashSet<Integer> set = new HashSet<>();
        for(int ele : nums) set.add(ele);
        if(nums.length != set.size()) return true;
        else return false;
    }
}