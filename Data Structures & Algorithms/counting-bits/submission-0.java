class Solution {
    public int[] countBits(int n) {
        int [] arr = new int[n+1];
        int k = 0;
        for(int i=0;i<=n;i++){
            int count= 0;
            for(int j=0;j<31;j++){
                if((i>>j) %2 ==1) count++;
            }
            arr[k++] = count;
        }
        return arr;
    }
}
